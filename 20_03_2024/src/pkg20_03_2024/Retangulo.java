/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20_03_2024;

/**
 *
 * @author dti
 */
public class Retangulo {
     double comprimento;
    double largura;

    // Construtor com o valor inicial (1)
    public Retangulo() {
        comprimento = 1;
        largura = 1;
    }

    // Construtor com valores que eu der
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    // Método para calcular o perímetro
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    // Método para calcular a área
    public double calcularArea() {
        return comprimento * largura;
    }
}
