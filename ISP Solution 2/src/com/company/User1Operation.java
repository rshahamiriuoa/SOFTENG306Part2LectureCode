package com.company;

interface IUser1Operations
{
    void operation1();
    void commonOperation1();
}

public class User1Operation extends Operation implements IUser1Operations
{
    public void operation1()
    {
        System.out.println("User 1 operation is performed.");
    }
}
