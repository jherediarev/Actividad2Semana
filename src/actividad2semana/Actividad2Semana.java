/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2semana;
import java.util.Scanner;
/**
 *
 * @author Johnny Reveles
 */
public class Actividad2Semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se imprime el número de ejercicio y la instrucción
        
        System.out.println("Segundo ejercicio");
        // CREAR UN MÉTODO QUE DETERMINE SI EL DÍA ES HÁBIL (LUNES A VIERNES)Y EMITA UN MENSAJE SI ES FIN DE SEMANA.
    
        // Se declara la variable día
    int dia = 0;
    
        // Se agrega el scanner
    
    Scanner miConsola = new Scanner(System.in);
    
       // Imprimir un anunció que le pida al usuario introducir un número que corresponda a un día de la semana
      
    System.out.println("Introduce un día de la semana en base a:\n Lunes = 1 \n Martes = 2 \n Miércoles = 3 \n Jueves = 4 \n Viernes = 5 \n Sabado = 6 \n Domingo = 7");
    dia = miConsola.nextInt();
    
       // Se añade el if que corresponde a los días de la semana
     
    if (dia == 1) {
        System.out.println("Escribiste Lunes, es un día hábil");
    } else {
    if (dia == 2) {
        System.out.println("Escribiste Martes, es un día hábil");
    } else {
    if (dia == 3) {
        System.out.println("Escribiste Miércoles, es un día hábil");
    } else {
    if (dia == 4) {
        System.out.println("Escribiste Jueves, es un día hábil");
    } else {
    if (dia == 5) {
        System.out.println("Escribiste Viernes, es un día hábil");
    } else {
    if (dia == 6) {
        System.out.println("Escribiste Sábado, es fin de semana");
    } else {
    if (dia == 7) {
        System.out.println("Escribiste Domingo, es fin de semana");
    } else {
        System.out.println("Lo siento, ingresaste un dato incorrecto");
    }   
    }    
    }
    }  
    } 
    } 
    }
    


    
    }
    
}
