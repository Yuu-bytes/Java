/*
    Criado por Yuu-bytes

    O objetivo era mostrar na tela uma mensagem de acordo com a hora.
*/


import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Que horas são? (Informar em número inteiros)");
        int horas = new Scanner(System.in).nextInt();
        
        if (horas >= 7 && horas <= 12) {
            System.out.println("Bom Dia, está uma bela manhã");
            
        } else if (horas >= 13 && horas <= 18) {
            System.out.println("Boa Tarde, está uma bela tarde");
            
        } else if (horas >= 19 && horas <= 23) {
            System.out.println("Boa Noite, está uma bela noite");
            
        } else if (horas == 23 || (horas <= 6 && horas >= 0)) {
            System.out.println("Boa Madruga? Está uma bela madrugada");
            
        } else {
            System.out.println("Favor, informar a hora certa em números inteiros");
        }
        
    }
}
