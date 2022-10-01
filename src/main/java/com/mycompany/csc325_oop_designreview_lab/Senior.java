package com.mycompany.csc325_oop_designreview_lab;

// create a senior class
public class Senior extends Student {

    int credits;

    // add the constructor for senior
    public Senior(String address, short a, int credit) {
        super(address, a, credit);
    }
// if students doesn't complete 85 credits, show false

    public boolean errorMessage() {
        if (credits < 85) {
            return false;
        }
        return true;
    }

}
