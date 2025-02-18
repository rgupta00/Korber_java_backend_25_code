package com.parkingapp.repo;

import com.parkingapp.entities.Employee;
import com.parkingapp.entities.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    public Optional<Parking> findByParkingParkingId(int partingId);
}
