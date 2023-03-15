package cajero;

public class ConsultarSaldo extends Operaciones {

    @Override
    public void Transacciones() {
        System.out.println("----------------------------------");
        System.out.println(" Tu saldo actual es: " + getSaldo());
        System.out.println("----------------------------------");
    }
}
