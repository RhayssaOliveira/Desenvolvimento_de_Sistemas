import javax.swing.*;
import java.awt.*;

public class Exercicio5 extends JFrame { 
    private JTextField campoPeso, campoAltura;
    private JLabel resultado;

    public Exercicio5() {
        setTitle("Calculadora de IMC"); 
        setSize(300, 200); //tamanho da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE); //fechar
        setLayout(new GridLayout(4, 2)); //tamanho layout

        //campo de texto
        add(new JLabel("Peso (kg):"));
        campoPeso = new JTextField();
        add(campoPeso);

        add(new JLabel("Altura (m):"));
        campoAltura = new JTextField();
        add(campoAltura);

        // botao calcular
        JButton botaoCalcular = new JButton("Calcular IMC");
        add(botaoCalcular);

        // labek di resultado
        resultado = new JLabel();
        add(resultado);

        // acao do botao
        botaoCalcular.addActionListener(e -> {
            double peso = Double.parseDouble(campoPeso.getText()); // pega o peso
            double altura = Double.parseDouble(campoAltura.getText()); //obtem a altuda
            double imc = peso / (altura * altura); //calcula o imc

            //exibe o resultado
            if (imc < 18) {
                resultado.setText("Abaixo do peso ideal");
            } else if (imc < 25) {
                resultado.setText("Peso ideal");
            } else {
                resultado.setText("Acima do peso ideal");
            }
        });
    }

    public static void main(String[] args) {
         new Exercicio5().setVisible(true);
    }
}