package syeda;

public class Student implements Comparable{

	private String firstName;
	private String lastName;
	private String phoneNum;
	private String streetName;
	private String city;
	private ProvinceTerr prov;
	private String postal;
	private String bmonth;
	private int bday;
	private int byear;
	private static long IdGenerator = 300000000;
	private static long studNumber = IdGenerator;

	public Student(String fName, String lName, String pNum, String homeAdd, String hCity, ProvinceTerr hProv, String hCode, String birthMonth, int birthDay, int birthYear){
		setFirstName(fName); 
		setLastName(lName); 
		setPhoneNum(pNum); 
		setStreetName(homeAdd); 
		setCity(hCity); 
		setProv(ProvinceTerr.ONTARIO); 
		setPostal(hCode); 
		setBmonth(birthMonth); 
		setBday(birthDay); 
		setByear(birthYear); 
		setStudNumber(); 
		//setIdGenerator(IdGenerator); // sets the student Id
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName (String firstName){
		this.firstName = firstName;
	}
	/**
	 * 
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}
	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * 
	 * @return the last
	 */
	public String getLastName() {
		return this.lastName;
	}
	/**
	 * 
	 * @param phoneNum
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	/**
	 * 
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return this.phoneNum;
	}
	/**
	 * 
	 * @param streetName
	 */
	public void setStreetName (String streetName){
		this.streetName = streetName;
	}
	/**
	 * 
	 * @return the streetName
	 */
	public String getStreetName(){
		return this.streetName;
	}
	/**
	 * 
	 * @param city
	 */
	public void setCity (String city){
		this.city = city;
	}
	/**
	 * 
	 * @return city
	 */
	public String getCity(){
		return this.city;
	}
	/**
	 * 
	 * @param prov
	 */
	public void setProv (ProvinceTerr prov){
		this.prov = prov;
	}
	/**
	 * 
	 * @return prov
	 */
	public ProvinceTerr getProv(){
		return this.prov;
	}
	/**
	 * 
	 * @param postal
	 */
	public void setPostal (String postal){
		this.postal = postal;
	}
	/**
	 * 
	 * @return postal
	 */
	public String getPostal(){
		return this.postal;
	}
	/**
	 * 
	 * @param bmonth
	 */
	public void setBmonth (String bmonth){
		this.bmonth = bmonth;
	}
	/**
	 * 
	 * @return bmonth
	 */
	public String getBmonth(){
		return this.bmonth;
	}
	/**
	 * 
	 * @param bday
	 */
	public void setBday (int bday){
		this.bday = bday;
	}
	/**
	 * 
	 * @return bday
	 */
	public int getBday(){
		return this.bday;
	}
	/***
	 * 
	 * @param byear
	 */
	public void setByear(int byear){
		this.byear = byear;
	}
	/**
	 * 
	 * @return byear
	 */
	public int getByear(){
		return this.byear;
	}
	/**
	 * 
	 * @return
	 */
	public void setStudNumber () {
		IdGenerator++;
		studNumber++;
	}
	/**
	 * 
	 */
	public long getStudNumber () {
		return this.studNumber;
	}
	/**
	 * 
	 * @param search
	 * @return
	 */
	public String toString (Student search) {
		return studNumber + "; " + firstName + " "  + lastName + ": " + phoneNum  + "; " + bmonth + " " + bday + ", " + byear + "; " + streetName + ", " + city + ", " + prov + ", " + postal + "; " ;
	}
	/**
	 * 
	 * @param search
	 * @return
	 */
	public boolean equals(Student search){
		if (this.lastName == search.lastName) {
			return true;
		}
		else {
			return false;
		}
	}
	public int compareTo(Object arg0){
		Student temp = (Student) arg0;
		return this.getLastName().compareTo(temp.getLastName());
	}
}






