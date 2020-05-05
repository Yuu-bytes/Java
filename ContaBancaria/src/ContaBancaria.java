
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
            this.saldo += valor;
        }
    }
    
    private int numero;
    private int agencia;
    private double saldo;
}
