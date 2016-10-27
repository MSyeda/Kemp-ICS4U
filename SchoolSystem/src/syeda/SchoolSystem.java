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
		System.out.println("Now enter your last name: ");
		student.setlastName(scn.nextLine());

		// Birth Month
		System.out.println("Enter your birth month: ");
		student.setbmonth(scn.nextLine());

		// Birth Day
		System.out.println("Enter your birth day: ");
		do { 
			try{
				student.setbday(Integer.parseInt(scn.nextLine()));
				flag = false;
			}
			catch (NumberFormatException e) {
				System.out.println("Enter numbers only. ");
				flag = true;
			}
		}
		while (flag);


		// Birth Year
		System.out.println("Lastly, enter your birth year: ");
		do {
			try{
				student.setbyear(Integer.parseInt(scn.nextLine()));
				flag = false;
			}
			catch (NumberFormatException e) {
				System.out.println("Enter numbers only. ");
				flag = true;
			}
		}
		while (flag);
		
		//TODO: Use calender for the birthday information!
		
		//Before asking for any additional info, student must be 13 & 18 years old
		
		int studAgeVer = 2016 - student.getbyear();
		if (studAgeVer < 13){
			int waitTime = 13 - studAgeVer;
			System.out.println(student.getFirstName() + student.getlastName() + ", you are too young to apply to Runnymede C.I.");
			if (waitTime == 1){
				System.out.println("You need to wait one year!");
				System.exit(waitTime);
			}
			else if (waitTime > 1) {
				System.out.println("You need to wait, " + waitTime + " years");
				System.exit(waitTime);
			}
		}
		else if (studAgeVer > 18){
			int exit = 0;
			System.out.println("You are too old to apply to High School, sorry!");
			System.exit(exit);
		}
		
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
		do {
			try{
				student.setstreetNum(Integer.parseInt(scn.nextLine()));
				flag = false;
			}
			catch (NumberFormatException e) {
				System.out.println("Enter numbers only. ");
				flag = true;
			}
		}
		while (flag);

		// City
		System.out.println("Enter city: ");
		student.setcity(scn.nextLine());

		// Province
		System.out.println("Enter province: ");
		student.setprov(scn.nextLine());

		// Postal Code
		System.out.println("Enter your postal code: ");
		student.setpostal(scn.nextLine());

		//System.out.println("This is what you entered: " + student1.get);

		

		IdGenerator++; 
		studRecs.add(student);
		System.out.println("This is " + student.getFirstName() + "'s student id: ");
		// should be able to display the student number
		
		backToMainMenu();
	}

	/**
	 * 
	 */

	public static void findStud () {

		boolean flag = false;
		int search = 0;

		System.out.println("Please enter the student number of your student.");
		String studNumber = scn.nextLine();
		//studRecs.get
		//studRecs.IdGenerator();
		System.out.println("Is this the student you were looking for? (1 = YES / 0 = NO)");
		do {
			try {
				search = Integer.parseInt(scn.nextLine());
				flag = false;		
			} 
			catch (NumberFormatException e){
				System.out.println("Enter numbers only. ");
				flag = true;
			}
		}
		while(flag);

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




