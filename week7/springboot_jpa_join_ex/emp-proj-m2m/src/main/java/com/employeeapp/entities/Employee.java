package com.employeeapp.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

public class Employee {
	private int eid;
	private String name;
	private double salary;

	private List<Project> projects=new ArrayList<>();
}