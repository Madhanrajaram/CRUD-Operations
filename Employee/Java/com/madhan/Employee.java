package com.madhan;

public class Employee {
 private int id;
 private String fname;
 private String lname;
 private String add;
 private String no;
public Employee(int id, String fname, String lname, String add, String no) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.add = add;
	this.no = no;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public String getNo() {
	return no;
}
public void setNo(String no) {
	this.no = no;
}
}
