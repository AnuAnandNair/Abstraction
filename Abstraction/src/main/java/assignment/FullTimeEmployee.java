package assignment;

public class FullTimeEmployee extends Employee {	
	final int hours=8;
	int payperhour=500;
	int salary;
	@Override
	public void calculateSalary() {
		salary=payperhour*hours;
		System.out.println("The salary calculated for full time employee is: "+salary);		
	}

	/*public static void main(String[] args) {
		FullTimeEmployee e1=new FullTimeEmployee();
		e1.calculateSalary();		
	}*/
}
