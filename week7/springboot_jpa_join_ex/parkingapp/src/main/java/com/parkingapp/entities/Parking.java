package com.parkingapp.entities;

import jakarta.persistence.*;
import lombok.*;


@Data
@ToString(exclude = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="parking_table")
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int parkingId;

    private String parkingLocation;

    @OneToOne(mappedBy = "parking", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Employee employee;
}
