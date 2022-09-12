package com.mycompany.ejercicio2clase10;
import java.util.Scanner;
public class Ejercicio2clase10 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;
        System.out.println("ingrese la primera nota");
       nota1 = Entrada.nextFloat ();
       System.out.println("ingrese la primera nota");
       nota2 = Entrada.nextFloat();
       System.out.println("ingrese la primera nota");
       nota3 = Entrada.nextFloat();
       promedio = (nota1 + nota2 + nota3) / 3;
       System.out.println("El promedio es: " + promedio);
       if (promedio >= 7){
           System.out.println("promocionando");
       } else if (promedio >= 4) {
           System.out.println("regular");
       } else {
            System.out.println("reprobad0");
               
       }
    }
}
