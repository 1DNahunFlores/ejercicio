package com.mycompany.periodo2clase4ejercicio9;
public class Periodo2clase4ejercicio9 {
    public static void main(String[] args) {
        // programa Java parademostrar switch case
        // con tipo de datos primitivos (int)
        int day = 5;
        String dayString;
        // instruccion de switch con tipo de datos int
        switch (day)
        {
            case 1: dayString = "lunes" ;
                    break;
            case 2 : dayString ="martes";
                    break;
                    case 3: dayString = "miercoles";
                    break;
                    case 4: dayString = "jueves";
                    break;
                    case 5: dayString = "Viernes";
                    break;
                    case 6: dayString = "Sabado";
                    break;
                    case 7: dayString = "Domingo";
                    break;
                    default: dayString = "Dia invalido";
                    break;             
        }   
        String dayType;
        
        switch (day)
        {
            //multiples cases sin declaraciones break
            
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType ="dia laborable";
                break;
            case 6:
             case 7:
                 dayType = "fin de semana";
                 break;
                 
             default: dayType = "Tipo de dia invalido";
                }   
        System.out.println(dayString+ " es un " + dayType);
    }
}
