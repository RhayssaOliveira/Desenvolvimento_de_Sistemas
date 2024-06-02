import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio3 extends JFrame {
    // componentes
    private JLabel labelA, labelB, labelC, labelResult;
    private JTextField textFieldA, textFieldB;
    private JButton calculateButton;

    public Exercicio3() {
        // config da janela
        setTitle("Teorema de Pitágoras");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 

        // labels e texto p inserir dados
        labelA = new JLabel("Lado A:");
        labelA.setBounds(20, 20, 80, 20); // definindo posicao e tamanho do comp
        add(labelA);

        textFieldA = new JTextField();
        textFieldA.setBounds(100, 20, 150, 20); 
        add(textFieldA);

        labelB = new JLabel("Lado B:");
        labelB.setBounds(20, 50, 80, 20); 
        add(labelB);

        textFieldB = new JTextField();
        textFieldB.setBounds(100, 50, 150, 20); 
        add(textFieldB);

        // botao calcular
        calculateButton = new JButton("Calcular");
        calculateButton.setBounds(100, 80, 100, 30); 
        calculateButton.addActionListener(e -> calculate());
        add(calculateButton);

        // label resultado
        labelC = new JLabel("Hipotenusa (C):");
        labelC.setBounds(20, 120, 100, 20);                           
        add(labelC);

        labelResult = new JLabel("");
        labelResult.setBounds(120, 120, 150, 20); 
        add(labelResult);
    }

    // metodo p calcular a hipotenusa
    private void calculate() {
        // pegando os valores
        double a = Double.parseDouble(textFieldA.getText());
        double b = Double.parseDouble(textFieldB.getText());
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        labelResult.setText(String.format("%.2f", c));
    }

    public static void main(String[] args) {
        // instanciando 
         new Exercicio3().setVisible(true);
    }
}
