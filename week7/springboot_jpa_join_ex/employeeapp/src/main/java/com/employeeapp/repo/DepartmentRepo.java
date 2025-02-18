package com.employeeapp.repo;

import com.employeeapp.dto.DeptEmpResponse;
import com.employeeapp.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
//    @Query("select new com.employeeapp.dto.DeptEmpResponse(e.name, e.salary, d.dname) from Department d inner join d.employees e")
//    List<DeptEmpResponse> deptEmployeeData();
}















