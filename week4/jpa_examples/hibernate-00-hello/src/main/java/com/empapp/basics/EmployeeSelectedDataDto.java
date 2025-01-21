package com.empapp.basics;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//how hib come to know about this class
//actually hibernate manage the life cycle of object
//entity -> pojo with @Enitity @Id
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeSelectedDataDto {
    private String name;
    private double salary;
}
