package com.company;

public class Main {

    public static void main(String[] args) {

        IUser1Operations user1;
        IUser2Operations user2;
        IUser3Operations user3;

        user1=new User1Operation();
        user2 = new User2Operation();
        user3= new User3Operaion();

        user1.operation1();
        user1.commonOperation1();

        user2.operation2();
        user2.commonOperation1();

        user3.operation3();
        user3.commonOperation1();
    }
}
