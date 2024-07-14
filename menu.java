import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame {
    
    public menu() {

        setTitle("Menú Principal");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(1, 3, 10, 0));
        
        JButton btnIniciarJuego = new JButton("Iniciar Juego");
        JButton btnOpciones = new JButton("Opciones");
        JButton btnSalir = new JButton("Salir");
        
        panel.add(btnIniciarJuego);
        panel.add(btnOpciones);
        panel.add(btnSalir);
        

        add(panel);

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }
}
