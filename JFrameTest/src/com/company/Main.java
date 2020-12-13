package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    // write your code here

     public static void createGUI()
      {
          JFrame frame = new JFrame("Тестовое окно");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          JLabel label = new JLabel("Тестовое сообщение");
          frame.getContentPane().add(label);

          frame.setPreferredSize(new Dimension(200, 200));
          frame.setLocation(1200, 300);
          frame.pack();
          frame.setVisible(true);
      }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI();
            }

        });
    }
}



