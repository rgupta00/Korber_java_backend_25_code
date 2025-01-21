package com.empapp.service;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.impl.EmployeeDaoHibImpl;
import com.empapp.dao.impl.EmployeeDaoJdbcImpl;
import com.empapp.exceptions.EmployeeNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
//service layer is pulling dao layer : couplling bw the code
//spring : service layer will get push of dao layer, spring will handle the coupling
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;
    private Logger logger= LoggerFactory.getLogger(EmployeeServiceImpl.class);

    public EmployeeServiceImpl(){
        employeeDao=new EmployeeDaoJdbcImpl();
    }
    @Override
    public List<Employee> allEmp() {
        long start=System.currentTimeMillis();
        List<Employee> employees= employeeDao.allEmp();
        long end=System.currentTimeMillis();
        logger.info("Time taken to get all employees "+(end-start)+" ms");
        return employees;
    }

    @Override
    public Employee getEmpById(int id) {
        Employee employee= employeeDao.getEmpById(id);
        if(employee!=null)
            return employee;
        else
            throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public Employee addEmp(Employee employee) {
        return employeeDao.addEmp(employee);
    }

    @Override
    public void updateEmp(int id, Employee employee) {
        employeeDao.updateEmp(id, employee);
    }

    @Override
    public void deleteEmp(int id) {
        employeeDao.deleteEmp(id);
    }
}
