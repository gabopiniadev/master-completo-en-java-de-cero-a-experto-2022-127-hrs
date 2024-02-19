package org.course.variables;

import org.course.variables.Entity.Usuario;

import java.math.BigDecimal;

public class IntroductionVars {

    public static void main(String[] args) {
        //Tipo de dato Numerico de Referencia
        int numero = 10;

        //Tipo de dato Numerico de Clase
        Integer number = 10;

        //Tipo de dato Character de Referencia
        String nombre = "Gabriel";

        //Tipo de dato Tipo Objeto
        Usuario usuario = new Usuario("Gaabriel");


    /*
        Las variables es requerido tener en cuenta que siempre tendran 3 elementos
            - Tipo de datos
            - Nombre de Variable
            - Asignacion de Valor
     */

        /*
            Cuando hablamos de bits es la capacidad maxima que se le otorga en memoria
            a cada variable.
            Tenemos los siguientes ejmplos.
            8 bits = es 1 byte(1 byte = 8 bits)
            16 bits = son 2 bytes(1 byte = 8 bits)
            32 bits = son 4 bytes(1 byte = 8 bits)
            64 bits = son 8 bytes(1 byte = 8 bits)

            cuando elegimos entre 32 y 64 elegimos entre:
            precision(La cantidad de valores distintos que puede representar) y
            eficiencia(Cuanta memoria estas dispuesto a usar)
         */

    /*
        Ejemplo de tipos de datos
        de tipo Referencia
    */

        //int es un tipo de dato numerico, el cual permite almacenar numeros enteros entre el
        //0 al 2147483647 y tambien entre el -2147483647 al 2147483647,
        // si superas este margen, dara error, esto se debe que int usa 32 bits
        int numberReference = 2147483647;
        System.out.println("Integer Reference = " + numberReference);

        //double: Es un tipo de datos primitivo de punto flotante con una precisión de 64 bits. Puede almacenar valores aproximados
        //desde 4.9E-324 hasta 1.7976931348623157E308.
        double numberDoubleReference = 1.7976931348623157E308D;
        System.out.println("Double Reference = " + numberDoubleReference);

        //long es un tipo de dato numerico, el cual permite almacenar numeors enteros entre el
        //0 al 9223372036854775807L o -9223372036854775807L al 9223372036854775807L
        long numberLongReference = 9223372036854775807L;
        System.out.println("Long Reference = " + numberLongReference);

        //float: Es un tipo de datos primitivo de punto flotante con una precisión de 32 bits. Puede almacenar valores aproximados
        // desde 1.4E hasta 3.4028235E38.
        float numberFloatReference = 3.4028235E38F;
        System.out.println("Float Reference = " + numberFloatReference);

        //Es un tipo de datos primitivo entero con una precisión de 16 bits. Puede almacenar valores desde -32,768 hasta 32,767.
        short shortReference = 32678;
        System.out.println("Short Reference = " + shortReference);

        //Es un tipo de datos primitivo entero con una precisión de 8 bits. Puede almacenar valores desde -128 hasta 127.
        byte byteReference = 127;
        System.out.println("byteReference = " + byteReference);

        //char: Es un tipo de datos primitivo que representa un carácter Unicode y tiene una precisión de 16 bits. Puede almacenar valores desde '\u0000'
        //(o 0) hasta '\uffff' (o 65,535).
        char charReference = '\u0020';
        System.out.println(charReference);

        //boolean: Es un tipo de datos primitivo que representa un valor verdadero o falso. Sólo puede tener los valores true o false.
        boolean valueBooleanReference = false;
        System.out.println("valueBooleanReference = " + valueBooleanReference);


    /*
        Ejemplo de tipos de datos
        de Tipo Clase
    */

        //Analiza los numeros obtenidos y determina cual de los dos es mayor.
        Integer numberClass = Integer.max(9, 5);
        System.out.println("numberClass = " + numberClass);

        // Asignamos a la variable el Objeto Boolean con el valor FALSE
        Boolean value2 = Boolean.FALSE;

        //BigDecimal es un tipo de datos de tipo Object o Class,
        // el cual permite representar Valores Decimales o convertir valores Enteros en
        // Decimales.
        BigDecimal valueBigDecimal = BigDecimal.valueOf(1);
        System.out.println(valueBigDecimal);

        //String: No es un tipo de datos primitivo, pero es una clase especial en Java. Se utiliza para almacenar
        //una secuencia de caracteres o una cadena de texto. Los valores de las cadenas son inmutables,
        // lo que significa que una vez que se crea una cadena, no se puede cambiar.
        String stringCharReference = "String value reference";
        System.out.println(stringCharReference);

        //
        Long valueLong = Long.valueOf("10");

    }

}
