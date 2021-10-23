/// Author: Carlos Hernandez
/// Date: 22 October 2021
/// Course: CSC205
/// Info: We'll be using this program to test instances of the class Person, and print the properties of them using our PersonList class.

package DEMO.MyJavaDemo.app.src;

public class TestAssignment {
	public static void main(String[] args) {

		// use the print function to print the output
		print("Starting Address Test");
		printPersonDetails(); // create and use test methods do not write details of the code here

	}
	private static void printPersonDetails() {
		// instantiate the person objects here using the Person class 
		Person paul = new Person("Paul", "Hardaway", "M", "09/07/1999", "Doctor", 80,"602-555-1892");
		Person lisa = new Person("Lisa", "Jones", "F", "07/23/1992", "Banker", 60, "480-999-2355");
		Person terry = new Person("Terry", "Velasquez", "M", "05/23/2000", "Plasma Donor", 30, "422-555-9238");
		Person jim = new Person("Jim", "Halpert", "M", "02/34/1987", "Salesman", 20, "602-555-8029");


		// print the details of the instantiated objects here
		// for (Person person : Person.getPersonList()) {
		// 	print(person.getDetails());
		// 	person.getPaid(7);
		// 	print(person.firstName + "'s Paid Time Off: " + person.getPaidTimeOff(9));
		// 	print(person.firstName + "'s Holiday Hours: " + person.bookHoliday(9));
		// }

		//W1.2 Part of the Assignment - Address Class

		//setting some addresses
		Address paulAddress = new Address(paul, "4234 E Roberto Lane", "2309 W Thomas Ave", "Phoenix", "Arizona", 85232);
		Address lisaAddress = new Address(lisa, "2222 E Washington Lane", "9838 W MLK Ave", "Detroit", "Chicago", 95532);
		Address terryAddress = new Address(terry, "8239 W Milford Ave", "8237 N Pollock Ave", "Gardena", "California", 10232);
		Address jimAddress = new Address(jim, "9238 W Virginia Ave", "8233 N Roosevelt St", "Seattle", "Oregon", 98101);

		print("Addresses of Instances of Person through Address Class:");

		//We can now retrieve a complete address by person using the Class itself instead of an instance. 
		print("Paul's address: " + Address.getAddressOfPerson(paul));
		print("Lisa's address: " + Address.getAddressOfPerson(lisa));
		print("Terry's address: " + Address.getAddressOfPerson(terry));
		print("Jim's address: " + Address.getAddressOfPerson(jim));
		
		print("Addresses of Instances of Person through the Instances themselves");

		//We can also use the instances of Person.
		print("Paul's address: " + paul.getAddress());
		print("Lisa's address: " + lisa.getAddress());
		print("Terry's address: " + terry.getAddress());
		print("Jim's address: " + jim.getAddress());

	}


	//print method
	private static void print(Object obj){
		System.out.println("------------------------");
		System.out.println(obj);
		System.out.println("------------------------");
	}
}
