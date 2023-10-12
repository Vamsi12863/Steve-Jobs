public class ConstructorsOne{
		static int value1;
		static int value2;
		ConstructorsOne(){
		value1 = 10;
		value2 = 20;

		
		System.out.println("1st Constructor :"+value1+" "+value2);
		}
		ConstructorsOne(int a){
		
		System.out.println("2nd Constructor :"+a);
		}
		ConstructorsOne(int a,int b){
		value1 = a;
		value2 = b;
		System.out.println("3rd Constructor :"+a+ " "+b);
		}
		
		public static void main(String args[]){
			ConstructorsOne d1 = new ConstructorsOne();
			ConstructorsOne d2 = new ConstructorsOne(2);
			ConstructorsOne d3 = new ConstructorsOne(4,3);
		}
		}




	

