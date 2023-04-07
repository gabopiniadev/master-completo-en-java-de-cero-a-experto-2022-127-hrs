package org.example;

public class sysnum1 {
    public static void main(String[] args) {
        //Convertir Numeros Int a Numeros Binarios
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        //Convertir Numeros Int a numeros Binarios
        System.out.println("numeroBinario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        //Convertir Numeros Int a Numeros Octal
        System.out.println("Numero Octal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        //Convertir Numeros Int a Numeros hexadecimal
        System.out.println("Numero Hexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) + "\n");
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        //Convertir

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario Convertido  = " + numeroBinario + " = " + Integer.toString(numeroBinario));
    }
}
