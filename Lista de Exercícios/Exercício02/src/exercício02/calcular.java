/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício02;

/**
 *
 * @author ednas
 */
public class calcular {
   public static double calcular(double num1, double num2){
       //vendo qual umero é maior e retornando o valor
       if(num1 > num2){
           return num1 - num2;
       }else {
           return num2 - num1;
       }
   }
}
