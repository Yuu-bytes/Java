/*
    Criado por Yuu-bytes

    O objetivo era mostrar todos os anos desdo ano atual até o ano de 2000.
*/

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Informe em que ano estamos");
        int ano = new Scanner (System.in).nextInt();
        
        for (int a = ano; a >= 2000; a--)
        {
            System.out.println(a);
        }

    }
}
