package syeda;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSystem {

static Scanner scn = new Scanner (System.in);
static int option;

static ArrayList <Student> studRecs = new ArrayList <Student> ();


/**
 * @author Maryam Syeda
 * @param args
 */
	public static void main(String[] args) {

		// MENU
		
		boolean flag = false;


		do {
			System.out.println("Choose one option: ");
			System.out.println("1. Enter a new student ");
			System.out.println("2. Find Student"); // This will display a sub-menu to print or remove student
			System.out.println("3. Print all the students");
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
			
			else if (option == 10){
				
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
		student.setFirstName(scn.nextLine());
		System.out.println(student.getFirstName());

		// Asking for the last name of student1
		System.out.println("Thank you, " + student.getFirstName());
		System.out.println("Now enter your last name: ");
		student.setLastName(scn.nextLine());

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
		
		studRecs.add(new Student());
		
		backToMainMenu();
	}
	
	/**
	 * 
	 */
	
	public static void findStud () {
		System.out.print("How would you like to search for your student?");
		
	}
	
	/**
	 * 
	 */
	
	public static void printAllStuds () {
		
		for(int i = 0; i < studRecs.size(); i++)
		{
			
		}
		
		backToMainMenu();
	}

	public static void backToMainMenu (){
		
		System.out.println("That is it, go back to the main menu? (y/n) ");
		String main = scn.nextLine();
		
		if (main == "n"){
			System.out.println("I am done with the TDSB");
			// quit the program
			System.exit(0);
		}
		else {
			main(null);
		}
	}
}
