/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício04;

/**
 *
 * @author ednas
 */
public class triangulo {
    //variaveis
     double base;
    double altura;

    // construtor 
    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //metodo para calcular a hipotenusa
    public double calcularHipotenusa() {
        //formula do calculo
        return (base * base + altura * altura);
    }

    // metodo para calular 
    public static double calcularHipotenusa(double base, double altura) {
        triangulo Triangulo = new triangulo(base, altura);
        return Triangulo.calcularHipotenusa();
    }
}

