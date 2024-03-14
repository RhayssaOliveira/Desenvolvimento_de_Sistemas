/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_carro;

/**
 *
 * @author ednas
 */
public class testar_carro {
    public static void main(String[] args) {
        
        //orientação a objetos sem interface gráfica
        
        //instanciar classe
        carro car = new carro();
        
        //atribuindo valor aos aributos
        car.cor = "branco";
        car.modelo = "LX";
        car.ano = "2024";
        car.chassi = "9BWHE21JX24060960";
        car.marca = "Honda";
        
        //chama os métodos através do objeto de instância (nesse caso, o car)
        car.ligar();
        car.freiar();
        car.acelear();
        car.trocarmarcha();
        car.parar();
        
        //apresenta a saída dos atributos
        System.out.println(car.cor);
        System.out.println(car.modelo);
        System.out.println(car.ano);
        System.out.println(car.chassi);
        System.out.println(car.marca);
    }
}
