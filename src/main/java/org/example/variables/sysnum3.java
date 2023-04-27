package org.example.variables;

import javax.swing.*;
import java.util.Scanner;

public class sysnum3 {

      static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");

        //String numeroStr = scanner.nextLine();

        int numeroDecial = 0;
        try{
            numeroDecial = scanner.nextInt(); //Integer.parseInt(numeroStr);
        }catch (Exception e){
            System.out.println("Error, debe ingresar un valor numerico");
            main(args);
            System.exit(0);
        }

        int numeroBinario = 0b11110;
        int numeroOctal = 036;
        int numeroHex = 0x1e;


        String message = "El numero decimal es = " + numeroDecial + "\n";
        message += "El numero Binario es = " + numeroBinario + "\n";
        message += "El numero Octal es = " + numeroOctal + "\n";
        message += "El numero Hexadecimal es = " + numeroHex + "\n";

        System.out.println("message = " + message);
    }
}
