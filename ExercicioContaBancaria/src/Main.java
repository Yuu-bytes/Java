/* 
Criar um novo App em Java Console que permite usar a classe "Conta Bancária" para
realizar DEPÓSITOS e SAQUES.
    1) Pedir a operação ao usuário
    2) Pedir o valor
    3) Imprimir o saldo atual
    4) Fazer programa rodar em loop (while(true))
*/


import java.util.Scanner;


public class Main {
    
    private static int opcao;
    
    private static void menu(){
    System.out.println("O que você quer fazer?");
        System.out.println("    0 - Sair");
        System.out.println("    1 - Sacar");
        System.out.println("    2 - Depositar");
        opcao = new Scanner(System.in).nextInt();
    }
    
    public static void main(String[] args) {
        
        do{
        System.out.println("Informe sua agência:");
        int agencia = new Scanner(System.in).nextInt();
        System.out.println("Informe seu número:");
        int numero = new Scanner(System.in).nextInt();

        if (agencia == 01 && numero == 123) {
            continue;
        } else {
            break;
        }
            menu();
        } while (opcao != 0);
        /*
        ContaBancaria CC1 = new ContaBancaria(); 
        CC1.setNumero(123);
        CC1.Depositar(100);
        CC1.Depositar(10);
        CC1.Sacar(1000);
        System.out.println("SALDO CC1: " + CC1.getSaldo());
        
        ContaBancaria CC2 = new ContaBancaria();
        CC2.setNumero(345);
        CC2.Depositar(2000);
        CC2.Depositar(800);
        CC2.Sacar(100);
        System.out.println("SALDO CC2: " + CC2.getSaldo());
        */
    }
}
