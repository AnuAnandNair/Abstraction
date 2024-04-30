package abstraction;

public abstract class Abstract_Class1 {
	public Abstract_Class1() {//constructor
		System.out.println("In abstract class constructor");
	}
	
	public abstract void display();///only declaration is done here. Definition must be in a non-abstract class 
	
	public static void display1() {//static method
		System.out.println("In static method of abstract class");
	}
	
	public void display2() {
		System.out.println("In instance method of abstract class");
	}
}
