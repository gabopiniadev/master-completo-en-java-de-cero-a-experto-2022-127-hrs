package org.course.variables;

public class PrimitiveInteger {

    /*
        Las variables Primitivas de tipo Integer son todos aquelos tipos de datos Numericos que sirven para
        determinar o asignar valores de tipo numero.
     */
    public static void main(String[] args) {

        //int es un tipo de dato numerico, el cual permite almacenar numeros enteros entre el
        //0 al 2147483647 y tambien entre el -2147483647 al 2147483647,
        // si superas este margen, dara error, esto se debe que int usa 32 bits
        int numberReference = 2147483647;
        System.out.println("Integer Reference = " + numberReference);

        System.out.println("Este es el tamano de byte de este tipo de datos " + Integer.BYTES);
        System.out.println("Este es el tamano de bits de este tipo de datos " + Integer.SIZE);
        System.out.println("Este es el valor minimo del tipo de dato Integer " + Integer.MIN_VALUE);
        System.out.println("Este es el valor Maximo del tipo de dato Integer " + Integer.MAX_VALUE);

        System.out.println();

        //double: Es un tipo de datos primitivo de punto flotante con una precisión de 64 bits. Puede almacenar valores aproximados
        //desde 4.9E-324 hasta 1.7976931348623157E308.
        double numberDoubleReference = 1.7976931348623157E308D;
        System.out.println("Double Reference = " + numberDoubleReference);

        System.out.println("Este es el tamano de byte de este tipo de datos " + Double.BYTES);
        System.out.println("Este es el tamano de bits de este tipo de datos " + Double.SIZE);
        System.out.println("Este es el valor minimo del tipo de dato Double " + Double.MIN_VALUE);
        System.out.println("Este es el valor Maximo del tipo de dato Double " + Double.MAX_VALUE);

        System.out.println();

        //long es un tipo de dato numerico, el cual permite almacenar numeors enteros entre el
        //0 al 9223372036854775807L o -9223372036854775807L al 9223372036854775807L
        long numberLongReference = 9223372036854775807L;
        System.out.println("Long Reference = " + numberLongReference);

        System.out.println("Este es el tamano de byte de este tipo de datos " + Double.BYTES);
        System.out.println("Este es el tamano de bits de este tipo de datos " + Double.SIZE);
        System.out.println("Este es el valor minimo del tipo de dato Double " + Double.MIN_VALUE);
        System.out.println("Este es el valor Maximo del tipo de dato Double " + Double.MAX_VALUE);

        System.out.println();

        //float: Es un tipo de datos primitivo de punto flotante con una precisión de 32 bits. Puede almacenar valores aproximados
        // desde 1.4E hasta 3.4028235E38.
        float numberFloatReference = 3.4028235E38F;
        System.out.println("Float Reference = " + numberFloatReference);

        System.out.println("Este es el tamano de byte de este tipo de datos " + Float.BYTES);
        System.out.println("Este es el tamano de bits de este tipo de datos " + Float.SIZE);
        System.out.println("Este es el valor minimo del tipo de dato Float " + Float.MIN_VALUE);
        System.out.println("Este es el valor Maximo del tipo de dato Float " + Float.MAX_VALUE);

        System.out.println();

        //Es un tipo de datos primitivo entero con una precisión de 16 bits.
        //Puede almacenar valores desde -32,768 hasta 32,767.
        short shortReference = 32677;
        System.out.println("Short Reference = " + shortReference);

        System.out.println("Este es el tamano en byte del tipo de dato Short " + Short.BYTES);
        System.out.println("Este es el tamano de bits del tipo de dato Short " + Short.SIZE);
        System.out.println("Este es el valor minimo del tipo de dato Short " + Short.MIN_VALUE);
        System.out.println("Este es el valor maximo del tipo de dato Short " + Short.MAX_VALUE);

        System.out.println();

        //Es un tipo de datos primitivo entero con una precisión de 8 bits.
        //Puede almacenar valores desde -128 hasta 127.
        byte byteReference = 127;
        System.out.println("byteReference = " + byteReference);

        System.out.println("Este es el tamano de byte de este tipo de datos " + Byte.BYTES);
        System.out.println("Este es el tamano de bits de este tipo de datos " + Byte.SIZE);
        System.out.println("Este es el valor minimo del tipo de dato Byte " + Byte.MIN_VALUE);
        System.out.println("Este es el valor Maximo del tipo de dato Byte " + Byte.MAX_VALUE);

    }
}
