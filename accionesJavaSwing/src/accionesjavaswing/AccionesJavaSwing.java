/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accionesjavaswing;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author FP
 */
public class AccionesJavaSwing {
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextArea area = new JTextArea();
    
    public AccionesJavaSwing() {
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("mouse mierdas");
        area();
        panel();
    }
    
    public void area() {
        area.setBounds(50, 50, 400, 400);
        area.setLayout(null);
        area.addMouseListener(raton);
        area.addKeyListener(teclado);
    }
    
    public void panel() {
        panel.add(area);
        panel.setSize(500, 500);
        panel.add(area);
        panel.setLayout(null);
        panel.setBackground(Color.red);
    }
    KeyListener teclado = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            area.append("AMNSIJKIMASDASDSAK");
        }
        
        @Override
        public void keyPressed(KeyEvent e) {
            area.append("chochooooooooooooo");
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
            area.append("PE NEEEEEEEEEEEEEEEEEEEEEE");
        }
    };
    
    MouseListener raton = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            area.append("has clikao makina\n");
        }
        
        @Override
        public void mouseReleased(MouseEvent e) {
            area.append("has soltao makina\n");
        }
        
        @Override
        public void mouseEntered(MouseEvent e) {
            area.append("has entrao makina\n");
            
        }
        
        @Override
        public void mouseExited(MouseEvent e) {
            area.append("has salio makina\n");
            
        }
        
        @Override
        public void mousePressed(MouseEvent e) {
            area.append("has presionao makina\n");
            
        }
    };
    
}
