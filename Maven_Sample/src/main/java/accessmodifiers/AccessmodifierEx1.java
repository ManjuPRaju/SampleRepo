package accessmodifiers;

public class AccessmodifierEx1 {
 public void display1()
 {
	System.out.println("This is  a public access specifier") ;
	 }
 private void display2()
 {
	System.out.println("This is  a private access specifier") ;
	 }
 protected void display3()
 {
	System.out.println("This is  a protected access specifier") ;
	 }
 void display4()
 {
	System.out.println("This is  a default access specifier") ;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessmodifierEx1 obj=new AccessmodifierEx1();
		obj. display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}

}