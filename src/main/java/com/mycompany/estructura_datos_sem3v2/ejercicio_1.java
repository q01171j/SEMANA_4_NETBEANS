/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estructura_datos_sem3v2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class ejercicio_1 {
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        int tam = 10;
        int [][] matriz = new int[tam][tam];
        int SDP = 0;
        int SDS = 0;

        //FOR PARA AGREGAR DATOS A LOS ARRAYS
        for(int i=0 ; i < matriz.length ; i++){
            for(int j=0 ; j < matriz.length ; j++){
                //metodo con numeros aleatorios

                int n = (int) (Math.random()*9 + 1) ;
                matriz[i][j] = n;
                System.out.println("Ingrese el valor de la posicion : ["+i+"]["+j+"] = "+n);

                //metodo para ingrear por teclado

                //System.out.print("Ingrese el valor de la posicion : ["+i+"]["+j+"] = ");
                //matriz[i][j] = sc.nextInt();
                
                //CONDICIONALES
                //condicional para la diagonal Principal
                if(i == j){
                    //Suma de la diagonal Principal
                    SDP += matriz[i][j];
                //condicional para la diagonal Secundaria
                }else if(i + j == (matriz.length - 1)){
                    //Suma de la diagonal Secundaria
                    SDS += matriz[i][j];
                }
            }
        }  
        
        System.out.println("=========================================");

        //IMPRIMIR LA MATRIZ
        for(int i=0 ; i < matriz.length ; i++){
            System.out.println(Arrays.toString(matriz[i]));
        } 
        
        //MOSTRAR EL RESULTADO
        System.out.println("=========================================");
        System.out.println("La suma de la diagonal primaria es : " + SDP);
        System.out.println("La suma de la diagonal secundaria es : " + SDS);
    }
}
