package com.day3.session1.empmgtapp2;

public class Freelancer implements Payable{
    private int id;
    private String companyRegNo;
    private double assignmentCost;

    public Freelancer(int id, String companyRegNo, double assignmentCost) {
        this.id = id;
        this.companyRegNo = companyRegNo;
        this.assignmentCost = assignmentCost;
    }

    @Override
    public double getPayement() {
        return assignmentCost*.8;
    }
}
