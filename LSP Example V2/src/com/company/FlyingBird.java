package com.company;

public abstract class FlyingBird implements IBird
{
    public abstract void fly();

    public void walk()
    {
        throw new RuntimeException(this.getClass().getSimpleName() + " characters can't walk!");
    }
}
