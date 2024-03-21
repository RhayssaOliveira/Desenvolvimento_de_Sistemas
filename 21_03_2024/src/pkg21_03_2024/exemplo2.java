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
public class exemplo2 {
    public static void main(String[] args) {
        String p = digite();
        int t = tamanho(p);
        JOptionPane.showMessageDialog(null, "A palavra '" + p + "' possui " + t + " caracteres.");
    }

    static String digite() {
        return JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
    }

    static int tamanho(String x) {
        return x.length();
    }
}
