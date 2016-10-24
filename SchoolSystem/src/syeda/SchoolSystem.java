package syeda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Maryam Syeda
 * Date Started: Wednesday, September 28, 2016
 * Date of  Completion: Coming soon to a program near you!
 * 
 *
 */

public class SchoolSystem {

static Scanner scn = new Scanner (System.in);
static int option;

static ArrayList <Student> studRecs = new ArrayList <Student> ();

private static long IdGenerator = 300000000;

public static int indexOf(Object o) {
	return 0;
}

/**
 * @param args
 */
	public static void main(String[] args) {

		// MENU
		
		boolean flag = false;


		do {
			System.out.println("Choose one option: ");
			System.out.println("1. Enter a new student ");
			System.out.println("2. Find a Student"); // This will display a sub-menu to print or remove student
			System.out.println("3. Print all the students");
			System.out.println("4. Sort Students");
			System.out.println("10. Quit ");
			
			do {
			try {
			option = Integer.parseInt(scn.nextLine());
			
			if (option == 1){
				
				addStudent();
			}
			
			else if (option == 2){
				
				findStud();
			}
			
			else if (option == 3){
				
				printAllStuds();
			}
			else if (option == 4){
				
			}
			else if (option == 10){
				
				System.out.println("Done.");
				System.exit(option);
			}
			
			flag = false;
			
			}
			catch (NumberFormatException e){
				System.out.println("Please enter numbers only. Do not include dashes either. ");
				flag = true;
			}
			}
			while (flag);
		}
		while (option < 10); {

		}

	}

	/**
	 * 
	 */
	
	public static void addStudent () {
		

		boolean flag = false;

		// Asking for the first name of student1		
		Student student = new Student(); // instantiation
		System.out.println("Please enter your first name: ");
		student.setfirstName(scn.nextLine());
		System.out.println(student.getFirstName());

		// Asking for the last name of student1
		System.out.println("Thank you, " + student.getFirstName());
		System.out.println("Now enter your last name: ");
		student.setlastName(scn.nextLine());

		// Asking for the phone number
		System.out.println(student.getFirstName() + ", now enter your 10 - digit phone number");
		do {
			try {
				student.setphoneNum(Long.parseLong(scn.nextLine()));
				flag = false;
			}
			catch (NumberFormatException e){
				System.out.println("Please enter numbers only. Do not include dashes either. ");
				flag = true;
			}
		}
		while (flag);

		// Asking for the Street Address
		System.out.println("Name of Home Street: ");
		student.setstreetName(scn.nextLine());

		// Asking for Street Number
		System.out.println("Street Number: ");
		try{
			student.setstreetNum(Integer.parseInt(scn.nextLine()));
		}
		catch (NumberFormatException e) {
			System.out.println("Enter numbers only. ");
		}

		// City
		System.out.println("Enter city: ");
		student.setcity(scn.nextLine());

		// Province
		System.out.println("Enter province: ");
		student.setprov(scn.nextLine());

		// Postal Code
		System.out.println("Enter your postal code: ");
		student.setpostal(scn.next());

		//System.out.println("This is what you entered: " + student1.get);

		// Birth Month
		System.out.println("Enter your birth month: ");
		student.setbmonth(scn.nextLine());

		// Birth Day
		System.out.print("Enter your birth day: ");
		try{
			student.setbday(Integer.parseInt(scn.nextLine()));
		}
		catch (NumberFormatException e) {
			System.out.println("Enter numbers only. ");
		}


		// Birth Year
		System.out.println("Lastly, enter your birth year: ");
		try{
			student.setbyear(Integer.parseInt(scn.nextLine()));
		}
		catch (NumberFormatException e) {
			System.out.println("Enter numbers only. ");
		}
		
		IdGenerator++; 
		studRecs.add(student);
		backToMainMenu();
	}
	
	/**
	 * 
	 */
	
	public static void findStud () {
		System.out.println("Please enter the student number of your student.");
		String studNumber = scn.nextLine();
		//studRecs.get
		//studRecs.IdGenerator();
		System.out.println("Is this the student you were looking for? (1 = YES / 0 = NO)");
		int search = Integer.parseInt(scn.nextLine());
		if (search == 1){
			System.out.println("Please try again");
		}
		else {
			//System.out.println(getstudent);
		}
	}
	
	/**
	 * 
	 */         
	
	public static void printAllStuds () {
		
		for(int i = 0; i < studRecs.size(); i++)
		{
			System.out.println(studRecs.get(i).getFirstName());
		}
		
		backToMainMenu();
	}

	public static void backToMainMenu (){
		
		System.out.println("That is it, go back to the main menu? (0 = No; 1 = Yes) ");
		int main = Integer.parseInt(scn.nextLine());
		
		if (main == Integer.parseInt("0")){
			System.out.println("I am done with the TDSB");
			// quit the program
			System.exit(main);
		}
		else {
			main(null);
		}
	}
	
	public static void sortStudents () {
		//Collections.sort(studRecs);
	}
}




