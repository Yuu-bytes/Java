/*
    Criado por Yuu-bytes

    O objetivo era mostrar todos os anos desdo ano atual até o ano de 2000.
*/

import java.util.Calendar;


public class Exercicio3_upgrade {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println("Ano atual: " + year);
        
        for (int a = year; a >= 2000; a--)
        {
            System.out.println(a);
        }

    }
}
