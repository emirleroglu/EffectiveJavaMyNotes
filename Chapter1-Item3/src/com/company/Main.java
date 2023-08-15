package com.company;

import java.lang.reflect.Field;

public class Main {
    /**
     * Enforce the singleton property with a private constructor
     * or an enum type
     */
    public static void main(String[] args) throws NoSuchFieldException {


        Elvis elvis = Elvis.INSTANCE;

        elvis.leaveTheBuilding();
        // AccessibleObject.setAccessible() Reflect library
        Field field = Elvis.class.getDeclaredField("INSTANCE");
        field.setAccessible(true);

        ElvisSingleton elvisSingleton = ElvisSingleton.getInstance();
        elvisSingleton.leaveTheBuilding();

    }
}
