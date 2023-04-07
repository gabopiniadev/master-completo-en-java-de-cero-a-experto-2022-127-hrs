package org.example;

import javax.swing.*;
import java.awt.*;

public class sysnum2 {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecial = 0;
        try{
            numeroDecial = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error en la variable numeroDecial, ingrese nuevamente el valor");
            main(args);
            System.exit(0);
        }

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String message = "El numero decimal es = " + numeroDecial + "\n";
        message += "El numero Binario es = " + numeroBinario + "\n";
        message += "El numero Octal es = " + numeroOctal + "\n";
        message += "El numero Hexadecimal es = " + numeroHex + "\n";

        JOptionPane.showMessageDialog(null, message);
     }
}
