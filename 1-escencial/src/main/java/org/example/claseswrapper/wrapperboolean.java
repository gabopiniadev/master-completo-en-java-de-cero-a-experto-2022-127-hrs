package org.example.claseswrapper;

public class wrapperboolean {

    public static void main(String[] args) {
        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf(false);
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean3 = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);



    }
}
