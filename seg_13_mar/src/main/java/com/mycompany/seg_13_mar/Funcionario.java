/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seg_13_mar;

/**
 *
 * @author ednas
 */
public class Funcionario {
     String nome;
    int anonasc;
    String datanasc;
    double salario;
    
    //construtor para inicializar os atributos 
    public Funcionario(String nome,int anonasc, String datanasc, double salario){
        this.nome = nome;
        this.anonasc = anonasc;
        this.datanasc = datanasc;
        this.salario = salario;
    }
    
    //método para exibir os dados
    public void exibirDados(int anoatual){
        System.out.println("Nome: " +nome);
        System.out.println("Data de nascimento: " +datanasc);
        System.out.println("Salário: " +salario);
        int idade = anoatual - anonasc;
        System.out.println("Idade: " +idade+ " anos");
        double novosalario = salario * 1.1; //aumento de 10%
        System.out.println("Salário com aumento de 10%: " +novosalario);
    } 
}
