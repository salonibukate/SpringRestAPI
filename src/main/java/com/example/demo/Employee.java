package com.demo;

import jakarta.persistence.*;

@Entity
@Table
public class Employee {
	@Id
	String efirstname;
	String elastname;
	String edepartment;
	public String getEfirstname() {
		return efirstname;
	}
	public void setEfirstname(String efirstname) {
		this.efirstname = efirstname;
	}
	public String getElastname() {
		return elastname;
	}
	public void setElastname(String elastname) {
		this.elastname = elastname;
	}
	public String getEdepartment() {
		return edepartment;
	}
	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}
	public Employee(String efirstname, String elastname, String edepartment) {
		super();
		this.efirstname = efirstname;
		this.elastname = elastname;
		this.edepartment = edepartment;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [efirstname=" + efirstname + ", elastname=" + elastname + ", edepartment=" + edepartment + "]";
	}


}
