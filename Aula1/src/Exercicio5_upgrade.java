/*
    Criado por Yuu-bytes

    O objetivo era mostrar na tela uma mensagem de acordo com a hora.
*/


import java.util.Arrays;
import java.util.Scanner;


public class Exercicio5_upgrade {
    public static void main(String[] args) {
        System.out.println("Que horas são?");
        String horas = new Scanner(System.in).next();
        String[] horas_separadas = horas.split(":");
        int h = Integer.parseInt(horas_separadas[0]);
        int m = Integer.parseInt(horas_separadas[1]);

        // System.out.println(Arrays.toString(horas_separadas)); // verificar as horas digitadas
        
        
        if ((h >= 07 && h <= 12) && (m >= 00 && m <= 59)) {
            System.out.println("Bom Dia, está uma bela manhã");
            
        } else if ((h >= 13 && h <= 18) && (m >= 00 && m <= 59)) {
            System.out.println("Boa Tarde, está uma bela tarde");
            
        } else if ((h >= 19 && h <= 23) && (m >= 00 && m <= 59)) {
            System.out.println("Boa Noite, está uma bela noite");
            
        } else if (((h == 23) || h <= 6 && h >= 0) && (m >= 00 && m <= 59)) {
            System.out.println("Boa Madruga? Está uma bela madrugada");
            
        } else {
            System.out.println("Favor, informar a hora certa em números inteiros, separando as horas e os minutos por " + ":");
        }
    }
}
