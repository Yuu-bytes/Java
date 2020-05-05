/*
    Criado por Yuu-bytes

    O objetivo era converter F° em C° e C° em F°.
*/


import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        int valor;
        double c;
        double f;
        
        do {
            System.out.println("");
            System.out.println("O que você quer fazer? ");
            System.out.println("");
            System.out.println("    0 - Sair");
            System.out.println("    1 - Converter F° em C°");
            System.out.println("    2 - Converter C° em F°");
            valor = new Scanner(System.in).nextInt();

            if (valor == 1) {
                System.out.println("");
                System.out.println("Informe um valor em F°");
                f = new Scanner(System.in).nextDouble();
                c = (f - 32) / 1.8;
                System.out.println("O seu valor em C° é " + c);
                
            } else if (valor == 2) {
                System.out.println("");
                System.out.println("Informe uma temperatura em C°");
                c = new Scanner(System.in).nextDouble();
                f = c * 1.8 + 32;
                System.out.println("Em F° seria: " + f);
                
            } else if (valor != 0) {
                System.out.println("Operação Inválida");
            }

        } while (valor != 0);
    }
}
