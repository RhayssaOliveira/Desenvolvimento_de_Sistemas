/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrodecliente;

/**
 *
 * @author ednas
 */
import javax.swing.*; //importando a biblioteca para o uso de interface
import java.awt.*; //biblioteca para componentes de gráficos

public class CadastrodeCliente extends JFrame {
    //declaração dos componentes
    JLabel nomeLabel, cpfLabel, rgLabel, enderecoLabel, cidadeLabel, estadoLabel, cepLabel;
    JTextField nomeField, cpfField, rgField, enderecoField, cidadeField, estadoField, cepField;

    //criando o método construtor
    public CadastrodeCliente() {
        super("Cadastro de Cliente"); //título da janela
        Container tela = getContentPane(); //obtém o container da tela
        setLayout(null); //layout nulo (posicionamento manual)

        //definindo o título da janela
        JLabel titleLabel = new JLabel("Cadastro de Cliente", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        titleLabel.setForeground(Color.RED);
        titleLabel.setBounds(0, 0, 400, 30);
        tela.add(titleLabel);

        //inicialização dos objetos
        nomeLabel = new JLabel("Nome");
        cpfLabel = new JLabel("CPF");
        rgLabel = new JLabel("RG");
        enderecoLabel = new JLabel("Endereço");
        cidadeLabel = new JLabel("Cidade");
        estadoLabel = new JLabel("Estado");
        cepLabel = new JLabel("CEP");

        //definindo a quantidade máxima de caracteres
        nomeField = new JTextField(50);
        cpfField = new JTextField(14);
        rgField = new JTextField(14);
        enderecoField = new JTextField(50);
        cidadeField = new JTextField(50);
        estadoField = new JTextField(50);
        cepField = new JTextField(10);

        //definindo o tamanho e a posição dos campos
        nomeLabel.setBounds(50, 60, 80, 20);
        cpfLabel.setBounds(50, 100, 80, 20);
        rgLabel.setBounds(50, 140, 80, 20);
        enderecoLabel.setBounds(50, 180, 80, 20);
        cidadeLabel.setBounds(50, 220, 80, 20);
        estadoLabel.setBounds(50, 260, 80, 20);
        cepLabel.setBounds(50, 300, 80, 20);
        nomeField.setBounds(110, 60, 200, 20);
        cpfField.setBounds(110, 100, 200, 20);
        rgField.setBounds(110, 140, 200, 20);
        enderecoField.setBounds(110, 180, 200, 20);
        cidadeField.setBounds(110, 220, 200, 20);
        estadoField.setBounds(110, 260, 200, 20);
        cepField.setBounds(110, 300, 200, 20);

        //adiciona os componentes na tela
        tela.add(nomeLabel);
        tela.add(cpfLabel);
        tela.add(rgLabel);
        tela.add(enderecoLabel);
        tela.add(cidadeLabel);
        tela.add(estadoLabel);
        tela.add(cepLabel);
        tela.add(nomeField);
        tela.add(cpfField);
        tela.add(rgField);
        tela.add(enderecoField);
        tela.add(cidadeField);
        tela.add(estadoField);
        tela.add(cepField);

        //dimensiona a janela
        setSize(400, 400);

        //torna a janela visível
        setVisible(true);

        //centraliza a janela
        setLocationRelativeTo(null);

        //define o comportamento ao fechar a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //método principal
    public static void main(String[] args) {
        CadastrodeCliente app = new CadastrodeCliente(); //instanciando
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define o comportamento padrão ao fechar a janela
    }
}