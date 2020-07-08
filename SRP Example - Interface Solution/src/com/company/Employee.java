package com.company;

public class Employee
{
    private IFinance CFO;
    private IHumanResources HR;
    private IOperations COO;
    private int employeeID;

    public Employee(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public double calculatePay()
    {
        COO = new Operations();
        int hoursWorked = COO.getHoursWorked(employeeID);

        HR = new HumanResources();
        double hourlyRate = HR.getHourlyRate(employeeID);

        double pay = hourlyRate * hoursWorked;

        CFO = new Finance();
        CFO.generatePaySlip(employeeID, pay);

        return pay;
    }
}
