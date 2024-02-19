package org.course.arrays;

import java.util.Arrays;

public class ExampleArrFor {

    public static void main(String[] args) {


        String[] productsArr = new String[7];

        productsArr[0] = "Kigston Pendrive 64GB";
        productsArr[1] = "Samsung Galaxy";
        productsArr[2] = "Disco Duro SSD Samsung Externo";
        productsArr[3] = "Asus Notebook";
        productsArr[4] = "Macbook Air";
        productsArr[5] = "Chromecast 4th Generation";
        productsArr[6] = "Bicicleta Oxford";

        //Esta herramienta nos permite ordenar nuestro array
        Arrays.sort(productsArr);

        String productOne = productsArr[0];
        String productTwo = productsArr[1];
        String productThree = productsArr[2];
        String productFour = productsArr[3];
        String productFive = productsArr[4];
        String productSix = productsArr[5];
        String productSeven = productsArr[6];

        System.out.println("El producto 1 es = " + productOne);
        System.out.println("El producto 2 es = " + productTwo);
        System.out.println("El producto 3 es = " + productThree);
        System.out.println("El producto 4 es = " + productFour);
        System.out.println("El producto 5 es = " + productFive);
        System.out.println("El producto 6 es = " + productSix);
        System.out.println("El producto 7 es = " + productSeven);
    }
}
