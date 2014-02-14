package batalla.naval;

import java.util.Scanner;

public class Tablero {

    int x, y = 0;
    int barcos = 0;
    int seleccion, seleccion2 = 0;
    boolean horizontal = true;
    int tablero[][] = new int[25][25];
    Scanner t = new Scanner(System.in);

    public void imprimir() {
        for (int filas = 0; filas < tablero.length; filas++) {
            for (int columnas = 0; columnas < tablero[filas].length; columnas++) {
                System.out.print(tablero[filas][columnas] + " ");
            }
            System.out.println();
        }

        while (barcos < 5) {
            System.out.println("que barco deseas ingresar?");
            System.out.println("1.-Portaviones        5 espacios");
            System.out.println("2.-Submarino          4 espacios");
            System.out.println("3.-Buque Lanzamisiles 3 espacios");
            System.out.println("4.- Buque sencillo    2 espacios");
            System.out.println("5.- Patrulla          1 espacio");
            seleccion = t.nextInt();
            System.out.println("6.- Horizontal");
            System.out.println("7.- Vertical");
            seleccion2 = t.nextInt();
            System.out.println("Ingresa las coordendas");
            x = t.nextInt();
            y = t.nextInt();
            if (seleccion2 == 6) {
                horizontal = true;
            } else {
                horizontal = false;
            }
            switch (seleccion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;




            }



            barcos++;



        }
    }

    public void portaviones() {
        String[] porta = {"+", "+", "+", "+", "+"};
        if (horizontal == true) {

            for (int filas = 0; filas < tablero.length; filas++) {
                for (int columnas = 0; columnas < tablero[filas].length; columnas++) {
                    if (tablero[filas][columnas] == x) {
                        for (int i = 0; i < 5; i++) {
                            tablero[filas][i] = 8;
                        }
                    }
                }
            }

        }else{
        
        for (int filas = 0; filas < tablero.length; filas++) {
                for (int columnas = 0; columnas < tablero[filas].length; columnas++) {
                    if (tablero[filas][columnas] == x) {
                        for (int i = 0; i < 5; i++) {
                            tablero[i][columnas] = 8;
                        }
                    }
                }
            }
        
        
        
        }
    }
}
