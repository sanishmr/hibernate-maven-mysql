package com.san.hiber02;

import org.hibernate.Transaction ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DepartmentDAO {

	public static void main(String[] args) {
		try {
			
			Configuration configObj = new Configuration();
			configObj.configure("hibernate.cfg.xml");
			SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
			Session sessionObj = sessionFactoryObj.openSession();
			Transaction transactionObj = sessionObj.beginTransaction();
			
			Department departmentObj = new Department();
			departmentObj.setDeptname("CORP");
			sessionObj.save(departmentObj);
			transactionObj.commit();
			sessionObj.close();
			
			System.out.println("Saved Successfully");
			
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
