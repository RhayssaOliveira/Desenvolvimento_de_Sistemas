/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício04;

import javax.swing.JOptionPane;

/**
 *
 * @author ednas
 */
public class main {
    public static void main(String[] args) {
        //recedbedndo os valores
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo:"));

        // calcula atraves do metodo
        double resultado = triangulo.calcularHipotenusa(base, altura);

        // mostra o resultado
        JOptionPane.showMessageDialog(null, "A hipotenusa do triângulo é: " + resultado);
    }
}
