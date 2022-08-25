package com.company;

public class Main {

    public static void main(String[] args) {
        // If
        int numeroIf = 0;
        if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es 0");
        }

        //While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El valor es: " + numeroWhile);
        }

        //Do while
        int numeroDoWhile = 0;
        int numeroApoyo = numeroDoWhile;
        do {
            numeroDoWhile++;
            System.out.println("El valor en el bucle DO es: " + numeroDoWhile);
        } while (numeroApoyo == numeroDoWhile);


        //for

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor en el FOR es: " + numeroFor);
        }


        //switch
        String estacion = "e";
        switch (estacion) {
            case "VERANO":
                System.out.println("La estacion es: " + estacion);
                break;

            case "INVIERNO":
                System.out.println("La estacion es: " + estacion);
                break;

            case "PRIMAVERA":
                System.out.println("La estacion es: " + estacion);
                break;

            case "OTOÑO":
                System.out.println("La estacion es: " + estacion);
                break;

            default:
                System.out.println("La estacion no es correcta");
        }


    }
}
