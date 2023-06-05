public class Automovil implements Comparable<Automovil>{

    public static void main(String[] args) {
        
        private int id;
        private String fabricante;
        private String modelo;
        private Color color = Color.GRIS;
        private Motor motor;
        private Estanque estanque; 
        private Rueda[] rueda; 
        private int indiceRuedas;

        private TipoAutomovil tipo;

        private static Color colorPatente = Color.NARANJO;
        private static int capacidadEstanqueEstatico = 30;
        private static int ultimoId;

        public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
        public static final int VELOCIDADAD_MAX_CIUDAD = 60;

        public static final String COLOR_ROJO = "Rojo";
        public static final String COLOR_AMARILLO = "Amarillo";
        public static final String COLOR_AZUL = "Azul";
        public static final String COLOR_BLANCO = "Blanco";
        public static final String COLOR_GRIS = "Gris Oscuro";

        public Automovil() {
            this.id = ++ultimoId;
            this.rueda = new Rueda[5];
        }

        public Automovil(String fabricante, String modelo) {
            this.fabricante = fabricante;
            this.modelo = modelo;
        }

        public Automovil(String fabricante, String modelo, Color color) {
            this(fabricante, modelo);
            this.color = color;
        }



    }
    
}
