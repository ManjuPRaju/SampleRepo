package superkeywordEx1;

public class SupervariableChild extends SupervariableEx {
	String color="Yellow";
	public void display()
	{
	System.out.println(color);
	System.out.println(super.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupervariableChild obj=new SupervariableChild();
		obj.display();
	}

}
