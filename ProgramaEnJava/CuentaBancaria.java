public class CuentaBancaria {

    public static void main(String[] args) {

        double saldo = 1000.75;
        double cantidadAretirar = 250;
        double saldoActualizado = saldo-cantidadAretirar;
        double cantidadParaCadaamigo = saldoActualizado/3;
        double puedeComparaTicket = cantidadParaCadaamigo;
        System.out.println("saldo para cada amigo para compara el  ticket:   "+cantidadParaCadaamigo);        
    }
}
