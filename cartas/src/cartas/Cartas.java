/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author FP
 */
public class Cartas {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel() {
        private Image fondoImg = new ImageIcon("fondo.jpg").getImage();

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(fondoImg, 0, 0, getWidth(), getHeight(), this);
        }
    };
    JLabel etiqueta = new JLabel();
    ImageIcon icono = new ImageIcon("icono.png");
    ImageIcon fondoP = new ImageIcon("fondo.jpg");
    JLabel carta1 = new JLabel();
    JLabel carta2 = new JLabel();
    JLabel carta3 = new JLabel();
    JLabel carta4 = new JLabel();
    JLabel carta5 = new JLabel();
    JLabel carta6 = new JLabel();

    public Cartas() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(icono.getImage());
        frame.setTitle("EMPAREJA LAS CARTAS !!!");
        frame.setResizable(false);
        frame.setSize(1068, 601);
        frame.setLocation(700, 300);
        panel.setSize(1068, 601);
        panel.setLocation(700, 300);
        panel.setBackground(Color.yellow);

        etiqueta.setText("CARTAS");
        etiqueta.setFont(new Font("Arial", Font.BOLD, 50));
        etiqueta.setBounds(300, 0, 340, 100);
        etiqueta.setForeground(Color.white);

        panel.setLayout(null);

        panel.add(etiqueta);
        frame.add(panel);
        panel.setVisible(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Ventana();
    }

}
