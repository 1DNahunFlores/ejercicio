package com.mycompany.ejercicio4clase11;
import java.util.Scanner;
public class Ejercicio4clase11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1; // primer numero a comparar
        System.out.print("Escriba el primer entero: "); // indicador
        numero1 = entrada.nextInt(); // el primer numero del usuario
        if (numero1 >= 100) { 
            System.out.println ("El numero " + numero1 + "es mayor o igual a 100");
            }
        else if (numero1 >= 50){
            System.out.println ("El numero " + numero1 +"es mayor o igual a 50 pero menor que 100") ;
        }
        else if (numero1 >= 0) {
            System.out.println("El numero " + numero1 + "es mayor o igual a 50 pero menor que 50");
            
        } else {
            System.out.println("El numero " + numero1 + "es menor que 0" );
        }
    }
}
