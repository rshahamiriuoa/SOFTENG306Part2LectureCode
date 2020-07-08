package com.company;

interface IUser2Operations
{
    void operation2();
    void commonOperation1();
}

public class User2Operation extends Operation implements IUser2Operations
{
    public void operation2()
    {
        System.out.println("User 2 operation is performed.");
    }
}
