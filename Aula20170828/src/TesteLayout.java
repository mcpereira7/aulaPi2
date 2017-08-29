
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TesteLayout {
    public static void main(String[] args) {
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                criarGUI();
            }
        };
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
        
        JPanel panel = new JPanel();
       // panel.setLayout(new BorderLayout());
       //panel.setLayout(new FlowLayout(FlowLayout.TRAILING));
       panel.setLayout(new GridLayout(2,0));
        frame.getContentPane().add(panel);
        JButton button01 = new JButton("Botão 01");
        //panel.add(button01, BorderLayout.NORTH);
        panel.add(button01);
        JButton button02 = new JButton("Botão 01");
        //panel.add(button02, BorderLayout.SOUTH); 
        panel.add(button02);
        JButton button03 = new JButton("Botão 01");
        //panel.add(button03, BorderLayout.EAST);
        panel.add(button03);
        
        
        
        frame.pack();
        frame.setVisible(true);

    }
}
