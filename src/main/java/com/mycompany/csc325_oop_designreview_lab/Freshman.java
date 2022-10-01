package com.mycompany.csc325_oop_designreview_lab;

// create the freshman class
public class Freshman extends Student {

    public Freshman(String address, short a, int credit) {
        super(address, a, credit);
    }
    
    @Override
    public String toString() {
        return "Freshman{" + super.toString() + '}';
    }

}