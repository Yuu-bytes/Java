/* 
 Criar um novo App em Java Console que permite usar a classe "Conta BancÃ¡ria" para
 realizar DEPÃ“SITOS e SAQUES.
 1) Pedir a operaÃ§Ã£o ao usuÃ¡rio
 2) Pedir o valor
 3) Imprimir o saldo atual
 4) Fazer programa rodar em loop (while(true))
 */
import java.util.Scanner;

public class Banco {

    private static int opcao = 1;
    
    private static void menu() {
    
            System.out.println("O que vocÃª quer fazer?");
            System.out.println("    0 - Sair");
            System.out.println("    1 - Sacar");
            System.out.println("    2 - Depositar");
            System.out.println("    3 - Exibir Saldo");
            opcao = new Scanner(System.in).nextInt();
            System.out.println("");
}

    public static void main(String[] args) {
        
        
        ContaBancaria usuario = new ContaBancaria();
        while (opcao != 0) {
            menu();
            if (opcao == 1) {
                System.out.println("Quanto você deseja sacar?");
                double valor = new Scanner(System.in).nextDouble();
                usuario.Sacar(valor);
                System.out.println("");
            } else if (opcao == 2) {
                System.out.println("Quanto você quer depositar?");
                double val = new Scanner(System.in).nextDouble();
                usuario.Depositar(val);
                System.out.println("Você depositou: " + val);
                System.out.println("");
            } else if (opcao == 3) {
                System.out.println("Seu SALDO é de: " + usuario.getSaldo());
                System.out.println("");
            } else if (opcao != 0) {
                System.out.println("COMANDO INVÁLIDO");
                System.out.println("");
            }

        }
    }
}

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
