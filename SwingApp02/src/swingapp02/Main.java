package swingapp02;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Minhathread mt = new Minhathread();
        SwingUtilities.invokeLater(mt);
    }
    public static void criarGUI(){
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(400,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing App 2");
        frame.setLocation(600, 100);
        
        final JLabel label = new JLabel("Olá mundo!");
        //frame.getContentPane().add(label);
        final JTextField field = new JTextField(10);
        JPanel panel = new JPanel();
        
        JCheckBox box = new JCheckBox("Item 01");
        JCheckBox box2 = new JCheckBox("Item 02");
        box.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED){
                    System.out.println("Selecionado");
                }
            }
        });
        
        JButton button = new JButton("Botão");
        JButton checado = new JButton("Botão 2");
        /*ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        };*/
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou no Botão " + field.getText());
                JOptionPane.showMessageDialog(frame, field.getText());
               
            }
        });
        checado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Item 01 selecionado: "+ box.isSelected() +
                        "\nItem 02 Selecionado: "+ box2.isSelected());
               
            }
        });
                
        panel.setOpaque(true);
        //panel.setBackground(Color.getHSBColor(50, 250, 600));
        panel.add(label);
        panel.add(field);
        panel.add(button);
        panel.add(checado);
        panel.add(box);
        panel.add(box2);
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
}
