package com.san.hiber02;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	
	int deptid;
	String deptname;
	
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

}
