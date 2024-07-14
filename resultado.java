import javax.swing.*;
import java.awt.*;

public class resultado extends JFrame {

    public resultado() {
        setTitle("Resultados del Nivel");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        // Crear etiquetas y botones
        JLabel estrellasLabel = new JLabel("Estrellas Ganadas");
        JLabel puntuacionLabel = new JLabel("Puntuación: 850 puntos");
        JLabel tiempoLabel = new JLabel("Tiempo: 2 min 45 seg");

        JButton reintentarButton = new JButton("Reintentar");
        JButton siguienteNivelButton = new JButton("Siguiente Nivel");

        // Agregar componentes al panel
        panel.add(estrellasLabel);
        panel.add(new JLabel("")); // Espacio vacío
        panel.add(puntuacionLabel);
        panel.add(tiempoLabel);
        panel.add(reintentarButton);
        panel.add(siguienteNivelButton);

        // Agregar panel al frame
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new resultado());
    }
}
