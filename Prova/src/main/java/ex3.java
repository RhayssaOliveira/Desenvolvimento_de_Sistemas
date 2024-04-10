/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;

public class ex3 {
      public static void main(String[] args) {
        String inputOpcao = JOptionPane.showInputDialog("Escolha algum item do nosso menu (1-5):");
        int opcao = Integer.parseInt(inputOpcao);

        String lanche;

        switch (opcao) {
            case 1:
                lanche = "BigMac";
                break;
            case 2:
                lanche = "Quarteirão";
                break;
            case 3:
                lanche = "MacChicken";
                break;
            case 4:
                lanche = "Cheddar MacMelt";
                break;
            case 5:
                lanche = "MacMax";
                break;
            default:
                lanche = "Opção inválida";
                break;
        }

        JOptionPane.showMessageDialog(null, "O lanche escolhido é: " + lanche);
    }
}
