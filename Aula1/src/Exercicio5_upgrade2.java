
/*
    Criado por Yuu-bytes
    O objetivo era mostrar na tela uma mensagem de acordo com a hora.
*/

import java.util.Calendar;

import java.util.Calendar;



public class Exercicio5_upgrade2 {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int min = data.get(Calendar.MINUTE);
        System.out.println("São: " + hora + " horas e " + min + " minutos");
        
        if ((hora >= 07 && hora <= 12) && (min >= 00 && min <= 59)) {
            System.out.println("Bom Dia, está uma bela manhã");
            
        } else if ((hora >= 13 && hora <= 18) && (min >= 00 && min <= 59)) {
            System.out.println("Boa Tarde, está uma bela tarde");
            
        } else if ((hora >= 19 && hora <= 23) && (min >= 00 && min <= 59)) {
            System.out.println("Boa Noite, está uma bela noite");
            
        } else if (((hora == 23) || hora <= 6 && hora >= 0) && (min >= 00 && min <= 59)) {
            System.out.println("Boa Madruga? Está uma bela madrugada");
        }
    }
}