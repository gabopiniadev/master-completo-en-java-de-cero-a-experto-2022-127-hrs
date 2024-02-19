package org.course.arrays;

import java.util.Arrays;

public class ExampleArrForInverse {

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

        //Iteracion for Normal
        System.out.println("Iterando nuestro array con el For comun");
        for(int i = 0; i < totalCount; i++) {
            System.out.println("El producto de esta posicion es = " + productsArrStr[i]);
        }

        System.out.println();

        //Iteracion for Normal
        //1er Metodo para Iterar a la inversa
        for (int i = 0; i < totalCount; i++) {
            System.out.println("El indice del producto es " + (totalCount-1-i) + " : " + productsArrStr[totalCount-1-i]);
        }

        System.out.println();
        //2do Metodo para Iterar a la inversa
        for (int i = totalCount - 1; i >= 0; i--) {
            System.out.println("El indice del producto es " + i + " : " + productsArrStr[i]);
        }

        System.out.println();

    }
}
