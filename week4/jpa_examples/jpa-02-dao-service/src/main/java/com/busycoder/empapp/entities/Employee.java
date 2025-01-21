package com.busycoder.empapp.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//how hib come to know about this class
//actually hibernate manage the life cycle of object
//entity -> pojo with @Enitity @Id
@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employee_table_jpa")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eid")
    private int id;
    @Column(name = "ename", nullable = false)
    private String name;
    @Column(name = "salary", nullable = false)
    private double salary;

    @Column(name = "dept", nullable = false)
    private String dept;


    public Employee(String name, double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }


}
