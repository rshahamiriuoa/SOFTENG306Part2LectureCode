package com.company;

public class Employee
{
    private Finance CFO;

    private int employeeID;

    public Employee(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public void calculatePay()
    {


        CFO = new Finance();
        CFO.generatePaySlip(employeeID);


    }
}
