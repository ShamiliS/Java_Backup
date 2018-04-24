package com.DataDiscoveryTool.beans;

import java.util.ArrayList;

public class PatternBean {

	private static String id;
	private static String name;
	private static String address;
	private static String telephone;
	private static String email;

	public PatternBean() {

	}

	public static String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
