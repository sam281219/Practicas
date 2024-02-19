/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author samus
 */
public class Array {
    private int [] vector;
    
    public Array(){
        vector = new int [10];
    }
    
    public void mostrar(){
        System.out.print("[ ");
        for (int i : vector) {
            System.out.print(i+" ");
        }
        System.out.print(" ]");
    }
    
    public void introducir(){
        Scanner t;
        for (int i = 0; i < vector.length; i++) {
            t = new Scanner(System.in);
            System.out.println("Ingresa valor en la posicion "+(i+1));
            vector[i]= t.nextInt();
        }
    }
    
    public int media(){
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma+=vector[i];
        }
        return suma/vector.length;
    }
    
    public void modificar(int num, int pos){
        if(pos > 0 && pos < vector.length){
            for (int i = 0; i < vector.length; i++) {
                if(vector[pos -1] == vector[i]){
                    vector [i] = num;
                }
            }
        }else{
            System.out.println("Posicion no encotrada.");
        }
    }
    
    public void rotarIzquierda(){
        int a = vector [0];
        for (int i = 0; i < vector.length-1; i++) {
            vector [i] = vector[i+1];
        }
        vector[vector.length -1]=a;
    }
    
    public void rotarDerecha(){
        int a = vector [vector.length -1];
        for (int i = vector.length - 1; i > 0; i--) {
            vector [i] = vector [i-1];            
        }
        vector[0]=a;
    }
    
    public void comparar(Array a){
        for (int i : vector) {
            for (int j : a.vector) {
                if(i == j){
                    System.out.print(i+" ");
                }
            }
        }
    }
    
    public void sumaP(){
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] % 2 == 0){
                suma+=vector[i];
                
            }
            
        }
        System.out.println("suma "+suma);
    }
    
    public void multi(int num){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= num *(i+1);
        }
    }
}
