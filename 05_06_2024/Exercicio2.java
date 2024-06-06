import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Exercicio2 extends JFrame{ 
    super("Exemplo de Lista");
    Container tela = getContentPane();
    setLayout(null);
    exibir = new JButton("Exibir");
    lista = new JList(cidades);
    lista.setVisibleRowCount(5);
    JScrollPane painelRolagem = new JScrollPane(lista);
    lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    painelRolagem.setBounds(40,50,150,100);
    exibir.setBounds(270, 50, 100, 30);
    exibir.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Object selecionados[] = lista.getSelectedValues();
                String resultados = "Valores selecionados: \n";
                for(inr i=0; i<selecionados.length; i++)
                 resultados += selecionados[i].toString()+"\n";
                JOptionPane.showMessageDialog(null, resultados);
            }
        }
    )
    tela.add(painelRolagem);
    tela.add(exibir);
    setSize(400,250);
    setVisible(true);
    public static void main(String args[]){
        Exercicio2 app = new Exercicio2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}