
package newpackage;

public class Dado {
//ATRIBUTOS
    private int numero;
    private boolean VolverAlanzar;
//CONSTRUCTOR
    public Dado(int numero, boolean VolverAlanzar) {
        this.numero = numero;
        this.VolverAlanzar = VolverAlanzar;
    }
//GETTERS Y SETTERS
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isVolverAlanzar() {
        return VolverAlanzar;
    }

    public void setVolverAlanzar(boolean VolverAlanzar) {
        this.VolverAlanzar = VolverAlanzar;
    }
//METODOS
    public void mostrar (){
        System.out.println(numero + "");
        
    }
}
