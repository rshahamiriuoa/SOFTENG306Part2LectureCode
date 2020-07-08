package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.println("**************************************");
        System.out.println("Enter 1 for Eagle");
        System.out.println("Enter 2 for Falcon");
        System.out.println("Enter 3 for Owl");
        System.out.println("Enter 4 for Pigeon");
        System.out.println("Enter 5 for Penguin");
        System.out.println("**************************************");

        while (true) {
            // Get player's character
            System.out.print("Please select your character: ");
            int characterCode = reader.nextInt();

            GameUser player = new GameUser(characterCode);
            player.move();
            System.out.println("**************************************");
        }
    }

}
