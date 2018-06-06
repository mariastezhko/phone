package com.codingdojo.phone;

public class PhoneTester {
	public static void main(String[] args) {
		IPhone iphoneTen = new IPhone("X", 100, "AT&T", "Zing");
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());
	}
	
}
