package com.tka.voterEncapsulation;

public class Voter {
	private int voterId;
	private String name;
	private int age;

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		if (age >= 18) {

			System.out.println("Valid for voting");
		}
		
		else {
			System.out.println("Not valid for voting");
		}
	}
}
