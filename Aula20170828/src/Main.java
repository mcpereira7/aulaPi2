
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.ComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        // criando a thread que vai rodar o CriarGUI
        Runnable thread = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        // chamando a thread criada acima
        SwingUtilities.invokeLater(thread);
    }

    public static void criarGUI() {
        // criar o frame - a base da tela
        JFrame frame = new JFrame();

        // definindo configurações padrão do frame
        Dimension d = new Dimension(400, 600);
        frame.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing App 03");
        frame.setLocation(600, 100);

        // criando um painel para alocar os componentes
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        // Criando e adicionando RadioButton ao painel
        JRadioButton radio01 = new JRadioButton("Opção 01");
        panel.add(radio01);
        JRadioButton radio02 = new JRadioButton("Opção 02");
        panel.add(radio02);

        // Agrupando os radio buttons para que apenas uma opção possa ser selecionada
        ButtonGroup group = new ButtonGroup();
        group.add(radio01);
        group.add(radio02);

        // adicionando um combo box
        String[] opcoesCombo = {"Selecione", "Opção 01", "Opção 02", "Opção 03", "Opção 04", "Opção 05"};
        JComboBox comboBox = new JComboBox(opcoesCombo);
        panel.add(comboBox);

        // Criando e adicionando botão, e adicionando uma ação ao mesmo
        // referente aos radios button
        JButton button = new JButton("Botão 01");
        panel.add(button);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Opção 01: "
                        + radio01.isSelected() + "\nOpção 02: "
                        + radio02.isSelected()
                        + "\nOpção selecionada: " + comboBox.getSelectedItem());
            }
        });

        frame.pack();
        frame.setVisible(true);

    }

}
