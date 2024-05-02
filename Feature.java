package feature;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import snakegame.Snake;
import speed.Speed2;
public class Feature {
    Feature(int hight,int width){  
        int y=100,add=50;     
        JFrame frame = new JFrame("Home page");
        Frame(frame,hight,width);      
        JButton bton=new JButton("New_Game");  
        button(y,bton,hight,width,frame);        
        JButton bton2=new JButton("Speed");
        control_speed(y+=add,bton2,hight,width,frame);        
        JButton bton7=new JButton("History");
        saved_score(y+=add,bton7,hight,width,frame);           
            JButton bton6=new JButton("Exit");
            exit(y+=add,bton6,hight,width,frame);
    }   
    void button(int y,JButton bton,int hight,int width,JFrame frame){
        bton.setBounds(100,y,150,30); 
        bton.setBackground(Color.orange);
        bton.addActionListener(new ActionListener(){  
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
        frame.add(bton);  
        frame.setSize(400,400);  
        frame.setLayout(null);frame.setVisible(true);
    }    
    void control_speed(int y,JButton bton2,int hight,int width,JFrame frame){
        bton2.setBounds(100,y,150,30);        
        bton2.setBackground(Color.orange);
        bton2.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
              SpreedClass sp = new SpreedClass(width,hight);
            }  
        }); frame.add(bton2);
            frame.setSize(400,400);  
            frame.setLayout(null);frame.setVisible(true);
    }      
    void exit(int y,JButton bton6,int hight,int width,JFrame frame){
        bton6.setBounds(100,y,150,30);
            bton6.setBackground(Color.orange);
            bton6.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){             
            System.exit(0);                    
            }  
        }); frame.add(bton6);
            frame.setSize(400,400);  
            frame.setLayout(null);frame.setVisible(true);
    }    
    void Frame(JFrame frame,int hight,int width){    
       frame.setVisible(true);frame.setSize(width, hight);
       frame.setLocationRelativeTo(null);
       frame.setResizable(false);
       frame.getContentPane().setBackground(Color.green);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}