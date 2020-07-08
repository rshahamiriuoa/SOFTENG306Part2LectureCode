package com.company;

interface IHumanResources
{
    double getHourlyRate(int empolyeeID);
}

public class HumanResources implements IHumanResources
{
    public HumanResources()
    {
        System.out.println("HumanResources is engaged.");
    }

    public double getHourlyRate(int empolyeeID)
    {
        return 20.0;
    }
}
