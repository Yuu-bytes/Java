/* 
 Criar um novo App em Java Console que permite usar a classe "Conta Bancária" para
 realizar DEPÓSITOS e SAQUES.
 1) Pedir a operação ao usuário
 2) Pedir o valor
 3) Imprimir o saldo atual
 4) Fazer programa rodar em loop (while(true))

 Criado por Yuu-bytes
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Banco {

    private static int opcao = 1;
    private static int opc_login = 1;
    public static double val;

    private static void menu() throws IOException {

        System.out.println("Bem vindo! O que gostaria? ");
        System.out.println("    0 - Sair");
        System.out.println("    1 - Entrar");
        System.out.println("    2 - Cadastrar");
        opc_login = new Scanner(System.in).nextInt();

        if (opc_login == 0) {
            System.exit(0);
        } else if (opc_login == 1) {
            String linha;

            FileReader leitor = new FileReader("E:\\3° Semestre\\Programação\\ExercicioContaBancaria_1\\clientes.txt");
            BufferedReader br = new BufferedReader(leitor);

            System.out.println("Qual o seu número?");
            int numero = new Scanner(System.in).nextInt();
            System.out.println("Qual a sua senha?");
            String senha = new Scanner(System.in).next();

            boolean logadoComSucesso = false;
            while ((linha = br.readLine()) != null) {
                String[] arrayLinhas = linha.split(";");
                if (numero == Integer.parseInt(arrayLinhas[0]) && senha.equals(arrayLinhas[1])) {
                    logadoComSucesso = true;
                }
            }

            if (logadoComSucesso == true) {
                System.out.println("Usuário logado com sucesso!");
                System.out.println("");
            } else {
                System.out.println("Usuário e/ou senha incorreto!");
                System.out.println("");
            }
        } else if (opc_login == 2) {
            FileWriter arqW = new FileWriter("E:\\3° Semestre\\Programação\\ExercicioContaBancaria_1\\clientes.txt", true);

            String ultimo = "";
            InputStream is = new FileInputStream("E:\\3° Semestre\\Programação\\ExercicioContaBancaria_1\\clientes.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String line = "";
            while (line != null) {
                line = br.readLine();
                if (line != null) {
                    ultimo = line;
                }
            }
            br.close();

            String[] loginSenha = ultimo.split(";");
            int numero = Integer.parseInt(loginSenha[0]);
            numero++;

            System.out.println("Seu número é: " + numero);
            System.out.println("Digite uma senha: ");
            String senha = new Scanner(System.in).next();
            arqW.write(numero + ";" + senha + "\n");
            arqW.close();

            System.out.println("------------------------------");
            System.out.println("Cadastro concluido com sucesso");
            System.out.println("Sua número é: " + numero);
            System.out.println("Sua senha é: " + senha);
            System.out.println("------------------------------");

            menu();
        } else {
            System.out.println("Comando Inválido");
            System.out.println("");
            menu();
        }
    }

    private static void opcoes() {

        System.out.println("O que vocÃª quer fazer?");
        System.out.println("    0 - Sair");
        System.out.println("    1 - Sacar");
        System.out.println("    2 - Depositar");
        System.out.println("    3 - Exibir Saldo");
        opcao = new Scanner(System.in).nextInt();
        System.out.println("");
    }

    public static void main(String[] args) throws IOException {

        menu();

        ContaBancaria usuario = new ContaBancaria();

        while (opcao != 0) {
            opcoes();
            if (opcao == 1) {
                System.out.println("Quanto você deseja sacar?");
                val = new Scanner(System.in).nextDouble();
                usuario.Sacar(val);
                System.out.println("");
            } else if (opcao == 2) {
                System.out.println("Quanto você quer depositar?");
                val = new Scanner(System.in).nextDouble();
                usuario.Depositar(val);
                Locale ptBr = new Locale("pt", "BR");
                String real = NumberFormat.getCurrencyInstance(ptBr).format(val);
                System.out.println("Você depositou: " + real);
                System.out.println("");
            } else if (opcao == 3) {
                Locale ptBr = new Locale("pt", "BR");
                String real = NumberFormat.getCurrencyInstance(ptBr).format(usuario.getSaldo());
                System.out.println("Seu SALDO é de: " + real);
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
