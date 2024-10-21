
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author FP
 */
public class Ventana {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel etiqueta = new JLabel();
    JButton boton = new JButton();
    ImageIcon icono = new ImageIcon("icono.png");

    public Ventana() {
        //CARACTERÍSTICAS PARA MIS OBJETOS
        panel.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icono.getImage());
        frame.setTitle("EXAMEN HUGO GÓMEZ <3");
        frame.setResizable(false);
        frame.setSize(640, 400);
        frame.setLocation(700, 300);
        panel.setSize(500, 500);
        panel.setLocation(700, 300);
        panel.setBackground(Color.pink);
        etiqueta.setText("EXAMEN HUGO GÓMEZ JIMÉNEZ");
        etiqueta.setFont(new Font("Arial", Font.BOLD, 20));
        etiqueta.setBounds(150, 50, 340, 100);
        //etiqueta.setBorder(new LineBorder(Color.black, 5, true));
        boton.setText("EMPEZAR EL EXÁMEN");
        boton.setFont(new Font("Arial", Font.BOLD, 20));
        boton.setBounds(150, 150, 340, 100);
        boton.setForeground(Color.white);
        boton.setBackground(Color.black);
        //
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Examen();
            }
        });
        //AÑADIR TODO
        panel.add(boton);
        panel.add(etiqueta);
        frame.add(panel);
        panel.setVisible(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Ventana();
    }
}
