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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
    ImageIcon icono = new ImageIcon("icono.png");
    ImageIcon fondoP = new ImageIcon("fondo.jpg");
    ImageIcon reverso = new ImageIcon("reverso.jpg");
    ImageIcon z1 = new ImageIcon("z1.png");
    ImageIcon z2 = new ImageIcon("z2.png");
    ImageIcon z3 = new ImageIcon("z3.png");

    JLabel carta1 = new JLabel(reverso);
    JLabel carta2 = new JLabel(reverso);
    JLabel carta3 = new JLabel(reverso);
    JLabel carta4 = new JLabel(reverso);
    JLabel carta5 = new JLabel(reverso);
    JLabel carta6 = new JLabel(reverso);

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

        carta1.setBounds(75, 20, 200, 250);
        carta2.setBounds(325, 20, 200, 250);
        carta3.setBounds(575, 30, 200, 250);
        carta4.setBounds(75, 300, 200, 250);
        carta5.setBounds(325, 300, 200, 250);
        carta6.setBounds(575, 300, 200, 250);

        panel.setLayout(null);

        panel.add(carta1);
        panel.add(carta2);
        panel.add(carta3);
        panel.add(carta4);
        panel.add(carta5);
        panel.add(carta6);
        frame.add(panel);
        panel.setVisible(true);
        frame.setVisible(true);
        carta1();
        carta2();
        carta3();
        carta4();
        carta5();
        carta6();

    }

    public void carta1() {
        MouseListener raton1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (carta1.getIcon() == reverso) {
                    carta1.setIcon(z2);
                } else {
                    carta1.setIcon(reverso);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        carta1.addMouseListener(raton1);
    }

    public void carta2() {
        MouseListener raton1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (carta2.getIcon() == reverso) {
                    carta2.setIcon(z3);
                } else {
                    carta2.setIcon(reverso);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        carta2.addMouseListener(raton1);
    }

    public void carta3() {
        MouseListener raton1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (carta3.getIcon() == reverso) {
                    carta3.setIcon(z3);
                } else {
                    carta3.setIcon(reverso);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        carta3.addMouseListener(raton1);
    }

    public void carta4() {
        MouseListener raton1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (carta4.getIcon() == reverso) {
                    carta4.setIcon(z1);
                } else {
                    carta4.setIcon(reverso);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        carta4.addMouseListener(raton1);
    }

    public void carta5() {
        MouseListener raton1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (carta5.getIcon() == reverso) {
                    carta5.setIcon(z2);
                } else {
                    carta5.setIcon(reverso);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        carta5.addMouseListener(raton1);
    }

    public void carta6() {
        MouseListener raton1 = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (carta6.getIcon() == reverso) {
                    carta6.setIcon(z1);
                } else {
                    carta6.setIcon(reverso);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        carta6.addMouseListener(raton1);
    }

    public static void main(String[] args) {
        new Ventana();
    }

}
