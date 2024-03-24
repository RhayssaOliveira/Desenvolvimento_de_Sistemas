/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício01;

/**
 *
 * @author ednas
 */
import javax.swing.JOptionPane;
public class aluno {
    //criando variaveis para armazenar os dados
    String nome; 
    double nota1;
    double nota2;
    
    //metodo ler notas
    void lerNotas(){
        nome = JOptionPane.showInputDialog("Digite o nome do aluno(a): ");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno(a) " +nome+ "."));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno(a) " +nome+ "."));
    }
    
    //metodo calcular a media
    double calcularMedia(){
        return (nota1 + nota2) / 2;
        //usei return para retornar o resultado do meu calculo
        
    }  
    
    //metodo reprovado ou aprovado
    String aprovadoReprovado(){
        //vendo se a media é maior ou menor que 7
        if(calcularMedia() >= 7.0){
            //se o aluno tirar 7 ou +, retornara que ele foi aprovado
            return "O aluno(a)" +nome+ " foi aprovado";
        }  else{
             //se o aluno tirar - que 7, retornara que ele foi reprovado
            return "O aluno(a)" +nome+ " foi reprovado";
        }   
    }
}
