
package com.mycompany.practise;
import java.awt.*;
import javax.swing.*;
public class SnakeGame extends JPanel{

    private class Scord{
        int a;
        int b;
        
        // scord means each house
        Scord(int a,int b){
            this.a = a;
            this.b = b;
        }
    }
    int hight;
    int width;
    int scordsize = 25;
    
    Scord own;
    
    SnakeGame(int hight,int width){
        this.hight = hight;
        this.width = width;
        
        
        setPreferredSize(new Dimension(this.width,this.hight));
        setBackground(Color.ORANGE);
        
        own = new Scord(5,5);
    }
    
    public void paintComponent(Graphics gp){
        super.paintComponent(gp);
        draw(gp);
    }
    
    public void draw(Graphics gp){
        gp.setColor(Color.red);
        gp.fillRect(own.a, own.b, scordsize, scordsize);
    }
}
