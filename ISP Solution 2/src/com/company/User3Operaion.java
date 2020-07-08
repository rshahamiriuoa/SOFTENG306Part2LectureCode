package com.company;

interface IUser3Operations
{
    void operation3();
    void commonOperation1();
}

public class User3Operaion extends Operation implements IUser3Operations
{
    public void operation3()
    {
        System.out.println("User 3 operation is performed.");
    }
}
