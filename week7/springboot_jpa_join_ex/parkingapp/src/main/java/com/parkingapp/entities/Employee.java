package com.parkingapp.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;

@Data
@ToString(exclude = "parking")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee_table")
public class Employee  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String empName;

    @OneToOne
    @JoinColumn(name = "pid_fk")
    private Parking parking;

}













