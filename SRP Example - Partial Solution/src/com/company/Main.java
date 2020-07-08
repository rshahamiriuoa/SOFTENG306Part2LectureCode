package com.company;

public class Main
{
    static private Employee employee;

    public static void main(String[] args)
    {
        employee = new Employee(123456);
        employee.calculatePay();
    }
}
