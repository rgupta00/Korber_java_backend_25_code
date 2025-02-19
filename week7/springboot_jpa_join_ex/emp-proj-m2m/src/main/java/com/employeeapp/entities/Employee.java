package com.employeeapp.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"projects"})

@Entity
@Table(name="e_table")
public class Employee {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String name;
	private double salary;
	@ManyToMany(mappedBy = "employees", cascade = CascadeType.ALL)
	private List<Project> projects=new ArrayList<>();

	public Employee(String name,double salary) {
		this.salary = salary;
		this.name = name;
		this.eid = eid;
	}
}