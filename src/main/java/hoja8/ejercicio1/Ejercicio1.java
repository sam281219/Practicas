/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja8.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author samus
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Array a = new Array();
        int num;
        do{
            System.out.println("Opciones");
            System.out.println("1. Introducir");
            System.out.println("2. Mostrar");
            System.out.println("3. Media");
            System.out.println("4. Modificar");
            System.out.println("5. Izquierda");
            System.out.println("6. Derecha");
            System.out.println("7.  Comparar");
            System.out.println("8. Pares");
            System.out.println("9. Multiplciacion");
            System.out.println("10. Salir");
            num = t.nextInt();
            switch(num){
                case 1 -> a.introducir();
                case 2 -> a.mostrar();
                case 3 -> System.out.println("La media es: "+a.media());
                case 4 -> {
                    System.out.println("Introduce el valor que desea agregar");
                    int s =t.nextInt();
                    System.out.println("Introduce la posicion: ");
                    int p = t.nextInt();
                    a.modificar(s, p);
                }
                case 5 -> a.rotarIzquierda();
                case 6 -> a.rotarDerecha();
                case 7 -> {
                    Array a2 = new Array();
                    a2.introducir();
                    a.comparar(a2);
                }
                case 8 -> a.sumaP();
                case 9 -> {
                    System.out.println("Valor: ");
                    int u = t.nextInt();
                    a.multi(u);
                }
                case 10 -> System.out.println("ADios");
            }
        }while(num!=10);
    }
}
