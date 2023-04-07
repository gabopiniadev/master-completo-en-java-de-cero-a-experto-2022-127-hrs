package org.example;

public class charorcharacter {
    public static void main(String[] args) {
        char character = 'a';
        char caracter = '\u8840';
        char decimal = 64;

        System.out.println("character = " + character);
        System.out.println("Caracter = " + caracter);
        System.out.println("Decimal = " + decimal);

        char simbolo = '@';
        System.out.println("Simbolo = " + simbolo);
        System.out.println("Simbolo + caracter es = " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabular = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';


        System.out.println("El tipo char corresponde en byte a = " + Character.BYTES);
        System.out.println("El tipo char corresponde en bytes a = " + Character.SIZE);
        System.out.println("El valor maximo de un Char es de = " + Character.MAX_VALUE);
        System.out.println("El Valor minimo de un Char es de = " + Character.MIN_VALUE);
    }
}
