package Transporte;
public class Main {
    public static void main(String[]args){
        Bus_urbano rojo = new Bus_urbano();
        rojo.Potencia();
        Bus_inter azul = new Bus_inter();
        azul.Potencia();
        Taxi_formal yellow = new Taxi_formal();
        yellow.Potencia();
        Taxi_informal plomo = new Taxi_informal();
        plomo.Potencia();
    }
}
