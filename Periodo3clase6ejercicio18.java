package com.mycompany.periodo3clase6ejercicio18;
import java.util.Scanner;
public class Periodo3clase6ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int i = 1; // contador del bucle que dara tanta vueltas como sea el
        int potencia; // guarda el valor de la potencia
        int base;
        int calculo = 1;
        System.out.print("Introduza el valor de la base: ");
        base = teclado.nextInt();
        System.out.println("Introduzca el valor del exponente:");
        potencia = teclado.nextInt();
        while (i<=potencia){
        calculo = calculo * base;
        i ++;
        }
        System.out.println("El resultado del calculo de la potencia es:");
    }
}
