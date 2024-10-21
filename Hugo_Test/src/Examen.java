
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author FP
 */
public class Examen {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    private int preguntasCorrectas = 0;
    private int preguntasActuales = 0;
    private ButtonGroup grupo;
    private JLabel preguntas;
    private JRadioButton[] radioButtons;

    private String[] pregunta = {
        "Pregunta 1: ¿Cuál es la capital de Francia?",
        "Pregunta 2: ¿Cuál es la fórmula del agua?",
        "Pregunta 3: ¿Qué es un bucle?",
        "Pregunta 4: ¿Cuántos continentes hay?",
        "Pregunta 5: ¿Qué es una variable?",
        "Pregunta 6: ¿Qué es un objeto?",
        "Pregunta 7: ¿Qué es la herencia?",
        "Pregunta 8: ¿Qué es un array?",
        "Pregunta 9: ¿Qué es un algoritmo?",
        "Pregunta 10: ¿Qué es un constructor?"
    };

    private String[][] opciones = {
        {"A. Berlín", "B. París", "C. Madrid", "D. Roma"},
        {"A. H2O", "B. CO2", "C. O2", "D. NaCl"},
        {"A. Un tipo de buque", "B. Un error", "C. Una estructura repetitiva", "D. Ninguna"},
        {"A. 5", "B. 6", "C. 7", "D. 8"},
        {"A. Un valor almacenado", "B. Un tipo de bucle", "C. Una función", "D. Ninguna"},
        {"A. Una función", "B. Una clase", "C. Un método", "D. Un bucle"},
        {"A. Un tipo de bucle", "B. Una característica de OOP", "C. Un método", "D. Ninguna"},
        {"A. Un tipo de variable", "B. Un objeto", "C. Una colección", "D. Ninguna"},
        {"A. Un método", "B. Un conjunto de instrucciones", "C. Un error", "D. Ninguna"},
        {"A. Un método especial", "B. Un constructor de objetos", "C. Una función", "D. Ninguna"}
    };

    private char[] arrayCorrectos = {'B', 'A', 'C', 'D', 'A', 'B', 'B', 'C', 'B', 'B'};

    ImageIcon icono = new ImageIcon("icono.png");

    public Examen() {
        //CARACTERÍSTICAS PARA MIS OBJETOS
        panel.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icono.getImage());
        frame.setTitle("PREGUNTAS EXAMEN");
        frame.setResizable(false);
        frame.setSize(640, 400);
        frame.setLocation(700, 300);
        panel.setSize(500, 500);
        panel.setLocation(700, 300);
        panel.setBackground(Color.pink);

        preguntas = new JLabel(pregunta[preguntasActuales]);
        panel.add(preguntas);

        grupo = new ButtonGroup();
        radioButtons = new JRadioButton[4];
        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i] = new JRadioButton();
            grupo.add(radioButtons[i]);
            frame.add(radioButtons[i]);
        }

        actualizarOpciones();
        //
        //AÑADIR TODO
        frame.add(panel);
        panel.setVisible(true);
        frame.setVisible(true);
    }
    private void actualizarOpciones() {
        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i].setText(opciones[preguntasActuales][i]);
        }
    }
}
