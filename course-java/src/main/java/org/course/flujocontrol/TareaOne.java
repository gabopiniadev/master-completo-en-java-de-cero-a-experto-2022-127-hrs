package org.course.flujocontrol;

import java.util.*;

public class TareaOne {

    /*
        Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros, usando la clase Scanner
        ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir el
        numero entero, entonces se requiere:

        Calcular el menor número e imprimir el valor.

        Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero menor es igual o mayor que 10!".
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> numberList = new ArrayList<>();
        
        System.out.println("Ingrese una lista de numeros enteros separados por una coma(,)");
        String valueList = sc.next();

        numberList = Arrays.asList(valueList.split(","));

        for(int i = 0; i < numberList.size(); i++) {

            int numberValidation = Integer.parseInt(numberList.get(i));

            if(numberValidation < 10) {
                System.out.println("El numero " + numberValidation + " es menor a 10");
            }else{
                System.out.println("El numero " + numberValidation + " es mayor o igual a 10");
            }
        }

        //En este print obtenemos de la lista el numero que sea mas grande
        System.out.println("El numero mas grande de esta lista es = " + Collections.max(numberList));

        //En este print obtenemos de la lista el numero que sea mas pequeno.
        System.out.println("El numero mas pequeno de esta lista es = " + Collections.min(numberList));
    }
}
