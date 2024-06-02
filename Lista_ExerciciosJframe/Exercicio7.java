import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class Exercicio7 extends JFrame {

    //variaveis
    JLabel labels[];
    JTextField textFields[];
    JFormattedTextField cepField, telefoneField, celularField, dataField1, dataField2;
    MaskFormatter maskcep, masktel, maskcel, maskdata, maskdata2;
    JButton limparButton, sairButton, exibirButton;
    JComboBox<String> cidadeComboBox;
    String cidades[] = {"Escolha...", "SP", "RJ", "CE", "BA", "MG", "SC", "RS"};
    String labelTexts[] = {
        "Código do Cliente:", "Nome Completo:", "Endereço:", "Bairro:",
        "Cidade:", "Estado:", "CEP:", "Celular:", "Telefone:",
        "Data de Nascimento:", "Data de Cadastro:"
    };

    public Exercicio7() {
        // titulo pag
        super("Cadastro de Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 630);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        labels = new JLabel[11];
        textFields = new JTextField[5];
        
        // mascaras
        try {
            maskcep = new MaskFormatter("#####-###");
            masktel = new MaskFormatter("####-####");
            maskcel = new MaskFormatter("(##) #####-####");
            maskdata = new MaskFormatter("##/##/####");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // config pag
        Container container = getContentPane();
        
        for (int i = 0; i < 11; i++) {
            labels[i] = new JLabel(labelTexts[i]);
            labels[i].setBounds(40, 70 + 40 * i, 250, 30);
            container.add(labels[i]);
        }

        for (int i = 0; i < 5; i++) {
            textFields[i] = new JTextField();
            textFields[i].setBounds(150, 85 + 40 * i, 230, 30);
            container.add(textFields[i]);
        }

        cepField = new JFormattedTextField(maskcep);
        telefoneField = new JFormattedTextField(masktel);
        celularField = new JFormattedTextField(maskcel);
        dataField1 = new JFormattedTextField(maskdata);
        dataField2 = new JFormattedTextField(maskdata);

        JFormattedTextField[] formattedFields = {cepField, celularField, telefoneField, dataField1, dataField2};

        for (int i = 0; i < formattedFields.length; i++) {
            formattedFields[i].setBounds(150, 325 + 40 * i, 230, 30);
            container.add(formattedFields[i]);
        }

        cidadeComboBox = new JComboBox<>(cidades);
        cidadeComboBox.setBounds(150, 285, 230, 30);
        container.add(cidadeComboBox);

        // botoes
        exibirButton = new JButton("Exibir");
        exibirButton.setBounds(70, 550, 90, 25);
        container.add(exibirButton);

        limparButton = new JButton("Limpar");
        limparButton.setBounds(170, 550, 90, 25);
        container.add(limparButton);

        sairButton = new JButton("Sair");
        sairButton.setBounds(270, 550, 90, 25);
        container.add(sairButton);

        // funcionalidades botows
        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        limparButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (JTextField textField : textFields) textField.setText(null);
                for (JFormattedTextField formattedField : formattedFields) formattedField.setText(null);
                cidadeComboBox.setSelectedIndex(0);
            }
        });

          exibirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder info = new StringBuilder(" Informações do Cliente \n\n");
                for (int i = 0; i < textFields.length; i++) {
                    info.append(labelTexts[i]).append(": ").append(textFields[i].getText()).append("\n");
                }
                info.append(labelTexts[5]).append(": ").append(cidadeComboBox.getSelectedItem()).append("\n")
                    .append(labelTexts[6]).append(": ").append(cepField.getText()).append("\n")
                    .append(labelTexts[7]).append(": ").append(celularField.getText()).append("\n")
                    .append(labelTexts[8]).append(": ").append(telefoneField.getText()).append("\n")
                    .append(labelTexts[9]).append(": ").append(dataField1.getText()).append("\n")
                    .append(labelTexts[10]).append(": ").append(dataField2.getText()).append("\n");
                
                JOptionPane.showMessageDialog(null, info.toString());
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercicio7();
    }
}
