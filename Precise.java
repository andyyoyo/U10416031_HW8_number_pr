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
		
	}	
}	
