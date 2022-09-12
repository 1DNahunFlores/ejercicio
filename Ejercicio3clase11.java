package com.mycompany.ejercicio3clase11;
import java.util.Scanner;
public class Ejercicio3clase11 {
    public static void main(String[] args) {
        // crea un objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner (System.in);
        int numero1; // declaracion de variable, primer numero a sumar
        int numero2; // declaracion de variable, segundo numero a sumar
        int suma; // declaracion de variable, suma de numero1 y numero2
        System.out.print ("Escriba el primer entero : ") ; // indicador
        numero1= entrada.nextInt (); // lee el primer numero del usuario
        
        System.out.print("Escriba el segundo entero : ") ; // indicador
        numero2 = entrada.nextInt (); // lee el segundo numero del usuario
        
        suma= numero1 + numero2;// suma los numeros, deswpues almacena el total en suma
        
        
        System.out.println("la suma es" + suma); // muestra la suma
    }
}
