/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20_03_2024;

/**
 *
 * @author dti
 */
public class TestaRetangulo {
       public static void main(String[] args) {
         // Criando um retângulo com o valor incial
        Retangulo retangulo1 = new Retangulo();

        // Mostrando os valores do retângulo 1
        System.out.println("Retângulo 1:");
        System.out.println("Comprimento: " + retangulo1.comprimento);
        System.out.println("Largura: " + retangulo1.largura);
        System.out.println("Perímetro: " + retangulo1.calcularPerimetro());
        System.out.println("Área: " + retangulo1.calcularArea());

        // Criando um retângulo com os valores que eu quiser
        Retangulo retangulo2 = new Retangulo(4, 9);

        // Mostrando os valores do retângulo 2
        System.out.println("\nRetângulo 2:");
        System.out.println("Comprimento: " + retangulo2.comprimento);
        System.out.println("Largura: " + retangulo2.largura);
        System.out.println("Perímetro: " + retangulo2.calcularPerimetro());
        System.out.println("Área: " + retangulo2.calcularArea());
    }
}