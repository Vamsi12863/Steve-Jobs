
class Demo1{
		int value1;
		int value2;
		Demo1(){
		value1 = 10;
		value2 = 20;
		System.out.println("1st Constructor");
		}
		Demo1(int a){
		value1 = a;
		System.out.println("2nd Constructor");
		}
		Demo1(int a,int b){
		value1 = a;
		value2 = b;
		System.out.println("3rd Constructor");
		}
		public void display(){
		System.out.println("Value1 === "+value1);
		System.out.println("Value2 === "+value2);
		}
		public static void main(String args[]){
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1(30);
		Demo1 d3 = new Demo1(30,40);
		d1.display();
		}}




	

