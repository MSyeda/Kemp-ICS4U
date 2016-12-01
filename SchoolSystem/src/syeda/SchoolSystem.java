package syeda;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 * @author Maryam Syeda
 * Date Started: Wednesday, September 28, 2016
 * Date of  Completion: Monday, October 31, 2016
 * 
 *
 */
public class SchoolSystem{
	static int option; 
	public static Scanner scn = new Scanner (System.in);
	public static ArrayList <Student> studRecs = new ArrayList <Student> (); 
	public static File studFile = new File ("src\\students.txt");
	public static FileOutputStream fileOutputStream; 
	public static BufferedReader fbr; 
	public static PrintStream fps; 

	/**
	 * @param args
	 * The main method contains the menu for the school system program
	 */
	public static void main(String[] args) {
		boolean flag = false;

		do {
			System.out.println("Choose one option: ");
			System.out.println("1. Enter A New Student ");
			System.out.println("2. Find A Student");
			System.out.println("3. Print All The students");
			System.out.println("4. Sort All Students");
			System.out.println("10. Quit Program ");

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
						sortStuds();
					}
					else if (option == 10){

						System.out.println("Done.");
						try {
							fileOutputStream.close();
						}
						catch (IOException e){
							e.printStackTrace();
						}
						System.exit(option);
					}
					else {
						System.out.println("Please enter a valid option");
						main(null);
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
	 * The method, studentFile() deals with creating a student file and
	 * storing objects in it. 
	 */
	public static void studentFile() {
		try {
			fileOutputStream = new FileOutputStream ("src\\students.txt");
			fbr = new BufferedReader (new FileReader(studFile));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			if (!studFile.exists()) {
				try {
					studFile.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		}
		fps = new PrintStream(fileOutputStream);
	}
	/**
	 * The method addStudent, verifies the applicants age, 
	 * collects the student information, creates a new student and stores
	 * the information. 
	 * 
	 * Note: If the applicant is too young or too old, their records will
	 * not be saved.
	 * 
	 */
	public static void addStudent () {
		//Student student = new Student(); // instantiation for a new student
		int year;
		boolean flag = false;
		System.out.println("Enter your birth year: ");
		int birthYear = 0;
		do {
			try{
				//student.setbyear(Integer.parseInt(scn.nextLine()));
				year = Integer.parseInt(scn.nextLine());
				//Before asking for any additional info, student must be 13 & 18 years old
				int studAgeVer = 2016 - year;
				if (studAgeVer < 13){
					int waitTime = 13 - studAgeVer;
					System.out.println("You are too young to apply to Runnymede C.I.");
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
				else {
					birthYear = year;
				}

				flag = false;
			}
			catch (NumberFormatException e) {
				System.out.println("Enter numbers only. ");
				flag = true;
			}
		}
		while (flag);
		System.out.println("Please enter your first name: ");
		String fName = scn.nextLine();
		System.out.println("Now enter your last name: ");
		String lName = scn.nextLine();
		System.out.println("Enter your birth month: ");
		String birthMonth = scn.nextLine();
		System.out.println("Enter your birth day: ");
		int birthDay = 0;
		do { 
			try{
				birthDay = Integer.parseInt(scn.nextLine());
				flag = false;
			}
			catch (NumberFormatException e) {
				System.out.println("Enter numbers only. ");
				flag = true;
			}
		}
		while (flag);
		//String birthday = bmonth + " " + bday + " " + byear;
		String pNum = null;
		System.out.println("Now enter your 10 - digit phone number");
		do{
			pNum = scn.nextLine();
			if (pNum.length()==10){
				for (int i = 0; i < 10; i++){
					if(!tryNum(pNum.charAt(i))){
						System.out.println("Please enter a real phone number.");
						flag=true;
						break;
					}
					if(i == 9){
						flag = false;
					}
				}
			}
			else {
				System.out.println("Please enter a real phone number.");
				flag=true;
			}
		}
		while(flag);
		System.out.println("Enter your address: ");
		String homeAdd = scn.nextLine();
		System.out.println("Enter your city: ");
		String hCity = scn.nextLine();
		System.out.println("Enter province: ");
		ProvinceTerr hProv = ProvinceTerr.valueOf(scn.nextLine().toUpperCase());
		String hCode = null;
		System.out.println("Enter your postal code: ");
		do{
			hCode = (scn.nextLine()).toLowerCase();
			if (hCode.length() != 6) {
				System.out.println("Please enter a valid postal code.");
				flag = true;
			}
			flag=false;
		}
		while(flag);

		studRecs.add(new Student(fName, lName, pNum, homeAdd, hCity, hProv, hCode, birthMonth, birthDay, birthYear));
		for (int i = 0; i < studRecs.size(); i++){
			fps.println(studRecs.get(i).toString());
		}
		main(null);
	}
	/**
	 * This method checks if the user inputed numbers
	 * @param x
	 * @return
	 */
	public static boolean tryNum (char x) {
		if (x=='0'||x=='1'||x=='2'||x=='3'||x=='4'||x=='5'||x=='6'||x=='7'||x=='8'||x=='9'){
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * This method finds a student on the file, using a last name search
	 */

	public static void findStud () {

		boolean flag = false;
		System.out.println("Please enter the last name of your student.");
		Student search = searchStudent((scn.nextLine()));

		if(search == null) {
			System.out.println("No results found.");
			System.out.println("Go back to main menu? (1 = Yes & 0 = No");
			int option = scn.nextInt();
			if (option == 1){
				main(null);
			}
			else if (option == 0){
				findStud();
			}
		}
		else {
			System.out.println("What would you like to do?");
			System.out.println("1. Print the Student Information");
			System.out.println("2. Remove the Student from Records");
			System.out.println("3. Go Back to Main Menu");
			do {
				try {			
					int studSearch = scn.nextInt();
					if (studSearch != 1 || studSearch != 2 || studSearch != 3){
						System.out.println("Enter a valid option.");
						findStud();
					}
					if (studSearch == 1){
						printSearchStudent(search);
					}
					else if (studSearch == 2){
						removeSearchStudent(search);
					}
					else if (studSearch == 3){
						main(null);
					}
					flag = false;
				}
				catch(NumberFormatException e){
					System.out.println("Please enter a number.");
					flag = true;
				}
			}
			while(flag);
		}
	}
	
	public static void simpleMean () {
		
	}

	/**
	 * The searchStudent method searches for a student with the last name
	 * entered in the method: findStud. It will return the student, if there
	 * is a result, otherwise returns nothing. 
	 * 
	 * @param lastName
	 * @return
	 */
	public static Student searchStudent (String lastName){
		for (int s = 0; s < studRecs.size(); s++){
			if (studRecs.get(s).getLastName() == lastName) {
				return studRecs.get(s);
			}
		}
		return null;
	}
	/**
	 * 
	 * @param search 
	 */
	public static void printSearchStudent (Student search){
		System.out.println(search.getFirstName() + " " + search.getLastName());
		System.out.println(search.getPhoneNum());
		System.out.println(search.getBmonth() + ", " + search.getBday() + ", " + search.getByear());
		System.out.println(search.getPhoneNum());
		System.out.println(search.getStreetName());
		System.out.println(search.getCity());
		System.out.println(search.getProv());
		System.out.println(search.getPostal());
		System.out.println(search.getStudNumber());
		findStud();
	}
	/**
	 * 
	 * @param search
	 */
	public static void removeSearchStudent (Student search) {
		studRecs.remove(search);
		findStud();
	}

	/**
	 * This method prints all the students on file
	 */         
	public static void printAllStuds () {
		String [] fbrValues = null;
		try {
			fbrValues = fbr.readLine().split(", ");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < fbrValues.length; i++){
			System.out.println(fbrValues[i]);
			if ((i+1)%9 == 0)
				System.out.println();
		}
		for(int i = 0; i < studRecs.size(); i++)
		{
			printSearchStudent(studRecs.get(i));
		}

		main(null);
	}

	/**
	 * This method sorts all the students on file
	 */
	public static void sortStuds () {
		//Collections.sort((studRecs <Student>));
		Collections.sort(studRecs);
		for (int i = 0; i < studRecs.size(); i++) {
			System.out.println(studRecs.get(i).getFirstName());
			System.out.println(studRecs.get(i).getLastName());
			System.out.println(studRecs.get(i).getPhoneNum());
			System.out.println(studRecs.get(i).getBmonth() + studRecs.get(i).getBday() + studRecs.get(i).getByear());
			System.out.println(studRecs.get(i).getStreetName());
			System.out.println(studRecs.get(i).getCity());
			System.out.println(studRecs.get(i).getProv());
			System.out.println(studRecs.get(i).getPostal());
			System.out.println(studRecs.get(i).getStudNumber());
			System.out.println();
		}
	}
	/**
	 * This methods uses the enum class to check whether the user input was correct or not
	 * @param input
	 * @return
	 */
	public static ProvinceTerr provCheck(String input) {
		while (true) {
			switch (input) {
			case"ONTARIO":
				return ProvinceTerr.ONTARIO;
			case"NEWFOUNDLAND AND LABRODOR":
				return ProvinceTerr.NEWFOUNDLANDANDLABRADOR;
			case"NOVA SCOTIA":
				return ProvinceTerr.NOVASCOTIA;
			case"PRINCE EDWARD ISLAND":
				return ProvinceTerr.PRINCEEDWARDISLAND;
			case"NEW BRUNSWICK":
				return ProvinceTerr.NEWBRUNSWICK;
			case"QUEBEC":
				return ProvinceTerr.QUEBEC;
			case"MANITOBA":
				return ProvinceTerr.MANITOBA;
			case"SASKATCHEWAN":
				return ProvinceTerr.SASKATCHEWAN;
			case"ALBERTA":
				return ProvinceTerr.ALBERTA;
			case"BRITISH COLUMBIA":
				return ProvinceTerr.BRITISHCOLUMBIA;
			case"YUKON":
				return ProvinceTerr.YUKON;
			case"NORTH WEST TERRITORIES":
				return ProvinceTerr.NORTHWESTTERRITORIES;
			case"NUNAVUT":
				return ProvinceTerr.NUNAVUT;

			default: 
				System.out.println("Please enter a real province!");
				input = scn.nextLine();
			}
		}
	}
	
	
}




