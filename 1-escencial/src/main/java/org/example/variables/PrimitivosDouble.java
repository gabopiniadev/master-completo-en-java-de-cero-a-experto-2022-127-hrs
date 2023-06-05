package org.example.variables;

public class PrimitivosDouble {
    public static void main(String[] args) {

        float numeroFloat = 0.00000000015f;
            System.out.println("numeroFloat = " + numeroFloat);
            System.out.println("Tipo float corresponde a  = " + Float.BYTES);
            System.out.println("Tipo float corresponde es = " + Float.SIZE);
            System.out.println("El Valor maximo de un float es = " + Float.MAX_VALUE);
            System.out.println("El Valor maximo de un float es = " + Float.MIN_VALUE + " \n");

        double numeroDouble = 3.4028235E39;
            System.out.println("numeroFloat = " + numeroDouble);
            System.out.println("Tipo double corresponde a  = " + Double.BYTES);
            System.out.println("Tipo double corresponde es = " + Double.SIZE);
            System.out.println("El Valor maximo de un double es = " + Double.MAX_VALUE);
            System.out.println("El Valor maximo de un double es = " + Double.MIN_VALUE + " \n");

        var numeroVar = 3.1416f;
            System.out.println("numeroFloat = " + numeroVar);
            System.out.println("Tipo var corresponde a  = " + Float.BYTES);
            System.out.println("Tipo var corresponde es = " + Float.SIZE);
            System.out.println("El Valor maximo de un var es = " + Float.MAX_VALUE);
            System.out.println("El Valor maximo de un var es = " + Float.MIN_VALUE + " \n");

    }
}
