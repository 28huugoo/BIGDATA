/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author FP
 */
public class Ventana {

    JFrame ventana = new JFrame();//objeto tipo jframe
    JPanel panel = new JPanel();//objeto tipo JPanel
    JLabel etiqueta = new JLabel();
    JTextField cuadrotexto = new JTextField();
    JButton boton = new JButton();

    public Ventana() { //constructor vacio para la ventana jframe
        ventana.setVisible(true);//para que la ventana sea visible

        ventana.setTitle("JavaSwing");//nombre a la ventana

        ventana.setSize(500, 500);//para darle tamaño a la ventana
        ventana.setResizable(true);
        //ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);//poner pantalla completa

        //ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //no hace nada al darle a la x
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierra al darle a la x (default)
        //ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//minimiza al darle a la x
        //ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//elimina al darle a la x

        ventana.setLocation(300, 190);//posicion inicial de la pantalla

        ventana.getContentPane().setBackground(Color.green);

        Panel();//llama al método 
        Etiqueta();
        CajaTexto();
        Boton();
        EtiquetaImagen();
        FondoPantalla();

    }

    public void Panel() {//metodo para construir un panel

        panel.setBackground(Color.red);
        //panel.setMaximumSize(new Dimension(500,500));
        //panel.setMinimumSize(new Dimension(200,100));

        panel.setLayout(null);//desactiva layout por defecto
        /*panel.setLayout(new FlowLayout());//alineamiento a la izquierda
        panel.setLayout(new BorderLayout());//cinco zonas, norte sur este oeste centro
        panel.setLayout(new GridBagLayout());//cuadricula flexible
        panel.setLayout(new BoxLayout(panel,0));//por coordenadas
         */
        ventana.add(panel);// para añadir un elemento a otro. panel sobre ventana

    }

    public void Etiqueta() { //metodo para construir una etiqueta

        etiqueta.setText("pistachos");
        etiqueta.setBounds(50, 50, 140, 40);//cambiar coordenadas y mtamaño 
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

        etiqueta.setOpaque(true);//para que la etiquta no sea transparente
        etiqueta.setForeground(Color.yellow);
        etiqueta.setBackground(Color.red);
        etiqueta.setFont(new Font("Candara", Font.BOLD, 10));

        panel.add(etiqueta);

    }

    public void CajaTexto() {

        cuadrotexto.setBounds(100, 100, 100, 40);

        panel.add(cuadrotexto);

    }

    public void Boton() {

        boton.setBounds(100, 150, 170, 50);
        ImageIcon imagenBoton = new ImageIcon("Imagenes/r8.png");

        boton.setText("CLICKA Y GANA 500€");
        boton.setHorizontalAlignment(SwingConstants.LEFT);
        boton.setForeground(Color.red);

        panel.add(boton);
    }

    public void EtiquetaImagen() {
        //JLabel etiquetaImagen = new JLabel(new ImageIcon("Imagenes/r8.png"));
        ImageIcon imagen = new ImageIcon("Imagenes/r8.png");
        JLabel etiquetaImagen = new JLabel();
        //etiquetaImagen.seticon(imagen);
        etiquetaImagen.setBounds(500, 500, 500, 500);
        etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), 0)));
        panel.add(etiquetaImagen);
    }

    public void FondoPantalla() {
        JLabel fondo = new JLabel();

        fondo.setBounds(0, 0, panel.getWidth(), panel.getHeight());
        fondo.setOpaque(true);
        fondo.setBackground(Color.red);
        panel.add(fondo);

    }
}
