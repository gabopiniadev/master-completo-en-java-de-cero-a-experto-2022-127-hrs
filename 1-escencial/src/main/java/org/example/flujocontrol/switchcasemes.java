package org.example.flujocontrol;

import java.util.Scanner;

public class switchcasemes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes que desea saber su nombre!");
        int mes = s.nextInt();
            switch(mes) {
                case 1:
                    System.out.println("El mes seleccionado es: Enero");
                    break;
                case 2:
                    System.out.println("El mes seleccionado es: Febrero");
                    break;
                case 3:
                    System.out.println("El mes seleccionado es: Marzo");
                    break;
                case 4:
                    System.out.println("El mes seleccionado es: Abril");
                    break;
                case 5:
                    System.out.println("El mes seleccionado es: Mayo");
                    break;
                case 6:
                    System.out.println("El mes seleccionado es: Junio");
                    break;
                case 7:
                    System.out.println("El mes seleccionado es: Julio");
                    break;
                case 8:
                    System.out.println("El mes seleccionado es: Agosto");
                    break;
                case 9:
                    System.out.println("El mes seleccionado es: Septiembre");
                    break;
                case 10:
                    System.out.println("El mes seleccionado es: Octrubre");
                    break;
                case 11:
                    System.out.println("El mes seleccionado es: Novimienbre");
                    break;
                case 12:
                    System.out.println("El mes seleccionado es: Diciembre");
                    break;
                default:
                    System.out.println("El mes seleccionado es invalid!");
                    break;

            }
    }
}
