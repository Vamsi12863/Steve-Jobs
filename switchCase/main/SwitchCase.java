package switchCase.main;
import java.util.Scanner;

public class SwitchCase {

	public static char[] week;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 7 : ");
		int week = sc.nextInt();
		
		String weekday="";
		switch(week) {
		case 1:weekday="sunday";
		break;
		case 2:weekday="monday";
		break;
		case 3:weekday="tuesday";
		break;
		case 4:weekday="wednesday";
		break;
		case 5:weekday="thursday";
		break;
		case 6:weekday="friday";
		break;
		case 7:weekday="saturday";
		break;
		default:
			System.out.println("Enter a valid number :");
				
				
		}
		System.out.println(weekday);
	}
}
		
