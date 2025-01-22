package com.empapp.embedded;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

//how hib come to know about this class
//actually hibernate manage the life cycle of object
//entity -> pojo with @Enitity @Id
@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employee_table_embedded")
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


    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="city", column= @Column(name="home_city")),
            @AttributeOverride(name="address", column= @Column(name="home_address"))
    })
    private Address homeAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="city", column= @Column(name="office_city")),
            @AttributeOverride(name="address", column= @Column(name="office_address"))
    })
    private Address officeAddress;

    public Employee(String name, double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }


}
