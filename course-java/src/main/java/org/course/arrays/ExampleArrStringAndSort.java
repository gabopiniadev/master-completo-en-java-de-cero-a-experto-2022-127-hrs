package org.course.arrays;

import java.util.Arrays;

public class ExampleArrStringAndSort {

    public static void main(String[] args) {

        /*
             Iteracion de String
         */

        String[] productsArrStr = new String[7];
        int totalCount = productsArrStr.length;

        productsArrStr[0] = "Kigston Pendrive 64GB";
        productsArrStr[1] = "Samsung Galaxy";
        productsArrStr[2] = "Disco Duro SSD Samsung Externo";
        productsArrStr[3] = "Asus Notebook";
        productsArrStr[4] = "Macbook Air";
        productsArrStr[5] = "Chromecast 4th Generation";
        productsArrStr[6] = "Bicicleta Oxford";

        //Esta herramienta nos permite ordenar nuestro array
        Arrays.sort(productsArrStr);

        //Iteracion for
        System.out.println("Iterando nuestro array con el For comun");
        for(int i = 0; i < totalCount; i++) {
            System.out.println("El producto de esta posicion es = " + productsArrStr[i]);
        }

        System.out.println("");

        //Iteracion ForEach
        System.out.println("Iterando nuestro array con el ForEach");
        for(String prodArr: productsArrStr) {
            System.out.println("El producto de esta posicion es = " + prodArr);
        }

        System.out.println("");

        //Iteracion While
        System.out.println("Iterando nuestro array con While");
        int i = 0;
        while(totalCount>i) {
            System.out.println("El producto de esta posicion es = " + productsArrStr[i]);
            i++;
        }

        System.out.println("");

        System.out.println("Iterando nuestro array con el do While");
        int j = 0;
        do{
            System.out.println("El producto de esta posicion es = " + productsArrStr[j]);
            j++;
        }while(totalCount>j);

        System.out.println();

        /*
               Iteracion de Numeros
         */

        int[] arrTypeNumber = new int[10];
        int arrTypeNumLength = arrTypeNumber.length;

        //Llenar nuestro array
        for(int a = 0; a < arrTypeNumLength; a++) {
            arrTypeNumber[a] = a*3;
        }

        for(int a = 0; a < arrTypeNumLength; a++) {
            System.out.println("El valor es " + arrTypeNumber[a]);
        }

    }
}
