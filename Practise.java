package com.mycompany.practise;
import java.awt.Color;
import javax.swing.*;
public class Practise {
    
    public static void main(String[] args) {
        int hight = 400, width = 400;
       JFrame frame = new JFrame("snake");
       frame.setVisible(true);
       frame.setSize(width, hight);
       frame.setLocationRelativeTo(null);
       frame.setResizable(false);
       frame.setBackground(Color.BLACK);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       SnakeGame game = new SnakeGame(width,hight);
       frame.add(game);
    }   
}
