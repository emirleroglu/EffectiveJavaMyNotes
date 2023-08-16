package com.company;

public class BooleanUtil {
    /**
     * Noninstantiable utility class
     */


    // Suppress default constructor for noninstantiability
    private BooleanUtil() {
        throw new AssertionError("Noninstantiable utility class. BooleanUtil");
    }

    public static boolean isNullOrFalse(Boolean value) {
        return value == null || !value;
    }

    public static boolean isNotNullAndTrue(Boolean value) {
        return value != null && value;
    }

}
