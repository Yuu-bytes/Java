/*
    Criado por Yuu-bytes

    O objetivo era somar dois valores que o usuário escolheçe e mostrar esse resultado na tela.
*/
import java.util.Scanner;


public class Exercicio1 {
    
    public static void main(String[] args) {
        
        System.out.println("Informe o primeiro valor:");
        int valor1 = new Scanner (System.in).nextInt();
        System.out.println("Informe o segundo valor:");
        int valor2 = new Scanner (System.in).nextInt();

        int resultado = valor1 + valor2;
        
        System.out.println("O resultado é: " + resultado);
        
    }
}
