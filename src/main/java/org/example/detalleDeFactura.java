package org.example;

import java.util.Scanner;

public class detalleDeFactura {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura");
        String nombreFactura = scann.nextLine();

        System.out.println("Ingrese el primer precio");
        double price1 = 0;
        try {
             price1 = scann.nextDouble();
        }catch (Exception e) {
            System.out.println("Por favor, revisar el monto ingresado, vuelva a intentarlo");
            main(args);
            System.exit(0);
        }

        System.out.println("Ingrese el segundo precio");
        double price2 = 0;
        try {
             price2 = scann.nextDouble();
        }catch (Exception e) {
            System.out.println("Por favor, revisar el monto ingresado, vuelva a intentarlo");
            main(args);
            System.exit(0);
        }

        var suma = price1 + price2;
        var impuesto = 0.19;
        var resultpre = suma*impuesto;

        var resultdef = suma+resultpre;

        String message = "El nombre de la factura es = " + nombreFactura + "\n";
        message += "El precio sin iva es = " + suma + "\n";
        message += "El monto del Impuesto agregado es = " + resultpre + "\n";
        message += "El monto total del producto es = " + resultdef + "\n";

        message += "La factura " + nombreFactura + " tiene un total bruto de " + suma + "," + " con un impuesto de " + resultpre + " y el monto despues" +
                " de impuesto es de  " + resultdef + "\n" + "Saludos al Curso!!! Andres Guzman!";

        System.out.println("message = " + message);


    }
}
