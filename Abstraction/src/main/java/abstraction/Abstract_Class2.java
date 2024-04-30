package abstraction;

public class Abstract_Class2 extends Abstract_Class1{	

	@Override
	public void display() {
		// TODO Auto-generated method stub
			System.out.println("Accessing display method");				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Class2 c2=new Abstract_Class2();//automatically invokes parent class constructor
		c2.display();
		c2.display2();//calling instance method using object
		Abstract_Class1.display1();//calling static method usng classname
		
		//Abstract_Class1 c1=new Abstract_Class1();//Abstract class cannot be instantiated
	}

}
