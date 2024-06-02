import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio2 extends JFrame implements ActionListener {
    private JLabel labelA, labelB, labelC, labelX1, labelX2;
    private JTextField textFieldA, textFieldB, textFieldC;
    private JButton calculateButton;

    public Exercicio2() {
        // tamanho e nome da janela
        setTitle("Calculadora de Bhaskara");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // Usando um layout gerenciado

        // componentes p entrada de valores
        labelA = new JLabel("Valor de A:");
        add(labelA);

        textFieldA = new JTextField(10);
        add(textFieldA);

        labelB = new JLabel("Valor de B:");
        add(labelB);

        textFieldB = new JTextField(10);
        add(textFieldB);

        labelC = new JLabel("Valor de C:");
        add(labelC);

        textFieldC = new JTextField(10);
        add(textFieldC);

        // botao p calcular
        calculateButton = new JButton("Calcular");
        add(calculateButton);

        labelX1 = new JLabel("");
        add(labelX1);

        labelX2 = new JLabel("");
        add(labelX2);

        // adicionando acao ao botao
        calculateButton.addActionListener(this);

        // exibindo a janela
        setVisible(true);
    }

    // metodo do botao
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            // pegando valores
            double a = Double.parseDouble(textFieldA.getText());
            double b = Double.parseDouble(textFieldB.getText());
            double c = Double.parseDouble(textFieldC.getText());

            // calculando o delta
            double delta = b * b - 4 * a * c;

            // verificando as raizes
            if (delta >= 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                // exibindo o resultado das raízes
                labelX1.setText("Valor de x1: " + x1);
                labelX2.setText("Valor de x2: " + x2);
            } else {
                // mensagem caso não haja raízes
                labelX1.setText("Não há solução real para x1");
                labelX2.setText("Não há solução real para x2");
            }
        }
    }

    public static void main(String[] args) {
        // instanciando 
         new Exercicio2().setVisible(true);
    }
}            
     
