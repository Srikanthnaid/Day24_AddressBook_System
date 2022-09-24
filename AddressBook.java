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

	public static void main(String[] args) {
		System.out.println("--------------------Welcome To Address Book Program-----------------------");
		AddressBook obj = new AddressBook();
		obj.addContact();
		obj.displayContacts();

	}
}