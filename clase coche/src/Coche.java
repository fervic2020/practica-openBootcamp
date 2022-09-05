public class Coche {

    static int puertas = 0;

    public void incrementarPuertas() {
        puertas++;
    }

    public static void main(String[] args) {

        Coche coche1 = new Coche();
        coche1.incrementarPuertas();
        System.out.println("el numero de puertas del coche es: " + puertas);

    }
}