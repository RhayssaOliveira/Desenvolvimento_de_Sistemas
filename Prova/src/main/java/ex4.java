/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args) {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número correspondente a algum mês do ano"));
       
       String mes = null;
       
       switch (numero) {
            case 1:
                mes = "Janeiro";
                break;
            case 2: 
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5: 
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8: 
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11: 
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
        }
        JOptionPane.showMessageDialog(null, "O número digitado corresponde ao mês: " +mes);
    }
}

