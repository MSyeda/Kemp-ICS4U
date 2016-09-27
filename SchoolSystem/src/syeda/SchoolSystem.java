package syeda;
import java.util.Scanner;

public class SchoolSystem {
	
	

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		// Asking for the first name of student1		
		Student student1 = new Student(); // instantiation
		System.out.println("Please enter your first name: ");
		student1.setFirstName(scn.nextLine());
		System.out.println(student1.getFirstName());
		
		// Asking for the last name of student1
		System.out.println("Thank you, " + student1.getFirstName());
		System.out.println("Now enter your last name: ");
		student1.setLastName(scn.nextLine());
		
		// Asking for the phone number
		System.out.println(student1.getFirstName() + ", now enter your 10 - digit phone number");
		student1.setphoneNum(Integer.parseInt(scn.nextLine())); 
		System.out.println("Please enter numbers.");
		
		// Add a try catch for number formatting
		
		// Asking for the Street Address
		System.out.println("Name of Home Street: ");
		student1.setstreetName(scn.nextLine());
		
		// Asking for Street Number
		System.out.println("Street Number: ");
		student1.setstreetNum(Integer.parseInt(scn.nextLine()));
		
		// City
		System.out.println("Enter city: ");
		student1.setcity(scn.nextLine());
		
		// Province
		System.out.println("Enter province: ");
		student1.setprov(scn.nextLine());
		
		// Birth Month
		System.out.println("Enter your birth month: ");
		student1.setbmonth(scn.nextLine());
		
		// Birth Day
		System.out.print("Enter your birth day: ");
		student1.setbday(Integer.parseInt(scn.nextLine()));
		
		// Birth Year
		System.out.println("Enter your birth year: ");
		student1.setbyear(Integer.parseInt(scn.nextLine()));

	}

}
