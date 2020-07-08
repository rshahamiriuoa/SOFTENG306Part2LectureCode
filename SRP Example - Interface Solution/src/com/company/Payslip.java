package com.company;

public class Payslip
{
    private int employeeID;
    private double payAmount;

    public Payslip(int employeeID, double payAmount)
    {
        this.employeeID = employeeID;
        this.payAmount = payAmount;
        System.out.println("A new payslip for Employee " + String.valueOf(employeeID) + " is created.");
    }

    public double getPayAmount()
    {
        return payAmount;
    }

    public int getEmployeeID()
    {
        return employeeID;
    }
}
