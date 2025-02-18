package com.parkingapp.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Parking {

    private int parkingId;
    private String parkingLocation;

    private Employee employee;
}
