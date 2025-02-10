package com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class NonFlyingBird implements IBird {
    public void fly() {
        Logger.getAnonymousLogger().log(Level.FINE, "This characters can't fly!"); // Or any other way flying request should be handled
    }

    public abstract void walk();
}
