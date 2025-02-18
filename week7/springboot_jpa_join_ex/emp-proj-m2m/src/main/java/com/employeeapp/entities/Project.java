package com.employeeapp.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {
	private int pid;
	private String pname;
	private String manager;
	private LocalDate startDate;
	
	private List<Employee> employees=new ArrayList<>();
}
