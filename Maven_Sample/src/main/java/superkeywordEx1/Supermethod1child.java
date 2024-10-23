package superkeywordEx1;

public class Supermethod1child extends Supermethod1{
	public void display1(){
	
	System.out.println("This is child class method");	
	super.display();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supermethod1child obj=new Supermethod1child();
				obj.display1();
	}

}
