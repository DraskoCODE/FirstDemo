package com.company;

public class Main {

    public static void main(String[] args) {
	 System.out.println("First GIT Project");

     BodyCalculator bodyCalculator = new BodyCalculator(80,186);
     System.out.println(bodyCalculator.calculateBodyMassIndex(bodyCalculator.getMass(), bodyCalculator.getHeight()));

    }
}
