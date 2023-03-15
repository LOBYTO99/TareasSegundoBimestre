package cajero; 
import java.util.Scanner;
public abstract class Operaciones extends Usuario{

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner sc = new Scanner(System.in); 
    // Creamos un metodo que nos muestre las opciones y se repita hasta salir del programa
    public void Opciones() {
        int cont = 0;
        int op = 0;
        do {
            do {
                System.out.println("Por favor seleccione una opcion");
                System.out.println("    1. Consultar saldo. ");
                System.out.println("    2. Retirar. ");
                System.out.println("    3. Depositar. ");
                System.out.println("    4. Salir. ");
                op = sc.nextInt();

                if (op >= 1 && op <= 4) {
                    cont = 1;
                } else {
                    System.out.println("-----------------------------------");
                    System.out.println("Opcion incorrecta, intente otra vez");
                    System.out.println("-----------------------------------");
                }
            } while (cont == 0);
            
            if(op == 1){
                Operaciones objeto = new ConsultarSaldo();
                objeto.Transacciones();
            }else if(op == 2){
                Operaciones objeto = new Retirar();
                objeto.Transacciones();
            }else if(op == 3){
                Operaciones objeto = new Depositar();
                objeto.Transacciones();
            }else if(op == 4){
                System.out.println("-----------------------------");
                System.out.println("Gracias, lo esperamos pronto.");
                System.out.println("-----------------------------");
                cont = 2;
            }
        } while (cont != 2);
    }
     // Metodo abstracto que nos permite que las demas clases lo hereden
    @Override
    public abstract void Transacciones();
     // Creamos metodos 
    public void Retiro(){
        retiro = sc.nextInt();
    }
    public void Deposito(){
        deposito = sc.nextInt();
    }
    
    // Creamos setter y getter para la variable saldo porque es un dato privado.
   
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
