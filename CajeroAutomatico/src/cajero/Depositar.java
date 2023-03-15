package cajero;
public class Depositar extends Operaciones {

    @Override
    public void Transacciones() {
        System.out.print(" Cuanto desea depositar : ");
        Deposito();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("---------------------------------");
        System.out.println(" Su deposito fue de : " + deposito);
        System.out.println("----------------------------------");
        System.out.println(" Tu saldo actual es: " + getSaldo());
        System.out.println("----------------------------------");
    }
}
