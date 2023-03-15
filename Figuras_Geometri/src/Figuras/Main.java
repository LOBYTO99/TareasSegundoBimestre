package Figuras;
public class Main {
    public static void main(String []args){
      
        Figura fig[] = new Figura[4];
        
        fig[0] = new Figura();
        fig[1] = new Rectangulo(0,0);
        fig[2] = new Circunferencia(0);
        fig[3] = new Triangulo(0,0);
        
        Figura f = new Figura();
        
        Figura r = new Rectangulo(25.3 , 58.2);
        Figura c = new Circunferencia(50.56);
        Figura t = new Triangulo(55.5 , 5.06);
        
        r.CalcularArea();
        c.CalcularArea();
        t.CalcularArea();  
    }
}
