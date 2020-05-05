
public class Main {
    
    public static void main(String[] args) {
        
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

    }
}
