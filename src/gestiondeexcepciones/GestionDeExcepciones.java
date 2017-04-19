/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeexcepciones;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class GestionDeExcepciones {
    
double dividirPorCero(double denominador) throws ExcepcionesPersonalizadas {
    
        double result = 0;
        if(denominador == 0)
            throw new ExcepcionesPersonalizadas("El denominador no puede ser cero");
       // try {
            result = 25 / denominador;
       /* } catch (ArithmeticException e) {
            System.out.println("Error Aritmetico, no es posible dividir por cero");
           // e.printStackTrace(); este metodo hace imprimir todo lo "rojito"}
*/
        return result;
    }

    public static void main(String[] args) {
        GestionDeExcepciones ex = new GestionDeExcepciones();
        int denominador =  0;
        double resultado=0;
        Scanner lectura = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            denominador = lectura.nextInt();
            try{
            resultado= ex.dividirPorCero(denominador);
            }catch(ExcepcionesPersonalizadas e){
            System.out.println(e.getMessage());
        }
            System.out.println(resultado);
    }
    
}
}
