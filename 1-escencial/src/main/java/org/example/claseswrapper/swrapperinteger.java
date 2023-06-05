package org.example.claseswrapper;

public class swrapperinteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);

        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valueLcd = "67000";
        Integer valorR = Integer.valueOf(valueLcd);
        System.out.println("valorR = " + valorR);

        Short valueS = intObjeto.shortValue();
        System.out.println("valueS = " + valueS);

        Byte valueB = intObjeto.byteValue();
        System.out.println("valueB = " + valueB);

        Long valueL = Long.valueOf(intObjeto);
        System.out.println("valueL = " + valueL);
    }
}
