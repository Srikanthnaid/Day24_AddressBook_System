package com.AddressBook;

import java.util.ArrayList;

public class AddressBookList {
	String userInputBookName;
	ArrayList<ContactInfo> contact;

	// constructor
	public AddressBookList(String userInputBookName) {
		this.userInputBookName = userInputBookName;
		this.contact = new ArrayList<ContactInfo>();
	}

	public String getUserInputBookName() {
		return userInputBookName;
	}

	public void setUserInputBookName(String userInputBookName) {
		this.userInputBookName = userInputBookName;
	}

	@Override
	public String toString() {
		return "Address Book name :- " + userInputBookName + "\n" + "Contacts :- " + contact;
	}
}
