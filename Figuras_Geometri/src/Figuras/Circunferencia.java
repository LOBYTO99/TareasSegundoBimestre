package Figuras;
public class Circunferencia extends Figura {
    protected double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    @Override
    public double CalcularArea(){
        System.out.println(" El radio de la circunferncia es " + radio);
        return radio;
    }
}
