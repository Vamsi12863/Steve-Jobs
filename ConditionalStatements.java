
public class ConditionalStatements {
	static int a=10, b=20, c=5;

	
	 
	public static void main(String[] args) {
		if(a > b) {
			System.out.println("greater is  : " + a);
		}
		else {
			System.out.println("greater is : " + b);
		}
		if (a>b && a>c) {
			System.out.println("greater is : " + a);
		}
		else if( b>a && b>c) {
			System.out.println("greater is : " + b);
		}
		else {
			System.out.println("greater is : " + c);
				
				
			
		}
		
		// TODO Auto-generated method stub

	}

}
