package com.AddressBook;

public class ContactInfo {
	String first_Name;
	String last_Name;
	String address;
	String city;
	String state;
	int zip_code;
	long phone_number;
	String email;

	public ContactInfo(String fn, String ln, String add, String city, String state, int zip, long phone, String email) {

		this.first_Name = fn;
		this.last_Name = ln;
		this.address = add;
		this.city = city;
		this.state = state;
		this.zip_code = zip;
		this.phone_number = phone;
		this.email = email;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		last_Name = last_Name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		state = state;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		zip_code = zip_code;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		email = email;
	}

	public String toString() {
		return String.format(first_Name + " " + last_Name + " " + address + " " + city + " " + state + " " + zip_code
				+ " " + phone_number + " " + email);
	}
}
