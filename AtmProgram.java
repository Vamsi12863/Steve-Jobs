import java.util.Scanner;
public class AtmProgram {
public void atmFunction() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username :: ");
		String userName = sc.next();
		System.out.println("Enter password :: ");
		String password = sc.next();
			if(userName != password) {
			System.out.println("Enter the amount to withdraw :: ");
			int amount = sc.nextInt();
			if(amount % 100 == 0) {
			System.out.println("valid amount");
				if(true) {
					int input1 = amount/2000;
					int input2 = 2000*input1;
					int input3 = amount -input2;
			if(input3 == 0 ) {
				int reduceNotes=(input1)-1;
				System.out.println("print less amount :: "+reduceNotes*2000);
				
				int remainingAmount=amount-(reduceNotes*2000);
				System.out.println("the remaining 2000 notes amount is :: "+remainingAmount);
				if(remainingAmount%500==0) {
					int reduceNotes1 =(remainingAmount/500)-1;
					System.out.println("five hundred amount :: "+reduceNotes1*500);
					int remainingAmount1=remainingAmount-(reduceNotes1*500);
					System.out.println("the remaining 500 notes amount is "+remainingAmount1);
					int hundredsNotes = remainingAmount1/100;
					System.out.println("number of 100 notes :: "+hundredsNotes);
					System.out.println("remaining 100 amount is " + hundredsNotes*100);
				}
			}
			else {
					int input4 = input3/500;
					int input5 = 500*input4;
					int input6 = input3-input5;
					
					int input7 = input6/100;
					int input8 = 100*input7;
					int input9 = input6 - input8;
					System.out.println("2000 notes amount is "+input2);
					System.out.println("number of 2000 notes are "+input1);
					System.out.println("500 notes amount is "+input5);
					System.out.println("number of 500 notes are "+input4);
					System.out.println("100 notes amount is "+input8);
					System.out.println("number of 100 notes are "+input7);
			
						if (input9==0) {
							System.out.println("Valid process");
						}
			}
					}
				
				}
			else {
				
				System.out.println("Enter valid amount");
				
			}
			}
			
		
}
	

}


