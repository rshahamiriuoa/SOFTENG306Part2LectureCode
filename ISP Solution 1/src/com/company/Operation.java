package com.company;

interface IUser1Operations
{
    void user1Operation();
}

interface IUser2Operations
{
    void user2Operation();
}

interface IUser3Operations
{
    void user3Operation();
}

public class Operation implements IUser1Operations, IUser2Operations, IUser3Operations
{
    public void user1Operation()
    {
        System.out.println("Performing User 1 operations");
    }

    public void user2Operation()
    {
        System.out.println("Performing User 2 operations");
    }

    public void user3Operation()
    {
        System.out.println("Performing User 2 operations");
    }
}
