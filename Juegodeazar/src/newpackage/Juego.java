package newpackage;

import java.io.PrintStream;
import java.util.Scanner;

public class Juego {

    Scanner teclado = new Scanner(System.in);
    //atributos
    private int[][] tablaPuntuaciones;
    private Dado[] dados = new Dado[5];
    private String[] jugadores;

    static int[] lanzamiento() {
        int[] resultados = new int[5];

        resultados[0] = (int) (Math.random() * 6 + 1);
        resultados[1] = (int) (Math.random() * 6 + 1);
        resultados[2] = (int) (Math.random() * 6 + 1);
        resultados[3] = (int) (Math.random() * 6 + 1);
        resultados[4] = (int) (Math.random() * 6 + 1);
        return resultados;
    }
    private boolean hayGanador;
    
    private int mayorPunt;
    

    //metodos
    void menu() {
        inicializaciones();
        registrarjugadores();
        mostrar();
    }

    void inicializaciones() {
        //inicializaciones de los dados
        System.out.println(" Cuantos jugadores son: ");
        int n = Integer.parseInt(teclado.nextLine());

        jugadores = new String[n];
        tablaPuntuaciones = new int[n][2];
    }

    private void registrarjugadores() {
        System.out.println("\n Introdusca nombres ");
        for (var i = 0; i < jugadores.length; i++) {
            System.out.printf("Jugador #%d: ", (i + 1));
            jugadores[i] = teclado.nextLine();

        }
        boolean hayGanador = false;
        for (int i = 0; i < 2 && !hayGanador; i++) {
            System.out.print("\n\t\t\tTURNO #" + (i + 1));
            int n=0;

            for (int j = 0; j < jugadores.length && !hayGanador; j++) {
                System.out.printf("\n\nLanza el jugador %s --> ", jugadores[j]);

                int[] dados = lanzamiento();
                System.out.printf("Dado1:  %d\tDado2:  %d\tDado3: %d\tDado4: %d\tDados5:  %d\t", dados[0], dados[1], dados[2], dados[3], dados[4]);

                if (dados[0] == dados[1] && dados[1] == dados[2] && dados[2] == dados[3] && dados[3] == dados[4]) {
                    System.out.println("\nHa ganado el Jugador " + jugadores[j]);
                    hayGanador = true;
                } else {
                    tablaPuntuaciones[j][i] = dados[0] + dados[1] + dados[2] + dados[3] + dados[4];
                }
            }

            System.out.println("\n\n\t\tPULSE INTRO PARA CONTINUAR");
            teclado.nextLine();

        }
        if (!hayGanador) {
            int mayorPunt = 0;
            String jugadorMayorPunt = new String();
            System.out.println("\n\n\t\tTABLA DE RESULTADOS");
            for (int i = 0; i < jugadores.length; i++) {
                System.out.print("\n" + jugadores[i]);
                for (int j = 0; j < 2; j++) {
                    int puntos = tablaPuntuaciones[i][j];
                    System.out.print("\t" + puntos);
                    if (puntos > mayorPunt) {
                        mayorPunt = puntos;
                        jugadorMayorPunt = jugadores[i];
                    }
                }
            }

            System.out.printf("\n\n***Ha ganado %s al conseguir un puntaje de %d***", jugadorMayorPunt, mayorPunt);

        }

    }

    private void mostrar() {
        teclado.close();
        System.out.println("\n\n\t\t\tFIN DE PROGRAMA");
        
    }
}
