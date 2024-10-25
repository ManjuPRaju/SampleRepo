package exceptionhandling;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=50;
int b=0;
try {
int d=a/b;
}
catch(ArithmeticException name)
{
	b=5;
	int e=a/b;
	System.out.println(e);
	System.out.println(name);
}
finally
{
System.out.println("Execution Completed");
}
}
	}


