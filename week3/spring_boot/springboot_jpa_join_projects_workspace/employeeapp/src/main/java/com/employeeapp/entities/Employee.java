package com.employeeapp.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor

@ToString(exclude = {"department"})
@Entity
@Table(name = "e_table")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String name;
	private double salary;

	//@JsonIgnore
	@JsonBackReference
	@JoinColumn(name = "did_fk")
	@ManyToOne
	private Department department;

	public Employee(String name, double salary, Department department) {
		this.name = name;
		this.salary = salary;
		this.department=department;
	}
}