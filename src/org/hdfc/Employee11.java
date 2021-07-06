package org.hdfc;

public class Employee11 {
		
	private void empDetails(int id) {
		System.out.println("Employee id:"+id);
	}
	
	private void empDetails(int pincode, long phno, String name) {
		System.out.println("Employee pincode:"+ pincode + "\tEmployee phone number:"+ phno + "\nEmployee name:" + name);
	}

	private void empDetails(String name, int accno) {
		System.out.println("Employee name:" + name + "\tEmployee accno:" + accno);
	}
	
	private void empDetails(long phno, String name ) {
		System.out.println("Employee phonenumber:" + phno + "\tEmployee name:" + name);
	}
	
	public static void main(String[] args) {
		Employee11 o = new Employee11();
		o.empDetails(96);
		o.empDetails(620019, 8870357733l, "Prakash");
		o.empDetails("Prakash", 1224);
		o.empDetails(8870357733l, "Prakash");
	}
 
}