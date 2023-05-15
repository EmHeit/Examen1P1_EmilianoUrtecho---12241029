/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_emilianourtecho;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Examen1P1_EmilianoUrtecho {

    /**
     * @param args the command line arguments
     */
    
    public static String Primero (){
        
        Scanner str1 = new Scanner (System.in);
        System.out.println("Ingrese una palabra: ");
        String primera = str1.nextLine();
        
        
        Scanner str2 = new Scanner (System.in);
        System.out.println("Ingrese una segunda palabra: ");
        String segunda = str1.nextLine();
       
        
            if (primera.equalsIgnoreCase(segunda)) {
                
            for (int i = segunda.length(); i >= 0; i--) {
                String segunda2 ="";
                segunda2 += segunda.charAt(i);
                System.out.print(primera+segunda2);
            }
                        
            }else if (!primera.equalsIgnoreCase(segunda) && primera.length()==segunda.length()){
                
                
                
            }else {
                System.out.println(primera+segunda);
            }
            
        
        return null;
}
    
        
    
    
    public static void main(String[] args) {
        Scanner escan = new Scanner (System.in);
        int eleccion;
        
        System.out.println("Menu: ");
        System.out.println("1. Ejercicio de palabras. ");
        System.out.println("2. Salir");
        System.out.print("Cual desea ver?: ");
        eleccion = escan.nextInt();
        
        do {
            switch(eleccion){
                case 1:
                    Primero();
                    break;
                case 2:
                    System.out.println("Por favor no se salga tan temprano, pero si quiere salirse, mire las siguientes opciones -");
                    break;
                default:
                    
                    System.out.println("Hmmm, lo siento no entiendo lo que acaba de poner. Por favor vuelva a intentarlo -");
                    break;
            }
            System.out.println("Desea volver a ver el ejercicio?: ");
            System.out.println("1. Ejercicio de palabras. ");
            System.out.println("2. Salir ");
            System.out.print("Que desea ver?: ");
            eleccion = escan.nextInt();
        } while (eleccion != 2);
    }
    
}
