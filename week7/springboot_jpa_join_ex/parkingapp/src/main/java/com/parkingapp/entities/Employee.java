package com.parkingapp.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;


public class Employee  {

    private int empId;
    private String empName;

     private Parking parking;

}













