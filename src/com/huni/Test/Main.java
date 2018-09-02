package com.huni.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JPanel implements ActionListener {
    Timer timer = new Timer(20,this);
    Image imageIcon = new ImageIcon("com/huni/Test/2.png").getImage();
    JFrame frame;
    public Main(JFrame frame) {
        timer.start();
        this.frame = frame;
    }
    public void paint(Graphics g) {
        g.drawImage(imageIcon, 0, 0,frame.getWidth(), frame.getHeight(), null);
    }
    @Override
    public void actionPerformed(ActionEvent ev){
        repaint();
    }
}
