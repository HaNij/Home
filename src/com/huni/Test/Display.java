package com.huni.Test;

import javax.swing.*;
import java.awt.*;

public class Display {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setSize(1920,1080);
        frame.setUndecorated(true);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(new Main(frame));


    }
}
