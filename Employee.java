package com.edubridge.mySpring;



public class Employee {

	private int empId;
	private String name;
	private String mobNo;
	private Address address;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String name, String mobNo, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.mobNo = mobNo;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", mobNo=" + mobNo + ", address=" + address + "]";
	}

}
