package com.empapp.embedded;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString

@Embeddable
public class Address {

    //No @Id
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "address", nullable = false)
    private String address;

    public Address(String city, String address) {
        this.city = city;
        this.address = address;
    }
}
