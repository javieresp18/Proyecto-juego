import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class resultado extends JFrame {

    public resultado(long elapsedTime, boolean correct) {
        setTitle("Resultados del Nivel");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    
        long seconds = (elapsedTime / 1000) % 60;
        long minutes = (elapsedTime / 1000) / 60;

  
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel estrellasLabel = new JLabel("Estrellas Ganadas");
        JLabel puntuacionLabel = new JLabel(correct ? "Puntuación: 850 puntos" : "Puntuación: 0 puntos");
        JLabel tiempoLabel = new JLabel("Tiempo: " + minutes + " min " + seconds + " seg");

        JButton reintentarButton = new JButton("Reintentar");
        JButton siguienteNivelButton = new JButton("Siguiente Nivel");


        panel.add(estrellasLabel);
        panel.add(new JLabel("")); 
        panel.add(puntuacionLabel);
        panel.add(tiempoLabel);
        panel.add(reintentarButton);
        panel.add(siguienteNivelButton);


        add(panel);

        reintentarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new juego().setVisible(true);
                dispose(); 
            }
        });

        siguienteNivelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Siguiente Nivel");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new resultado(0, false));
    }
}


