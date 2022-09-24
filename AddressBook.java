package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	static Scanner input = new Scanner(System.in);
	static ArrayList<ContactInfo> contactBook = new ArrayList<>();

	public void addContact() {
		System.out.print("Enter First Name:- ");
		String first = input.next();

		System.out.print("Enter Last Name:- ");
		String last = input.next();

		System.out.print("Enter Address:- ");
		String add = input.next();

		System.out.print("Enter City:- ");
		String city = input.next();

		System.out.print("Enter State:- ");
		String state = input.next();

		System.out.print("Enter Zip Code:- ");
		int zip = input.nextInt();

		System.out.print("Enter Phone Number:- ");
		long phone = input.nextLong();

		System.out.print("Enter E-mail:- ");
		String email = input.next();

		ContactInfo contact = new ContactInfo(first, last, add, city, state, zip, phone, email);
		contactBook.add(contact);

		System.out.println("\nContact added Successfully.");
	}

	public void displayContacts() {
		System.out.println("\n---------------Contacts in Address Book----------------");
		for (ContactInfo person : contactBook) {
			System.out.println(person.toString());
		}
	}

	// Building edit contact feature
	public void editContact() {
		System.out.println("\nEnter first name to edit :- ");
		String name = input.next();

		for (ContactInfo person : contactBook) {
			if (name.equals(person.first_Name)) {
				System.out.print("\nSelect option to edit..." + " 1.First_name." + " 2.Last_name." + " 3.Address."
						+ " 4.City" + " 5.State" + " 6.Zip_code" + " 7.Phone_number" + " 8.Email :- ");
				int option = input.nextInt();
				switch (option) {
				case 1:
					System.out.print("Enter new first name :- ");
					String newFirstName = input.next();
					person.setFirst_Name(newFirstName);
					System.out.println("First name is updated.");
					break;

				case 2:
					System.out.print("Enter new last name :- ");
					String newLastName = input.next();
					person.setLast_Name(newLastName);
					System.out.println("Last name is updated.");
					break;

				case 3:
					System.out.print("Enter new Address :- ");
					String newAddress = input.next();
					person.setAddress(newAddress);
					System.out.println("Address is updated.");
					break;

				case 4:
					System.out.print("Enter new city name :- ");
					String newCity = input.next();
					person.setCity(newCity);
					System.out.println("City is updated.");
					break;

				case 5:
					System.out.print("Enter new state name :- ");
					String newState = input.next();
					person.setState(newState);
					System.out.println("State is updated.");
					break;

				case 6:
					System.out.print("Enter new Zip code :- ");
					int newZip = input.nextInt();
					person.setZip_code(newZip);
					System.out.println("Zip code is updated.");
					break;

				case 7:
					System.out.print("Enter new phonr number :- ");
					long newPhone = input.nextLong();
					person.setPhone_number(newPhone);
					System.out.println("Phone number is updated.");
					break;

				case 8:
					System.out.print("Enter new email :- ");
					String newEmail = input.next();
					person.setEmail(newEmail);
					System.out.println("Email is updated.");
					break;

				default:
					System.out.println("Please enter a number between 1 to 8 only...");

				}
			} else {
				continue;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("--------------------Welcome To Address Book Program-----------------------");
		AddressBook obj = new AddressBook();
		obj.addContact();
		obj.displayContacts();

	}
}