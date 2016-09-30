package syeda;

public class Student {
	
	// First Name Object Blueprint
	private String firstName;
	
	public void setFirstName (String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName() {
	return this.firstName;
	}
	
	// Last Name Object Blueprint
	private String lastName;
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	// Phone Number Object Blueprint
	private long phoneNum;
	
	public void setphoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public long phoneNum() {
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
	
	// Postal Code Object Blueprint (Array?)
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



	
	
	
	
	

}
