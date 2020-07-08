package com.company;

interface ITechnologyServices
{
    public void storePayslip(Payslip payslip);
}

public class TechnologyServices implements ITechnologyServices
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
