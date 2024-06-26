import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exercicio1 extends JFrame{
    //Lista Simples
    JList lista;
    String cidades[]={"Rio de Janeiro","São Paulo","Minas Gerais","Espírito Santo",
    "Bahia","Pernambuco","Rio Grande do Sul","Acre"};
    JButton exibir;
    JLabel rotulo;
       public Exercicio1(){
        super("Exemplo de Lista");
        Container tela = getContentPane();
        setLayout(null);
        exibir = new JButton("Exibir");
        rotulo = new JLabel("");
        lista = new JList(cidades);
        lista.setVisibleRowCount(5);
        JScrollPane painelRolagem = new JScrollPane(lista);
        lista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        painelRolagem.setBounds(40,50,150,100);
        exibir.setBounds(270, 50, 100, 30);
        rotulo.setBounds(50, 150, 200, 30);
        exibir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo.setText("O estado é: " +lista.getSelectedValue().toString());
                    }
                }
            );
        tela.add(painelRolagem);
        tela.add(exibir);
        tela.add(rotulo);
        setSize(400,250);
        setVisible(true);
        }
       public static void main(String[] args) {
        Exercicio1 app = new Exercicio1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}