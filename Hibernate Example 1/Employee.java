package com.jsp.hibernate_first;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
	
int empid;
String name;
int sal;
long phono;
String email;
public Employee(int empid,String name, int sal, long phono, String email) {
	
		// TODO Auto-generated constructor stub
	    this.empid =empid;
	    this.name=name;
	    this.sal=sal;
	    this.phono=phono;
	    this.email=email;
	}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public long getPhono() {
	return phono;
}
public void setPhono(long phono) {
	this.phono = phono;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
