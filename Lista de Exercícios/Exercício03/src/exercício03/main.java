/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício03;

/**
 *
 * @author ednas
 */
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        //usuario insere o estado da lampada
        String estado = JOptionPane.showInputDialog(null, "Insira o estado da lâmpada");
        
        //instanciadno
        lampada Lampada = new lampada(estado); 
        
        //chamando o metodo 
        Lampada.mostrarEstado();
    }
}
