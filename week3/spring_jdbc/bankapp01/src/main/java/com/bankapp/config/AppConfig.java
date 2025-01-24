package com.bankapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.bankapp")
@EnableAspectJAutoProxy
@PropertySource(value = "classpath:db.properties")
@EnableTransactionManagement //hey spring rather then i will start: u do it //@Transactional
public class AppConfig {

    @Value("${jdbc.driver}")
    private String driver;

    @Value(("${jdbc.url}"))
    private String url;

    @Value(("${jdbc.username}"))
    private String username;

    @Value(("${jdbc.password}"))
    private String password;

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }
    //i need to define a bean for tx mgt
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager=new DataSourceTransactionManager(dataSource);
        return transactionManager;
    }

    // i need to define a bean for JdbcTemplate
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}
