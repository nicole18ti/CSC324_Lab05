package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human { // make this class a child of Human

    public Student(String address, short a) {
        super(address,a);
    }
    private double GPA;

    public double getGPA() {
        return GPA;
    }

    //  Add a field for GPA and create setter and getter
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }


    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
