package aggregation;

public class AggregationEx2 {
	int rollno;
	String city;
	AggregationEx1 ref;//aggregation
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationEx1 obj=new AggregationEx1("ABC",10);
		AggregationEx2 obj2=new AggregationEx2(1,"xyz",obj);
		obj2.display();
	}
	
public AggregationEx2(int rollno,String city,AggregationEx1 ref) {
	this.city=city;
	this.rollno=rollno;
	this.ref=ref;
}
public void display() {
	System.out.println(ref.name+ref.age);
	System.out.println(rollno+city);
}

}
