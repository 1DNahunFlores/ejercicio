package com.mycompany.ejercicio1clase10;
import java.util.Scanner;
public class Ejercicio1clase10 {
    public static void main(String[] args) {
      Scanner Entrada = new Scanner(System.in) ;
        System.out.println("ingrese el numero de meses: ");
        float NM = Entrada.nextFloat() ;
        double precio,prima,descuento,deuda, cuota;
        if (NM >=1 && NM <=65 ) {
            precio = 23000 * 1.13;
             descuento = 0 ;
                if (NM == 36) {
                     descuento = precio * 0.2;
                    prima = (precio- descuento) * 0.15;
                    deuda = (precio- descuento)- prima;
                } else {
                    prima = precio * 015;
                    deuda = precio - prima;
                }
                cuota = deuda / NM;
                System.out.println ("precio : " + precio) ;
                System.out.println( " descuento: " + descuento) ;
                System.out.println( "deuda:" + deuda) ;
                System.out.println("cuota: " + cuota);
           } else {
              System.out.println("Lo siento corazon lea por favor");
        }
     }
}   
 
        
     