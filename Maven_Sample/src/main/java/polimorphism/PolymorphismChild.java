package polimorphism;

public class PolymorphismChild extends Polymorphism1{
	public void display(int a, int b) {
		int c=a*b;
		System.out.println(c);
		super.display(2,3);
	}
	public static void main(String[] args) {
	
		 PolymorphismChild obj2 =new PolymorphismChild();
	 obj2.display(2,3);
				// TODO Auto-generated method stub


	}

}
