
import java.text.NumberFormat;
import java.util.Locale;


public class ContaBancaria {

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void Depositar(double valor){
    
        this.saldo += valor;
    }
    
    public void Sacar(double valor){
        
        if(this.saldo >= valor){
            this.saldo -= valor;
            Locale ptBr = new Locale("pt", "BR");
            String real = NumberFormat.getCurrencyInstance(ptBr).format(Banco.val);
            System.out.println("Você sacou: " + real);
        } else {
            System.out.println("Você não tem saldo suficiente");
        }
    }
    
    private int numero;
    private int agencia;
    private double saldo;
}
