package org.course.flujocontrol;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TareaTwo {

    /*
        Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
        Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

        Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

        Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.

        Preguntas de esta tarea
        Cuál es el código de la clase main de la tarea
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> notesValue = new ArrayList<>();
        String notesText = "";
        String alumnName = "";
        Double noteAlumnDouble = 0.0;
        Double countFor = 0.0;

        Double promideAlumn = 0.0;

        try{
            System.out.println("Ingrese el nombre del alumno a promediar");
            alumnName = sc.next();

            if(alumnName == null) {
                throw new Exception("El nombre del alumno no puede ser null");
            }

            System.out.println("Agrege 20 notas del alumno para proceder a promediar al alumno");
            notesText = sc.next();

            notesValue = Arrays.asList(notesText.split(","));

            if(notesValue.size() < 20) {
                throw new Exception("El valor ingresado no es igual a 20 notas del alumno");
            }

            for(String valueNotes: notesValue) {
                noteAlumnDouble = Double.parseDouble(valueNotes);

                countFor += noteAlumnDouble;

            }

            promideAlumn = countFor / notesValue.size();

            System.out.println("El promero del alumno " + alumnName + " es = " + promideAlumn);



        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
