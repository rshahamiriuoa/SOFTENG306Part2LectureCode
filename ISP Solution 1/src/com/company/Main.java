package com.company;

public class Main {

    public static void main(String[] args) {

        IUser1Operations user1;
        IUser2Operations user2;
        IUser3Operations user3;

        user1=new Operation();
        user2 = new Operation();
        user3= new Operation();

        user1.user1Operation();
        user2.user2Operation();
        user3.user3Operation();
    }
}
