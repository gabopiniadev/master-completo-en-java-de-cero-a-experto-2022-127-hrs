package org.course.flujocontrol;

import java.math.BigDecimal;

public class TareaThree {

    /*
        Multiplicar Numeros sin usar el simbolo de Multiplicacion
     */

    public static void main(String[] args) {

        Integer num1 = 5;
        Integer num2 = 6;
        BigDecimal result = new BigDecimal(num1).multiply(BigDecimal.valueOf(num2));

        System.out.println("result = " + result);



    }
}
