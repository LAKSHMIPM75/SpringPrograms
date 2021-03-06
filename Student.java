package com.edubridge.mySpring;
import java.util.Scanner;

public class Student {

	private String name;
	private int id;

	public Student() {
		
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	void readData() {
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		id = scanner.nextInt();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
