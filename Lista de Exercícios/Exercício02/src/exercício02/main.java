/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício02;

/**
 *
 * @author ednas
 */
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        //usuario insere os numeros
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));
        
        //calcula a diferença atraves de um metodo
        double diferenca = calcular.calcular(num1 , num2);
        
        //resultado
        JOptionPane.showMessageDialog(null, "A diferença é: " +diferenca);
        
    }
}
