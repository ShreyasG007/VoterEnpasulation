package com.tka.voterEncapsulation;

public class TestVoter {
	public static void main(String[] args) {
		Voter voter = new Voter();
		
		voter.setVoterId(1);
		voter.setName("Shreyas");
		voter.setAge(25);
		
		System.out.println();
		System.out.println("Voter details");
		System.out.println("Id : "+voter.getVoterId());
		System.out.println("Name : "+voter.getName());
		System.out.println("Age : "+ voter.getAge());
		
		System.out.println();
		voter.setAge(16);
		System.out.println();
		System.out.println("Voter details");
		System.out.println("Id : "+voter.getVoterId());
		System.out.println("Name : "+voter.getName());
		System.out.println("Age : "+ voter.getAge());
		
		
	}
}
