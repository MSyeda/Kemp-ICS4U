import java.util.Scanner;

public class NumDigits {

	/* Create a NumDigit application that includes a recursive method numDigits() that
	returns the number of digits in its parameter. Number -9 through 9 have one digit; numbers
	-99 to -10 and 10 to 99 have two digits, and so on. (Hint: the number of digits of a 
	number 'n' is one more than the number of digits in n/10)
	*/
	Scanner read = new Scanner(System.in);
	
	public static void numdigitsRecursion (int num){
		Scanner read = new Scanner(System.in);
		int counter = 0;
		while (counter > 10) {
		counter++;	
		}
		
		String number = read.nextLine();
		System.out.println("Enter. num = " + num);
		int oneDigit = 1;
		//race car = race car; dad = dad; mom = mom; 
		int twoDigits = 2;
		if (num >= 0 && num <= 99) {
			if (num <=9){
				numdigitsRecursion(oneDigit);
				System.out.println("Leaving method. Number of Digits = " + oneDigit);
			}
			else if (num >= 10)
			numdigitsRecursion(twoDigits);
			System.out.println("Leaving method. Number of Digits = " + twoDigits);
		}
		
		else if (num < 0 && num >= -99) {
			if (num >= -9) {
				numdigitsRecursion(oneDigit);
				System.out.println("Leaving method. Number of Digits = " + oneDigit);
			}
			else if (num <= -10) {
				numdigitsRecursion(twoDigits);
				System.out.println("Leaving method. Number of Digits = " + twoDigits);
			}
		}
	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
	
	numdigitsRecursion(Integer.parseInt(read.nextLine()));
	}
}