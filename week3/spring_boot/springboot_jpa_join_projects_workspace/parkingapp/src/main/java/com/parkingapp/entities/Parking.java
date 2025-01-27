package com.parkingapp.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "parking_table")
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int parkingId;
    private String parkingLocation;
    @JoinColumn(name = "eid_fk")
    @OneToOne
    private Employee employee;
}
