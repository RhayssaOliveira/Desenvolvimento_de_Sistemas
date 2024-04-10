/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Digite a hora de início do turno:");
        int horaInicio = Integer.parseInt(input);

        if (horaInicio >= 5 && horaInicio <= 12) {
            JOptionPane.showMessageDialog(null, "O turno é matutino");
        } else if (horaInicio >= 13 && horaInicio <= 20) {
            JOptionPane.showMessageDialog(null, "O turno é vespertino");
        } else {
            JOptionPane.showMessageDialog(null, "O turno é noturno");
        }
    }
 }
 
