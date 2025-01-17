package com.productapp.model.dao;

import com.productapp.exceptions.ProductNotFoundExcption;
import com.productapp.model.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Primary
public class ProductDaoImpl implements ProductDao{

    private SessionFactory sessionFactory;

    @Autowired
    public ProductDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public List<Product> getAll() {
        return getSession()
                .createQuery("select p from Product p", Product.class)
                .getResultList();
    }

    @Override
    public Product addProduct(Product product) {
        getSession().persist(product);
        return product;
    }

    @Override
    public void updateProduct(int productId, Product product) {
        Product productToUpdate= getProductById(productId);
        productToUpdate.setPrice(product.getPrice());
        getSession().merge(productToUpdate);
    }

    @Override
    public void deleteProduct(int productId) {
        Product productToDelete= getProductById(productId);
        getSession().delete(productToDelete);
    }

    @Override
    public Product getProductById(int productId) {
        Product product=getSession().get(Product.class, productId);
        if(product==null) {
            throw new ProductNotFoundExcption("product with id : "+ productId+" is not found");
        }
        return product;
    }
}
