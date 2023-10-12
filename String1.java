
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0,iterationCount=1;
		System.out.print(1);
		float c=(float) 0.0;
		float addition=0;
		for(i=1;i<=10;i++) {
			c+=1/(i+1);
			if(iterationCount%2==0 ) {
				if(i%2==0)
					continue;
				System.out.print(" + ");
			}else {
				if(i%2==0)
					continue;
				System.out.print(" - ");
			}
			iterationCount +=1;
			if(i%2!=0)
			System.out.print("1/"+i);
			System.out.println();
		}
			
			
		}
		}

	


