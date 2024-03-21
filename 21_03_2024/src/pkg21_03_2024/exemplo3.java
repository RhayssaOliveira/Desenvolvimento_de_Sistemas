/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg21_03_2024;

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;
public class exemplo3 {
    public static void main(String[] args) {
        int idade1, idade2;
        String nome1, nome2;
        
        nome1 = JOptionPane.showInputDialog("Digite o nome da 1ª pessoa: ");
        idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1ª pessoa: "));
        
        nome2 = JOptionPane.showInputDialog("Digite o nome da 2ª pessoa: ");
        idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2ª pessoa: "));
        
        String texto = pessoaMaisVelha(nome1, idade1, nome2, idade2);
        
        JOptionPane.showMessageDialog(null, texto);
    }

    static String pessoaMaisVelha(String nome1, int idade1, String nome2, int idade2) {
        if (idade1 > idade2)
            return nome1 + " é a pessoa mais velha";
        else if (idade2 > idade1)
            return nome2 + " é a pessoa mais velha";
        else
            return nome1 + " e " + nome2 + " têm a mesma idade";
    }
}
