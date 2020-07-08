package com.company;

interface IOperations
{
    int getHoursWorked(int employeeID);
}
public class Operations implements IOperations
{
    public Operations()
    {
        System.out.println("Operations is engaged.");
    }
    public int getHoursWorked(int employeeID)
    {
        return 38;
    }
}
