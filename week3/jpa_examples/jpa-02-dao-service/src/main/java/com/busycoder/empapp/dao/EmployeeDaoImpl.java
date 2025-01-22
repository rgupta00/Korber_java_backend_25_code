package com.busycoder.empapp.dao;

import com.busycoder.empapp.entities.Employee;
import com.busycoder.empapp.exceptions.EmployeeNotFoundException;
import com.busycoder.empapp.util.EntityManagerFactoryUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    private EntityManagerFactory emf;

    public EmployeeDaoImpl(){
        emf= EntityManagerFactoryUtil.getEmf();
    }
    @Override
    public List<Employee> getAll() {
        EntityManager em=emf.createEntityManager();
        List<Employee> allEmployees=em.createQuery("select e from Employee e", Employee.class).getResultList();
        em.close();
        return allEmployees;
    }

    @Override
    public Employee findById(int id) {
        EntityManager em=emf.createEntityManager();
        Employee employee=em.find(Employee.class, id);
        if(employee==null){
            throw  new EmployeeNotFoundException("employee with id "+ id +" is not found");
        }
        em.close();
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        try{
            tx.begin();
            em.persist(employee);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        em.close();
        return employee;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee employeeToUpdate= findById(id);
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        try{
            tx.begin();
            employee.setSalary(employeeToUpdate.getSalary());
            employee.setDept(employeeToUpdate.getDept());
            em.merge(employee);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        em.close();
        return employee;
    }

    @Override
    public Employee deleteById(int id) {
        Employee employeeToDelete= findById(id);
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        try{
            tx.begin();
            em.remove(employeeToDelete);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        em.close();
        return employeeToDelete;
    }
}
