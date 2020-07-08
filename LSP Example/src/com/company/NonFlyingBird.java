package com.company;

public abstract class NonFlyingBird implements IBird
{
    public void fly()
    {
        throw new RuntimeException(this.getClass().getSimpleName() + " characters don't fly!");
    }

    public abstract void walk();

}
