/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        
        String inputMassa = JOptionPane.showInputDialog("Digite sua massa em quilogramas (kg):");
        double massa = Double.parseDouble(inputMassa);

        String inputAltura = JOptionPane.showInputDialog("Digite sua altura em metros (m):");
        double altura = Double.parseDouble(inputAltura);

        double imc = massa / (altura * altura);

        String classificacao;
        if (imc < 18.0) {
            classificacao = "Magreza";
        } else if (imc >= 18.0 && imc <= 24.9) {
            classificacao = "Saudável";
        } else if (imc >= 25.0 && imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\nClassificação: " + classificacao);
    }
}
