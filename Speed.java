package com.mycompany.practice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Speed{
    Speed(int hight, int width){
    JFrame frame = new JFrame("Speed");
            int y=100,add=50;
            Frame(frame,hight,width);           
            JButton bton3=new JButton("High");
            High(y,bton3,hight,width,frame);
            JButton bton4=new JButton("Medium");
            Medium(y+=add,bton4,hight,width,frame);                        
            JButton bton5=new JButton("Low");
            Low(y+=add,bton5,hight,width,frame);
    }
    void Frame(JFrame frame,int hight,int width){
        frame.getContentPane().setBackground(Color.green);
        frame.setVisible(true);
        frame.setSize(width, hight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
    void High(int y,JButton bton3,int hight,int width,JFrame frame){
            bton3.setBounds(100,y,150,30);
            bton3.setBackground(Color.yellow);
            bton3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
            int time = 200;
            SnakeGame game = new SnakeGame(width,hight,time);
            JFrame frame = new JFrame("snake");
            frame.setVisible(true);
            frame.setSize(width, hight);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(game);                   
            }  
        });
            frame.add(bton3);
            frame.setSize(400,400);  
            frame.setLayout(null);frame.setVisible(true);
    }    
    void Medium(int y,JButton bton4,int hight,int width,JFrame frame){
            bton4.setBounds(100,y,150,30);
            bton4.setBackground(Color.yellow);
            bton4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
            int time = 500;
            SnakeGame game = new SnakeGame(width,hight,time);
            JFrame frame = new JFrame("snake");
            frame.setVisible(true);
            frame.setSize(width, hight);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(game);                   
            }  
        });
            frame.add(bton4);
            frame.setSize(400,400);  
            frame.setLayout(null);frame.setVisible(true);
    }    
    void Low(int y,JButton bton5,int hight,int width,JFrame frame){
            bton5.setBounds(100,y,150,30);
            bton5.setBackground(Color.yellow);
            bton5.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
            int time = 1000;
            SnakeGame game = new SnakeGame(width,hight,time);
            JFrame frame = new JFrame("snake");
            frame.setVisible(true);
            frame.setSize(width, hight);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(game);                    
            }  
        });
            frame.add(bton5);
            frame.setSize(400,400);  
            frame.setLayout(null);  
            frame.setVisible(true);
    }
}