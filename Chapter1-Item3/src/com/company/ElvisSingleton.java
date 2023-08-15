package com.company;

public class ElvisSingleton {
    private static final ElvisSingleton INSTANCE = new ElvisSingleton();

    private ElvisSingleton() {
    }

    // readResolve method to preserve singleton property
    private Object readResolve() {
        return INSTANCE;
    }

    public static ElvisSingleton getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("Elvis has left the building.");
    }
}
