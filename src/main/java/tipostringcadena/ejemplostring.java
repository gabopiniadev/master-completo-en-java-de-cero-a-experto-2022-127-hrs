package tipostringcadena;

public class ejemplostring {
    public static void main(String[] args) {
        String curso = new String("Programacion Java");
        String cursoo = "Programacion Java"; // Objeto

        boolean validation = curso.equals(cursoo); // Compara el Valor
        System.out.println("validation = " + validation);

        boolean validation2 = curso == cursoo; //Compara referencia
        System.out.println("validation2 = " + validation2);
    }
}
