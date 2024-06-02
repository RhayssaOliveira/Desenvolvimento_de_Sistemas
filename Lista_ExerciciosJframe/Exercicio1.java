import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio1 extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Notas"); //titulo
        frame.setSize(300, 350); //tamanho
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar
        frame.setLocationRelativeTo(null);

        //labels
        JLabel labelNota1 = new JLabel("Nota 1:");
        JTextField campoNota1 = new JTextField(10);

        JLabel labelNota2 = new JLabel("Nota 2:");
        JTextField campoNota2 = new JTextField(10);

        JLabel labelNota3 = new JLabel("Nota 3:");
        JTextField campoNota3 = new JTextField(10);

        JLabel labelNota4 = new JLabel("Nota 4:");
        JTextField campoNota4 = new JTextField(10);

        JLabel labelMaior = new JLabel();
        JLabel labelMenor = new JLabel();
        JLabel labelMedia = new JLabel();

        JButton botaoCalcular = new JButton("Calcular");
        JButton botaoLimpar = new JButton("Limpar");
        JButton botaoSair = new JButton("Sair");

        //adicionando os labels e botoes na janela
        JPanel painel = new JPanel();
        GroupLayout layout = new GroupLayout(painel);
        painel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(labelNota1)
                .addComponent(labelNota2)
                .addComponent(labelNota3)
                .addComponent(labelNota4)
                .addComponent(labelMaior)
                .addComponent(labelMenor)
                .addComponent(labelMedia))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(campoNota1)
                .addComponent(campoNota2)
                .addComponent(campoNota3)
                .addComponent(campoNota4)
                .addComponent(botaoCalcular)
                .addComponent(botaoLimpar)
                .addComponent(botaoSair))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelNota1)
                .addComponent(campoNota1))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelNota2)
                .addComponent(campoNota2))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelNota3)
                .addComponent(campoNota3))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelNota4)
                .addComponent(campoNota4))
            .addComponent(botaoCalcular)
            .addComponent(botaoLimpar)
            .addComponent(botaoSair)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelMaior))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelMenor))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(labelMedia))
        );

        frame.add(painel);

        frame.setVisible(true);

        // acao do botao calcular
        botaoCalcular.addActionListener(e -> {
            double nota1 = Double.parseDouble(campoNota1.getText());
            double nota2 = Double.parseDouble(campoNota2.getText());
            double nota3 = Double.parseDouble(campoNota3.getText());
            double nota4 = Double.parseDouble(campoNota4.getText());

            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            double maior = Math.max(Math.max(nota1, nota2), Math.max(nota3, nota4));
            double menor = Math.min(Math.min(nota1, nota2), Math.min(nota3, nota4));

            labelMaior.setText("Maior nota: " + maior);
            labelMenor.setText("Menor nota: " + menor);
            labelMedia.setText("Média: " + media);

            if (media >= 7) {
                labelMedia.setText(labelMedia.getText() + " (Aprovado)");
            } else {
                labelMedia.setText(labelMedia.getText() + " (Reprovado)");
            }
        });

        //acao do botao limpar
        botaoLimpar.addActionListener(e -> {
            campoNota1.setText("");
            campoNota2.setText("");
            campoNota3.setText("");
            campoNota4.setText("");
            labelMaior.setText("");
            labelMenor.setText("");
            labelMedia.setText("");
        });

        // acao do botao sair
        botaoSair.addActionListener(e -> System.exit(0));
    }
}
