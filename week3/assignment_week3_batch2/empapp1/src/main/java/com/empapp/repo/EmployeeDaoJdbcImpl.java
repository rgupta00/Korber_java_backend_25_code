package com.empapp.repo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class EmployeeDaoJdbcImpl implements EmployeeDao {

	private static Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
	private static int counter = 0;
	static {
		empMap.put(++counter, new Employee(counter, "Raj", "IT" ,600000));
		empMap.put(++counter, new Employee(counter, "Ekta", "IT" ,500000));
	}

	@Override
	public List<Employee> getAllEmployees() {
		System.out.println("jdbc code");
		return new ArrayList<Employee>(empMap.values());
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employee.setId(++counter);
		empMap.put(counter, employee);
		return empMap.get(counter);
	}

	@Override
	public void deleteEmployee(int id) {
		empMap.remove(id);
	}

	@Override
	public void updateEmployee (int id, Employee employee) {
		empMap.put(id, employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		return empMap.get(id);
	}

}