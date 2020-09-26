package com.company;


public class TechnologyServices
{

    public TechnologyServices()
    {
        System.out.println("TechnologyServices is engaged.");
    }

    public void storePayslip(Payslip payslip)
    {
        System.out.println("Payslip for " + payslip.getEmployeeID() + " with payment of $" + payslip.getPayAmount() + " is stored");
    }
}
