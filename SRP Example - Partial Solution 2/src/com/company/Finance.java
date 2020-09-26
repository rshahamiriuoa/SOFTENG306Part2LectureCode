package com.company;


public class Finance {
    private Payslip payslip;
    TechnologyServices CTO;
    private HumanResources HR;
    private Operations COO;

    public Finance() {
        System.out.println("Finance is engaged.");
    }

    private int getHoursWorked(int employeeID) {
        COO = new Operations();
        return COO.getHoursWorked(employeeID);
    }

    private double getHourlyRate(int employeeID) {

        HR = new HumanResources();
        return HR.getHourlyRate(employeeID);
    }

    private double getPay(int employeeID) {
        double hourlyRate = getHourlyRate(employeeID);
        int hoursWorked = getHoursWorked(employeeID);
        return hourlyRate * hoursWorked;
    }

    public Payslip generatePaySlip(int employeeID) {
        double pay = getPay(employeeID);

        payslip = new Payslip(employeeID, pay);
        storePayslip(payslip);
        return payslip;
    }

    private void storePayslip(Payslip payslip) {
        CTO = new TechnologyServices();
        CTO.storePayslip(payslip);
    }
}
