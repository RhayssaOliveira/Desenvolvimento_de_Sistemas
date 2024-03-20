/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo1;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */

public class Exemplo1 {
    public static void main(String[] args) {
       int a;
       digite();
    }
    static void digite(){
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
       dobro(a);
    }
    static void dobro(int n){
        int d = n * 2;
        JOptionPane.showMessageDialog(null, "O dobro de " +n+ " é "+ d);
    }
}
