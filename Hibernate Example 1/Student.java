package com.jsp.hibernate_first;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
@Id

int stuid;
String name;
double marks;
long phono;

	public Student(int stuid,String name, double marks, long phono) {
		// TODO Auto-generated constructor stub
     		this.stuid =stuid;
     		this.name = name;
     		this.marks =marks;
     		this.phono =phono;
     		}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public long getPhono() {
		return phono;
	}

	public void setPhono(long phono) {
		this.phono = phono;
	}
	




}
