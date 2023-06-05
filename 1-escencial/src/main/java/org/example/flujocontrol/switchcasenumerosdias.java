package org.example.flujocontrol;

import java.util.Scanner;

public class switchcasenumerosdias {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero de mes que desea saber sus dias!");
        int mes = s.nextInt();
        int numeroDias;
        String nombre = null;

        switch(mes) {
            case 1:
                nombre = "Enero";
                numeroDias = 31;
                break;
            case 2:
                nombre = "Febrero";
                numeroDias = 28;
                break;
            case 3:
                nombre = "Marzo";
                numeroDias = 31;
                break;
            case 4:
                nombre = "Abril";
                numeroDias = 30;
                break;
            case 5:
                nombre = "Mayo";
                numeroDias = 31;
                break;
            case 6:
                nombre = "Junio";
                numeroDias = 30;
                break;
            case 7:
                nombre = "Julio";
                numeroDias = 31;
                break;
            case 8:
                nombre = "Agosto";
                numeroDias = 31;
                break;
            case 9:
                nombre = "Septiembre";
                numeroDias = 30;
                break;
            case 10:
                nombre = "Octubre";
                numeroDias = 31;
                break;
            case 11:
                nombre = "Noviembre";
                numeroDias = 30;
                break;
            case 12:
                nombre = "Diciembre";
                numeroDias = 31;
                break;
            default:
                nombre = "es invalido";
                numeroDias = 00;
                break;

        }


        System.out.println("El mes" + " " + nombre + " " + "Tiene" + " " + numeroDias + " Dias");
    }
}
