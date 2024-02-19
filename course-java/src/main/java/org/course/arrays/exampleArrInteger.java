package org.course.arrays;

public class exampleArrInteger {
    public static void main(String[] args) {

        //Ejemplo Array Tipo Entero - Integer
        //En este ejemplo le decimos que el array tendra 5 elementos
        int[] arrTypeNumber = new int[5];

        //Asignar valor a una posicion especifica del array
        //Importante recordar que el valor debe ser del mismo tipo de dato
        arrTypeNumber[0] = 1;
        arrTypeNumber[1] = 2;
        arrTypeNumber[2] = 3;
        arrTypeNumber[3] = 4;

        //Podemos tambien usar Metodos de conversion para transformat a Integer el valor numerico que se le envie
        arrTypeNumber[4] = Integer.parseInt("5");

        int i = arrTypeNumber[0];
        int j = arrTypeNumber[1];
        int k = arrTypeNumber[2];
        int m = arrTypeNumber[3];
        int n = arrTypeNumber[4];



        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        //Para obtener el ultimo elemento del array debe ser el arr.length - 1
        System.out.println("El ultimo elemento de nuestro array es " + arrTypeNumber[arrTypeNumber.length - 1]);


    }
}
