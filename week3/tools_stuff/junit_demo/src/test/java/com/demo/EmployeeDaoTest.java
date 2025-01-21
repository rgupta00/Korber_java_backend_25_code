package com.demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeDaoTest {

    private EmployeeDao employeeDao;

    @BeforeEach
    public void before(){
        employeeDao=new EmployeeDao();
    }


    @Order(value = 1)
    @Test
    @Tag(value = "test")
    void addTest() {
        employeeDao.add();
    }

    @Tag(value = "prod")
    @EnabledOnJre(JRE.JAVA_17)
    @Order(value = 2)
    @Test
    void getAllTest() {
        employeeDao.getAll();
    }

    @Disabled
    @Order(value = 4)
    @Test
    void deleteTest() {
        employeeDao.delete(3);
    }
    @Disabled
    @Order(value = 3)
    @Test
    void updateTest() {
        employeeDao.update(1, new Employee());
    }


    @AfterEach
    public void after(){
        employeeDao=null;
    }
}