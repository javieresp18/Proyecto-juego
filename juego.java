import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class juego extends JFrame {

    public juego() {
        setTitle("Problema Matemático");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);
        

        JLabel question = new JLabel("¿Cuánto es 5 + 3?");
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        panel.add(question, c);
        

        JButton option1 = new JButton("Opción 1: 7");
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1;
        panel.add(option1, c);

        JButton option2 = new JButton("Opción 2: 8");
        c.gridx = 3;
        c.gridy = 0;
        panel.add(option2, c);

        JButton option3 = new JButton("Opción 3: 6");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(option3, c);

        JButton option4 = new JButton("Opción 4: 9");
        c.gridx = 1;
        c.gridy = 1;
        panel.add(option4, c);
        

        add(panel);


        ActionListener optionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                if (source.getText().equals("Opción 2: 8")) {
                    System.out.println("Correcto");
                } else {
                    System.out.println("Incorrecto");
                }
            }
        };
        
        option1.addActionListener(optionListener);
        option2.addActionListener(optionListener);
        option3.addActionListener(optionListener);
        option4.addActionListener(optionListener);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new juego().setVisible(true);
            }
        });
    }
}
