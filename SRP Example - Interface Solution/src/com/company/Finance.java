package com.company;

interface IFinance
{
    Payslip generatePaySlip(int employeeID, double amount);
}

public class Finance implements IFinance
{
    private Payslip payslip;
    ITechnologyServices CTO;

    public Finance()
    {
        System.out.println("Finance is engaged.");
    }

    public Payslip generatePaySlip(int employeeID, double amount)
    {
        payslip = new Payslip(employeeID, amount);
        storePayslip(payslip);
        return payslip;
    }

    private void storePayslip(Payslip payslip)
    {
        CTO = new TechnologyServices();
        CTO.storePayslip(payslip);
    }
}



