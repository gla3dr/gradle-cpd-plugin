package de.aaschmid.clazz.impl;

import de.aaschmid.clazz.Clazz;

public class Clazz2 implements Clazz {

    private void methodBefore() { /* ... */ }

    @Override
    public boolean isClazz(Clazz clazz) {
        return clazz != null;
    }
}
