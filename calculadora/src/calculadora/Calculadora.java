package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static double resultado;
    
    public static void res(){
        System.out.println("O resultado da sua operação é: " + resultado);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Digite o primeiro número:");
        int valor1 = new Scanner (System.in) .nextInt();
        System.out.println("Digite a operação:");
        System.out.println("----------------------");
        System.out.println("    + para somar");
        System.out.println("    - para diminuir");
        System.out.println("    * para multiplicar");
        System.out.println("    / para dividir");
        System.out.println("----------------------");

        String operacao = new Scanner (System.in) .next();
        System.out.println("Digite o segundo número:");
        int valor2 = new Scanner (System.in) .nextInt();
        
        System.out.println("");
        
        if (operacao.equals("+")){
            resultado = valor1 + valor2;
            res();
        }
        else if (operacao.equals("-")){
            resultado = valor1 - valor2;
            res();
        }
        else if (operacao.equals("/")){
            resultado = valor1 / valor2;
            res();
        }
        else if (operacao.equals("*")){
            resultado = valor1 * valor2;
            res();
        }
        else {
            System.out.println("Operação Inválida");
        }
    }
    
}
