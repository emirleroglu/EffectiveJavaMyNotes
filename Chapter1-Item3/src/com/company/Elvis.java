package com.company;

public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    /*
    The private constructor is called only once, to initialize the public static final
    field Elvis.INSTANCE. The lack of a public or protected constructor guarantees a
    “monoelvistic” universe: exactly one Elvis instance will exist once the Elvis
    class is initialized—no more, no less.
     */
    private Elvis() {
    }

    public void leaveTheBuilding() {
        System.out.println("Elvis has left the building.");
    }
}
