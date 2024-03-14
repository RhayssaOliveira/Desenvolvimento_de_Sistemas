/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seg_13_mar;

import java.util.Scanner;

/**
 *
 * @author ednas
 */
public class Seg_13_mar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    //recolhe os dados do funcin´rio 1
        System.out.println("Insira o nome do primeiro funcionário:");
        String nomeFuncionario1 = scanner.nextLine();
        System.out.println("Insira o ano de nascimento do primeiro funcionário");
        int anonascFuncionario1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira a data de nascimento do primeiro funcionário:");
        String datanascFuncionario1 = scanner.nextLine();
        System.out.println("Insira o salário do primeiro funcionário:");
        double salarioFuncionario1 = Double.parseDouble(scanner.nextLine());
        
       //criar funcionario 1
       Funcionario funcionario1 = new Funcionario(nomeFuncionario1,anonascFuncionario1,datanascFuncionario1,salarioFuncionario1);
       
       System.out.println("Insira o nome do segundo funcionário:");
        String nomeFuncionario2 = scanner.nextLine();
        System.out.println("Insira o ano de nascimento do segundo funcionário");
        int anonascFuncionario2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira a data de nascimento do segundo funcionário:");
        String datanascFuncionario2 = scanner.nextLine();
        System.out.println("Insira o salário do segundo funcionário:");
        double salarioFuncionario2= Double.parseDouble(scanner.nextLine());
        
       //criar funcionario 2
       Funcionario funcionario2= new Funcionario(nomeFuncionario2,anonascFuncionario2,datanascFuncionario2,salarioFuncionario2);
       
       int anoatual = 2024;
       
       //exibir dados 
        System.out.println("Dados do primeiro funcionário: ");
        funcionario1.exibirDados(anoatual);
        System.out.println();
        
        System.out.println("Dados do segundo funcionário:");
        funcionario2.exibirDados(anoatual);
        
        scanner.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
