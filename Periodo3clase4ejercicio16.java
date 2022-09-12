package com.mycompany.periodo3clase4ejercicio16;
import java.util.Scanner;
public class Periodo3clase4ejercicio16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int password;
        do{
        System.out.print ("Introduzca su contraseña numerica: ");
        password = keyboard.nextInt();
        if (password != 1234)
            System.out.println("La contraseña no es valida." ) ;
        }
         while (password != 1234);
    }
}
