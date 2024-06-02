import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio4 extends JFrame {

    private JTextField lado1Field;
    private JTextField lado2Field;
    private JTextField lado3Field;
    private JLabel resultadoLabel;

    public Exercicio4() {
        // config janela
        setTitle("Classificador de Triângulos");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
                             
        JPanel contentPane = new JPanel(new GridLayout(5, 1, 10, 10));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // comp p entrada de dados
        contentPane.add(new JLabel("Lado 1:"));
        lado1Field = new JTextField();
        contentPane.add(lado1Field);

        contentPane.add(new JLabel("Lado 2:"));
        lado2Field = new JTextField();
        contentPane.add(lado2Field);

        contentPane.add(new JLabel("Lado 3:"));
        lado3Field = new JTextField();
        contentPane.add(lado3Field);

        // botao veririfcar
        JButton verificarButton = new JButton("Verificar Tipo");
        contentPane.add(verificarButton);

        // exibindo resultado
        resultadoLabel = new JLabel("");
        contentPane.add(resultadoLabel);

        // chamando a func verificar
        verificarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verificarTriangulo();
            }
        });

        add(contentPane);
    }

    //  verificando tipo do triangluo
    private void verificarTriangulo() {
        double lado1, lado2, lado3;

        lado1 = Double.parseDouble(lado1Field.getText());
        lado2 = Double.parseDouble(lado2Field.getText());
        lado3 = Double.parseDouble(lado3Field.getText());

        if (lado1 == lado2 && lado2 == lado3) {
            resultadoLabel.setText("O triângulo é equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            resultadoLabel.setText("O triângulo é isósceles");
        } else {
            resultadoLabel.setText("O triângulo é escaleno");
        }
    }

    public static void main(String[] args) {
        // instanciando
        new Exercicio4().setVisible(true);
    }
}
