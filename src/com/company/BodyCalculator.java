package com.company;

public class BodyCalculator {
    private double mass;
    private double height;

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public BodyCalculator (double mass, double height){
        this.mass = mass;
        this.height = height;
    }

    public double calculateBodyMassIndex (double mass, double height) {
        double toReturn = 0;
        toReturn = mass / (height * height);
        return toReturn;

    }

    public void print() {
        System.out.println("branch");
    }




}
