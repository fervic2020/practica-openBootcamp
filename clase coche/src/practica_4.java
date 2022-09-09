import java.util.Scanner;

public class practica_4 {
    public static void main(String args[]){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("************************* Bienvenido *****************************");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000
        //                          Primera parte del ejercicio 4
        //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000

        Scanner entrada = new Scanner(System.in);
        int numeroIf;
        System.out.println("Primera parte del ejercicio 4");
        System.out.print("introduzca un número: ");
        numeroIf = entrada.nextInt();

        if (numeroIf < 0){
            System.out.println("El numero es negativo");
        } else if (numeroIf == 0){
            System.out.println("El numero es cero");
        } else {
            System.out.println("El numero es positivo");
        }

        //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000
        //                          Segunda parte del ejercicio 4
        //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000

        System.out.print("Segunda parte del ejercicio");
        int numeroWhile = -10;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;

        }

        //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000
        //                          Tercera parte del ejercicio 4
        //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000

        System.out.println("Tercera parte del ejercicio");
        int numeroDoWhile = 2;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);


        //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000
        //                          Cuarta parte del ejercicio 4
        //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000

        System.out.println("Cuarta parte del ejercicio");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }


        //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000
        //                          quinta y ultima parte del ejercicio 4
        //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000
        System.out.println("quinta y ultima parte del ejercicio 4");
        System.out.println("introduzca una estacion del año (verano, invierno, otoño o primavera, en minusculas): ");
        entrada.nextLine();
        String estacion = entrada.nextLine();


        switch (estacion){
            case "verano":
                System.out.println("nos encontramos en la estacion " + estacion);
                break;
            case "invierno":
                System.out.println("nos encontramos en la estacion " + estacion);
                break;
            case "otoño":
                System.out.println("nos encontramos en la estacion " + estacion);
                break;
            case "primavera":
                System.out.println("nos encontramos en la estacion " + estacion);
                break;
            default:
                System.out.println("no indujiste ninguna estacion del año");
        }


    }

}
