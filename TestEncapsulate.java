package com.encapsulation;

public class TestEncapsulate {

	public static void main(String[] args) {
		
		encapsulate objencapsulate = new encapsulate();
	    
		objencapsulate.setEmployeeName("https://www.VSTL.com/");
		System.out.println("URL is : "+objencapsulate.getSetURL());
		
		objencapsulate.setEmployeeName("Riya Sharma");
		System.out.println("Employee name is : "+objencapsulate.getEmployeeName());
		
		objencapsulate.setEmployeeID("1004");
		System.out.println("Employee ID is : "+objencapsulate.getEmployeeID());
		
		objencapsulate.setEmployeeAge("25");
		System.out.println("Employee age is : "+objencapsulate.getEmployeeAge());
		
		
		System.out.println("============================================");
		
		 
		objencapsulate.setEmployeeName("https://www.VSTL.com/");
		System.out.println("URL is : "+objencapsulate.getSetURL());
		
		objencapsulate.setEmployeeName("Rohan Kamat");
		System.out.println("Employee name is : "+objencapsulate.getEmployeeName());
		
		objencapsulate.setEmployeeID("1202");
		System.out.println("Employee ID is : "+objencapsulate.getEmployeeID());
		
		objencapsulate.setEmployeeAge("29");
		System.out.println("Employee age is : "+objencapsulate.getEmployeeAge());
		
		
	}

}
