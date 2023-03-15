package Figuras;
public class Rectangulo extends Figura {

    protected double largo;
    protected double ancho;
    
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    @Override
    public double CalcularArea(){
        System.out.println(" El area del rectangulo es: " + largo*ancho);
       return largo*ancho;
}
}
