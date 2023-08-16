package com.company;

public class Main {
    /**
     * o a class can be made noninstantiable by including a private constructor
     *
     * @see BooleanUtil
     */
    public static void main(String[] args) {
        boolean x = true;
        if (BooleanUtil.isNotNullAndTrue(x)) {
            System.out.println("True");
        }
        //   BooleanUtil booleanUtil = new BooleanUtil(); istesemde yeni bir util class nesnesi üretemiyorum. Private Constructor sağolsun.
    }
}
