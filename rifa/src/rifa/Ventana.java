/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifa;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

/**
 *
 * @author FP
 */
public class Ventana {
    
    JFrame ventana = new JFrame();
    JPanel panel = new JPanel();
    JButton botonAleatorio = new JButton();
    JButton botonGuardar = new JButton();
    JButton botonStart = new JButton();
    JLabel titulo = new JLabel();
    JLabel cartonAleatorio = new JLabel();
    
    JTextField numero1 = new JTextField();
    JTextField numero2 = new JTextField();
    JTextField numero3 = new JTextField();
    JTextField numero4 = new JTextField();
    JTextField numero5 = new JTextField();
    
    JLabel nombre = new JLabel();
    //
    ImageIcon icon = new ImageIcon("img/algeciras.jpg");
    //
    Juego juego = new Juego();
    
    public Ventana() {
        ventana.setVisible(true);
        ventana.setSize(800, 500);
        ventana.setTitle("RIFA ALGECIREÑA");
        ventana.setIconImage(icon.getImage());
        ventana.setLocation(550, 300);
        //ventana.setResizable(false);
        Panel();
        Nombre();
        Numero1();
        Numero2();
        Numero3();
        Numero4();
        Numero5();
        botonStart();
    }
    
    public void Panel() {
        ventana.add(panel);
        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);
    }
    
    public void botonAleatorio() {
        juego.cartonAleatorio();
        panel.add(botonAleatorio);
    }
    
    public void botonStart() {
        String frase = juego.jugar();
        botonStart.setBackground(Color.red);
        botonStart.setBorder(new LineBorder(Color.black, 5, true));
        botonStart.setBounds(200, 500, 200, 50);
        botonStart.setText("EMPEZAR RIFA");
        panel.add(botonAleatorio);
    }
    
    public void Nombre() {
        nombre.setText("RIFA ALGECIREÑA!");
        nombre.setBounds(200, 15, 350, 100);
        nombre.setFont(new Font("Arial", Font.BOLD, 35));
        nombre.setBorder(new LineBorder(Color.black, 5, true));
        
        panel.add(nombre);
    }
    
    public void Numero1() {
        numero1.setText("1");
        numero1.setBounds(120, 120, 75, 75);
        numero1.setFont(new Font("Arial", Font.BOLD, 60));
        numero1.setBorder(new LineBorder(Color.black, 5, true));
        numero1.setVisible(true);
        panel.add(numero1);
    }
    
    public void Numero2() {
        numero2.setText("2");
        numero2.setBounds(220, 120, 75, 75);
        numero2.setFont(new Font("Arial", Font.BOLD, 60));
        numero2.setBorder(new LineBorder(Color.black, 5, true));
        numero2.setVisible(true);
        panel.add(numero2);
    }
    
    public void Numero3() {
        numero3.setText("3");
        numero3.setBounds(320, 120, 75, 75);
        numero3.setFont(new Font("Arial", Font.BOLD, 60));
        numero3.setBorder(new LineBorder(Color.black, 5, true));
        numero3.setVisible(true);
        panel.add(numero3);
    }
    
    public void Numero4() {
        numero4.setText("4");
        numero4.setBounds(420, 120, 75, 75);
        numero4.setFont(new Font("Arial", Font.BOLD, 60));
        numero4.setBorder(new LineBorder(Color.black, 5, true));
        numero4.setVisible(true);
        panel.add(numero4);
    }
    
    public void Numero5() {
        numero5.setText("5");
        numero5.setBounds(520, 120, 75, 75);
        numero5.setFont(new Font("Arial", Font.BOLD, 60));
        numero5.setBorder(new LineBorder(Color.black, 5, true));
        numero5.setVisible(true);
        panel.add(numero5);
    }
    
}
