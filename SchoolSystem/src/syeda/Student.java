package syeda;

public class Student implements comparable{

	int var1 = 0;
	int var2 = 1;
	int var3 = 2; 
			
	public Student(){
		
		setfirstName(""); // set first name
		setlastName(""); // set last name
		setphoneNum(phoneNum); // set phone number
		setstreetName(""); // set street name
		setstreetNum(streetNum); // set street number
		setcity(""); // set city
		setprov(""); // set province
		setpostal(""); // set postal code
		setbmonth(""); // set birth month
		setbday(bday); // set birth day
		setbyear(byear); // set birth year
		//setIdGenerator(IdGenerator); // sets the student Id
	}

//
//	// Student Number Blueprint
//	public void setIdGenerator(long IdGenerator) {
//		Student.IdGenerator = IdGenerator;
//	}
//	public long getIdGenerator(){
//		return Student.IdGenerator;
//	}
	
	// First Name Object Blueprint
	private String firstName;

	public void setfirstName (String firstName){
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	// Last Name Object Blueprint
	private String lastName;

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getlastName() {
		return this.lastName;
	}

	// Phone Number Object Blueprint
	private long phoneNum;

	public void setphoneNum(long phoneNum) {
		
		this.phoneNum = phoneNum;
	}

	public long getphoneNum() {
		return this.phoneNum;
	}

	// Street Name Object Blueprint
	private String streetName;

	public void setstreetName (String streetName){
		this.streetName = streetName;
	}

	public String getstreetName(){
		return this.streetName;
	}

	// Street Number Object Blueprint
	private int streetNum;

	public void setstreetNum (int streetNum){
		this.streetNum = streetNum;
	}

	public int getstreetNum(){
		return this.streetNum;
	}

	// City Object Blueprint
	private String city;

	public void setcity (String city){
		this.city = city;
	}

	public String getcity(){
		return this.city;
	}

	// Province Object Blueprint
	private String prov;

	public void setprov (String prov){
		this.prov = prov;
	}

	public String prov(){
		return this.prov;
	}

	// Postal Code Object Blueprint (Array? No)

	private String postal;

	public void setpostal (String postal){
		this.postal = postal;
	}

	public String postal(){
		return this.postal;
	}

	/*
	// For the numbers
	private int [] numPostal = new int [3];

	public int [] getNumPostal() {
		return numPostal;
	}

	public void setNumPostal(int [] numPostal) {
		this.numPostal = numPostal;
	}

	// For the letters
	private char [] letterPostal = new char [3];


	public char [] getLetterPostal() {
		return letterPostal;
	}

	public void setLetterPostal(char [] letterPostal) {
		this.letterPostal = letterPostal;
	}

	// Putting the postal code together
	 */

	// Birth Month Object Blueprint
	private String bmonth;

	public void setbmonth (String bmonth){
		this.bmonth = bmonth;
	}

	public String getbmonth(){
		return this.bmonth;
	}

	// Birth Day Object Blueprint
	private int bday;

	public void setbday (int bday){
		this.bday = bday;
	}

	public int getbday(){
		return this.bday;
	}

	// Birth Year Object Blueprint
	private int byear;

	public void setbyear(int byear){
		this.byear = byear;
	}

	public int byear(){
		return this.byear;
	}

	public Student(String firstName, String lastName){
		setfirstName(firstName);
		setlastName(lastName);
		setphoneNum(phoneNum);
		setstreetName("");
		setstreetNum(streetNum);
		setcity("");
		setprov("");
		setpostal("");
		setbmonth("");
		setbday(bday);
		setbyear(byear);
	}
	public Student(String firstName, String lastName, int phoneNum, String streetName, int streetNum, String city, String prov, String postal, String bmonth, int bday, int byear){

		setfirstName(firstName);
		setlastName(lastName);
		setphoneNum(phoneNum);
		setstreetName(streetName);
		setstreetNum(streetNum);
		setcity(city);
		setprov(prov);
		setpostal(postal);
		setbmonth(bmonth);
		setbday(bday);
		setbyear(byear);
	}
	
	public String toString () {

		return var1 + "," + var2 + "," + var3;
	}

}






