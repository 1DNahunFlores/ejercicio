package com.mycompany.periodo3clase4ejercicio19;
public class Periodo3clase4ejercicio19 { 
    public static void main(String[] args) {
        double dinero = 1000;
        int mes = 1;
        while (mes<=12){
              dinero = dinero * 1.02;
              mes++;
        }
        System.out.println(dinero);
    }
}
