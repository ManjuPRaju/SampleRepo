package superkeywordEx1;

public class SuperConstrChild extends SuperConstructor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstrChild obj=new SuperConstrChild();
	}
	public SuperConstrChild() {
		super(20,30);
		System.out.println("ChildclassConstructor");
	}

}
