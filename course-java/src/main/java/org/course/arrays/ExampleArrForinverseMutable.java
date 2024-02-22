package org.course.arrays;

import java.util.Arrays;

public class ExampleArrForinverseMutable {

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
        for (int i = 0; i < totalCount/2; i++) {
            String thiss = productsArrStr[i];
            String inverse = productsArrStr[totalCount-1-i];
            productsArrStr[i] = inverse;
            productsArrStr[totalCount-1-i] = thiss;
        }

        System.out.println("Iterando nuestro array con el For comun");
        for(int i = 0; i < totalCount; i++) {
            System.out.println("El producto de esta posicion es = " + productsArrStr[i]);
        }
    }
}
