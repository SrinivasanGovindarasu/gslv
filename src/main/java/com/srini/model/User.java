package com.srini.model;

import java.time.LocalDate;

public class User {

	private int id;
	private String name;
	private String location;
	private LocalDate date;

	public User(int id, String name, String location, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", location=" + location + ", date=" + date + "]";
	}

}
