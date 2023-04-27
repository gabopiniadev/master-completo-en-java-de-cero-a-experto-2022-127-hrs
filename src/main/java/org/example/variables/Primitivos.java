package org.example.variables;

import java.util.Arrays;

public class Primitivos {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println(numeroByte);
        System.out.println("Tipo Byte corresponde a = " + Byte.BYTES);
        System.out.println("Tipo Bytes corresponde es = " +  Byte.SIZE);
        System.out.println("El Valor maximo de un byte es = " + Byte.MAX_VALUE);
        System.out.println("El Valor Minimo de un bytes es = " + Byte.MIN_VALUE + " \n");

            
        short numeroShort = 32676;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde a  = " + Short.BYTES);
        System.out.println("Tipo shorts corresponde es  = " + Short.SIZE);
        System.out.println("El Valor maximo de un short es = " + Short.MIN_VALUE);
        System.out.println("El Valor Minimo de un short es  = " + Short.MAX_VALUE + " \n");
        
        
        int numeroInt = 2147483637;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo Int corresponde a  = " + Integer.BYTES);
        System.out.println("Tipo Int corresponde es = " + Integer.SIZE);
        System.out.println("El Valor maximo de un Int es = " + Integer.MAX_VALUE);
        System.out.println("El Valor maximo de un Int es = " + Integer.MIN_VALUE + " \n");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo Long corresponde a  = " + Long.BYTES);
        System.out.println("Tipo Longs corresponde es = " + Long.SIZE);
        System.out.println("El Valor maximo de un long es = " + Long.MAX_VALUE);
        System.out.println("El Valor maximo de un long es = " + Long.MIN_VALUE + " \n");


        float numeroFloat = 9223372036854775807F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Tipo float corresponde a  = " + Float.BYTES);
        System.out.println("Tipo float corresponde es = " + Float.SIZE);
        System.out.println("El Valor maximo de un float es = " + Float.MAX_VALUE);
        System.out.println("El Valor maximo de un float es = " + Float.MIN_VALUE + " \n");
    }
}
