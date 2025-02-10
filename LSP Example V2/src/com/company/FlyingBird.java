package com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class FlyingBird implements IBird
{
    public abstract void fly();

    public void walk()
    {
        Logger.getAnonymousLogger().log(Level.FINE, "This characters can't walk!"); // Or any other way walking request should be handled
    }
}
