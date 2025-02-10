package com.company;

public class GameUser {
    IBird character;

    public GameUser(int characterCode) {
        switch (characterCode) {
            case 1:
                character = new Eagle();
                break;
            case 2:
                character = new Falcon();
                break;
            case 3:
                character = new Owl();
                break;
            case 4:
                character = new Pigeon();
                break;
            case 5:
                character = new Penguin();
                break;
        }
    }

    public void move() {
        character.fly();
        character.walk();
    }
}
