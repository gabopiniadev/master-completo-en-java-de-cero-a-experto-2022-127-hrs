package org.example;

public class booleanorlogic {
    public static void main(String[] args) {

        boolean datoLogicoV1 = Boolean.TRUE;
        boolean datoLogicoF1 = Boolean.FALSE;

        boolean datoLogicoV2 = true;
        boolean datoLogicoF2 = false;


        System.out.println("El valor de este Dato Booleano es = " + datoLogicoV1);
        System.out.println("El valor de este Dato Booleano es = " + datoLogicoV2);
        System.out.println("El valor de este Dato Booleano es = " + datoLogicoF1);
        System.out.println("El valor de este Dato Booleano es = " + datoLogicoF2);
        
        double d = 98765.43e-3d;
        System.out.println("d = " + d);
        
        float f = 1.2345e2f;
        System.out.println("f = " + f);
        
        boolean datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);
        
        boolean esIgual = (3-2==1);
        System.out.println("esIgual = " + esIgual);
        
    }
}
