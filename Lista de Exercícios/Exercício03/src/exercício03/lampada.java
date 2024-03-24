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
public class lampada {
    String estado; //variavel 
    
    //xonstruindo a classe lampada
    public lampada(String estado){
        this.estado = estado;
    }
    
    //metodo para mostrar o estado
    public void mostrarEstado(){
        JOptionPane.showMessageDialog(null, "A lâmpada está "+estado);
    }
}
