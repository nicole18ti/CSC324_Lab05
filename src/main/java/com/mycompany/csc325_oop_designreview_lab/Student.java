package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human {

    private double GPA;
    private int credits;

    public Student(String address, short a, int credit) {
        super(address, a);
        this.credits = credits;

    }


    public double getGPA() {
        return GPA;
    }

    //  Add a field for GPA and create setter and getter
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return getName() + ": " + "GPA=" + GPA + ", credits=" + credits;
    }

    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    // make this class a child of Human
    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
}
