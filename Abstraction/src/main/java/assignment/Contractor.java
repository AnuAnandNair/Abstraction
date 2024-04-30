package assignment;

import java.util.Scanner;

public class Contractor extends Employee {
	float contract_hours;
	int contract_payperhour=500;
	float contract_salary;
	@Override
	public void calculateSalary() {
		//System.out.println("Enter the hours for contractor");
		//Scanner s1=new Scanner(System.in);
		//contract_hours=s1.nextFloat();
		contract_salary=contract_payperhour*contract_hours;
		System.out.println("The salary calculated for contractor is: "+contract_salary);		
	}
	
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		Contractor c1=new Contractor();						
		System.out.println("Enter the hours for contractor");
		c1.contract_hours=s1.nextFloat();	
		c1.calculateSalary();
		
		/*Contractor c2=new Contractor();						
		System.out.println("Enter the hours for contractor");
		c2.contract_hours=s1.nextFloat();	
		c2.calculateSalary();*/
				
		FullTimeEmployee e1=new FullTimeEmployee();
		e1.calculateSalary();	
	}
}


