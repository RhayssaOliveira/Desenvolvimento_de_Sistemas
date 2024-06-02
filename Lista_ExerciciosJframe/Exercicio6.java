import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author ednas
 */

public class Exercicio6 extends JFrame {

    //variaveis
    JLabel labelTitulo, labelCelsius, labelFahrenheit, labelKelvin;
    JTextField campoCelsius;
    JButton botaoCalcular;

    public Exercicio6() {

        // titulo pag
        super("Conversor de Temperatura");

        // config da tela
        setSize(400, 260);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container adicionar = getContentPane();
        setLayout(null);

        labelTitulo = new JLabel("Conversor de Temperatura");
        labelTitulo.setBounds(80, 10, 300, 50);
        adicionar.add(labelTitulo);

        labelCelsius = new JLabel("Graus Celsius");
        labelCelsius.setBounds(40, 65, 150, 30);
        adicionar.add(labelCelsius);

        labelFahrenheit = new JLabel("");
        labelFahrenheit.setBounds(170, 80, 200, 30);
        adicionar.add(labelFahrenheit);
        labelFahrenheit.setVisible(false);

        labelKelvin = new JLabel("");
        labelKelvin.setBounds(170, 110, 200, 30);
        adicionar.add(labelKelvin);
        labelKelvin.setVisible(false);

        // campo celsius
        campoCelsius = new JTextField(3);
        campoCelsius.setBounds(40, 100, 100, 30);
        adicionar.add(campoCelsius);

        // botao calcular
        botaoCalcular = new JButton("Calcular");
        botaoCalcular.setBounds(145, 165, 95, 25);
        adicionar.add(botaoCalcular);

        // açao botao
        botaoCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double graus = Double.parseDouble(campoCelsius.getText());

                // Conversão (cálculo)
                double k = graus + 273.15;
                double f = (graus * 1.8) + 32;

                // Exibição dos resultados
                labelFahrenheit.setText("Graus Fahrenheit: " + f);
                labelKelvin.setText("Graus Kelvin: " + k);
                labelFahrenheit.setVisible(true);
                labelKelvin.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new Exercicio6();
    }
}
