package org.example.claseswrapper;

public class examplegetclass {
    public static void main(String[] args) {
        
        String texto = "Hola Mundo!!";
        Class strClass = texto.getClass();

        System.out.println("strClass = " + strClass);

    }
}
