/*
    Criado por Yuu-bytes

    O objetivo era converter um valor em metros para kilometros.
*/

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Informe um valor em metros:");
        int valor = new Scanner (System.in).nextInt();
        double km = valor / 1000;

        System.out.println("Isso equivale a " + km + " kilometros");
    }
}
