/// Author: Carlos Hernandez
/// Date: 19 October 2021
/// Course: CSC205
/// Info:  Creates methods relating to the Person class, for use in the TestAssignment java file.

package DEMO.MyJavaDemo.app.src;

class Person {

	//properties
	String firstName;
	String lastName;
	String gender;
	String dateOfBirth;
	String occupation;
	double pay;
	String cellPhone;

	int daysWorked; 

	//list to make iterable
	static PersonList personList = new PersonList();

	// simple constructors
	public Person(String firstName, String lastName, String Gender, String dateOfBirth, String occupation, double pay, String cellPhone){

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = Gender;
		this.dateOfBirth = dateOfBirth;
		this.occupation = occupation;
		this.pay = pay;
		this.cellPhone = cellPhone;

		personList.add(this);
	}
	public Person(String firstName, String lastName, String Gender, String dateOfBirth, String occupation, double pay){

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = Gender;
		this.dateOfBirth = dateOfBirth;
		this.occupation = occupation;
		this.pay = pay;

		personList.add(this);
	}
	public Person(String firstName, String lastName, String Gender, String dateOfBirth, String occupation){

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = Gender;
		this.dateOfBirth = dateOfBirth;
		this.occupation = occupation;

		personList.add(this);
	}
	public Person(String firstName, String lastName, String Gender, String dateOfBirth){

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = Gender;
		this.dateOfBirth = dateOfBirth;

		personList.add(this);
	}
	public Person(String firstName, String lastName, String Gender){

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = Gender;

		personList.add(this);
	}
	public Person(String firstName, String lastName){

		this.firstName = firstName;
		this.lastName = lastName;

		personList.add(this);
	}
	public Person(String firstName){

		this.firstName = firstName;

		personList.add(this);
	}
	public Person(){
		personList.add(this);
	}
	
	//methods
	public int bookHoliday(int days){
		var hours = days * 8;

		// assume 1 days is 8 hours of work
		// write the code, if the total hours worked greater than 40
		// then the person gets 1 hour of holiday

		return hours > 40 ? 1 : 0; 
	}

	public int getPaidTimeOff(int days){
		var hours = days * 8;
		
		// assume 1 days is 8 hours of work
		// write the code, if the total hours worked greater than 40
		// then the person gets 2 hours of payed time off

		return hours > 40 ? 2 : 0;
	}


	// getters and setters
	public String getAddress(){
		//defensive programming - check if value is there
		if(Address.containsPerson(this)){
			return Address.getAddressOfPerson(this);
		} else {
			return "Address has not been set for this Person!"; 
		}
	}

	public String getDetails(){
		//default case
		String details = "Not enough info!";

		//defensive programming - multiple cases
		if(firstName != null & lastName != null & gender != null & dateOfBirth != null & occupation != null & pay != 0 & cellPhone != null){
			details = 
			"Full Name: " + this.firstName + " " + this.lastName + 
			"\nDate of Birth: " + this.dateOfBirth + 
			"\nGender: " + this.gender +
			"\nOccupation: " + this.occupation +
			"\nPay: "+ this.pay +
			"\nCell Phone #: "+ this.cellPhone;

		} else if(firstName != null & lastName != null & gender != null & dateOfBirth != null & occupation != null & pay != 0){
			details = 
			"Full Name: " + this.firstName + " " + this.lastName + 
			"\nDate of Birth: " + this.dateOfBirth + 
			"\nGender: " + this.gender +
			"\nOccupation: " + this.occupation +
			"\nPay: "+ this.pay;

		} else if(firstName != null & lastName != null & gender != null & dateOfBirth != null & occupation != null){
			details = 
			"Full Name: " + this.firstName + " " + this.lastName + 
			"\nDate of Birth: " + this.dateOfBirth + 
			"\nGender: " + this.gender +
			"\nOccupation: " + this.occupation;

		} else if(firstName != null & lastName != null & gender != null & dateOfBirth != null){
			details = 
			"Full Name: " + this.firstName + " " + this.lastName + 
			"\nDate of Birth: " + this.dateOfBirth + 
			"\nGender: " + this.gender;

		} else if(firstName != null & lastName != null & gender != null){
			details = 
			"Full Name: " + this.firstName + " " + this.lastName + 
			"\nGender: " + this.gender;

		} else if(firstName != null & lastName != null ){
			details = 
			"Full Name: " + this.firstName + " " + this.lastName;
		}

		return details;
	}

	public static PersonList getPersonList(){
		return personList;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}