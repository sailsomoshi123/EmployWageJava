package com.WageComputatiom;

public class EmpWage {
	public static void main(String[] args) {
		System.out.println("welcome to empwage computation");
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random() *10)%2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("employee is Absent");
	}
}
