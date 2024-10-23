package abstractionEx;

public class AbstarctChild extends AbstarctEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstarctChild obj=new AbstarctChild();
		obj.add();
		obj.display();
		obj.display2();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int sum=1+2;
		System.out.println(sum);
		
	}
	public void display2()
	{
		System.out.println("Non abstract Child");
	}

}
