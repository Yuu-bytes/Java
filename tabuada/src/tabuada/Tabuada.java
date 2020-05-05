
package tabuada;

import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        
        System.out.println("Digite de que número você quer a tabuada:");
        int tabuada = new Scanner(System.in) .nextInt();
        System.out.println("Digite até que número você quer que vá a tabuada:");
        int ate = new Scanner(System.in) .nextInt();
        System.out.println("---------------------");
        for (int i = 0; i <= ate; i++){
            int res = i * tabuada;
            System.out.println(tabuada + " x " + i + " = " + res);
        }
        System.out.println("---------------------");
    }
    
}
