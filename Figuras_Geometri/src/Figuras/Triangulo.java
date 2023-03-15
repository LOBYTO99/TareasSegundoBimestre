package Figuras;
public class Triangulo extends Figura {
    protected double altura;
    protected double ancho;

    public Triangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public double getAncho() {
        return ancho;
    }
    @Override
    public double CalcularArea(){
        System.out.println(" El area del triangulo es: " + altura*ancho/2);
        return altura*ancho/2;
    }
}
