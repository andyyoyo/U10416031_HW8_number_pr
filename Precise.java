import java.math.BigDecimal;
import java.util.Scanner;

public class Precise {
	public static void main(String[] args){
		
		//set the constant
		final int DEF_DIV_SCALE = 50;
		
		prompt the user to enter
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		String a = input.nextLine();
		System.out.println("Enter another number:");
		String b = input.nextLine();
		System.out.println("Enter the option that you want 1.add 2.substraction 3.multiply 4.division");
		int c = input.nextInt();
		
		//set the number with BigDecimal
		BigDecimal n1 = new BigDecimal(a);
		BigDecimal n2 = new BigDecimal(b);
		
		switch(c){
		case 1:
			System.out.println("Your answer is "+n1.add(n2));
			break;
		case 2:
			System.out.println("Your answer is "+n1.subtract(n2));
			break;
		case 3:
			System.out.println("Your answer is "+n1.multiply(n2));
			break;
		case 4:
			System.out.println("Your answer is "+n1.divide(n2,DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP));
			break;
		default:
			System.out.println("Error");
			break;
		}
		
	}	
}	
