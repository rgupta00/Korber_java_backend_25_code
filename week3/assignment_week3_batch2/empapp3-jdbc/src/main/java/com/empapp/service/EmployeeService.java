package com.empapp.service;

import com.empapp.repo.Employee;

import java.util.List;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee addEmployee (Employee employee);
	public void deleteEmployee (int id);
	public void updateEmployee (int id, Employee employee);
	public Employee getEmployeeById(int id);
}
