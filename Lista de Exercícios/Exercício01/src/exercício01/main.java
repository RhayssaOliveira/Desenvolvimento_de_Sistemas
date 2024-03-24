/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício01;

import javax.swing.JOptionPane;

/**
 *
 * @author ednas
 */
public class main {
    public static void main(String[] args) {
        aluno Aluno = new aluno(); //objeto da classe aluno
        Aluno.lerNotas(); //chama o metodo lerNotas
        double media = Aluno.calcularMedia(); //calcula a media
        String aprovadoReprovado = Aluno.aprovadoReprovado(); //ve se o aluno foi aprovado ou reprovado
        
        JOptionPane.showMessageDialog(null, aprovadoReprovado + " com " +media+ " pontos de média");
    }
}
