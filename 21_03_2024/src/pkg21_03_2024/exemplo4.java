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

public class exemplo4 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        
        if (RestoporDois(num) == 0)
            JOptionPane.showMessageDialog(null, "O número é par. \n");
        else
            JOptionPane.showMessageDialog(null, "O número é ímpar. \n");
    }
    static int RestoporDois(int a)
    {
     return a % 2;
    }
}
