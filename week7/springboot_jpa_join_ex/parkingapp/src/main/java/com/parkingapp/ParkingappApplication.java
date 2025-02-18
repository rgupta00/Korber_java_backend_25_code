package com.parkingapp;

import com.parkingapp.entities.Employee;
import com.parkingapp.entities.Parking;
import com.parkingapp.repo.EmployeeRepo;
import com.parkingapp.repo.ParkingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ParkingappApplication {

	@Autowired
	private ParkingRepo parkingRepo;
//
	@Autowired
	private EmployeeRepo employeeRepo;

	public static void main(String[] args) {

		SpringApplication.run(ParkingappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return  args->  {
			//
//			Employee employe=new Employee();
//			employe.setEmpName("sumit");
//
//			Parking parking=new Parking();
//			parking.setParkingLocation("E31");
//
//			parking.setEmployee(employe);
//			employe.setParking(parking);
//
//			employeeRepo.save(employe);
		//	parkingRepo.save(parking);

		};
	}
}




