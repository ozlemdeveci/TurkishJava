package FirstAttempt;

public class FirstCode {
	
public static void main(String[] args) {
		
		/*1. Write a program to swap 2 numbers without a temporary variable? Swap 2 strings
				without a temporary variable? */
	
	int a = 10;
	int b = 20;
	a = a + b;// first this should be there a=10+20=30
	b = a - b; // b= 30-20=10
	a = a - b; // a=30-10=20
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("-------------------");
	
	//swap strings
	String x="Hello";
	String y="Welcome";
	x=x+y; //HelloWelcome
	y=x.substring(0,(x).length()-y.length());
	x=x.substring(y.length());
	System.out.println(x);
	System.out.println(y);

}
	
	
}