package com.AddressBook;

import java.util.ArrayList;

public class AddressBookList {
	String userInputBookName;
	ArrayList<ContactInfo> contact;
	
	// parameterized constructor
	public AddressBookList(String userInputBookName) {
		this.userInputBookName = userInputBookName;
		this.contact = new ArrayList<ContactInfo>();
	}

	// getters and methods.
	public String getUserInputBookName() {
		return userInputBookName;
	}

	public void setUserInputBookName(String userInputBookName) {
		this.userInputBookName = userInputBookName;
	}
	
	
	public ArrayList<ContactInfo> getContact() {
		return contact;
	}

	public void setContact(ArrayList<ContactInfo> contact) {
		this.contact = contact;
	}

	/*** Overriding toString() method ***/
	@Override
	public String toString() {
		return "Address Book name :- " + userInputBookName + "\n" + "Contacts :- " + contact;
	}
}
