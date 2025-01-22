package com.demo.one2one.uni;

import jakarta.persistence.*;
@Entity
@Table(name = "parking_table")
public class Parking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partingId;
	private String parkingLocation;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "emp_id_fk")
	private Employee employee;

	public Parking(String parkingLocation) {
		this.parkingLocation = parkingLocation;
	}

	public Parking() {
	}

	public int getPartingId() {
		return partingId;
	}

	public void setPartingId(int partingId) {
		this.partingId = partingId;
	}

	public String getParkingLocation() {
		return parkingLocation;
	}

	public void setParkingLocation(String parkingLocation) {
		this.parkingLocation = parkingLocation;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Parking [partingId=" + partingId + ", parkingLocation=" + parkingLocation + "]";
	}
	
	

}
