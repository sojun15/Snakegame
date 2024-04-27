package com.mycompany.practice;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;
import java.io.*;
public class SnakeGame extends JPanel implements ActionListener, KeyListener{
    private class Tile{
        int a,b;
        Tile(int a,int b){ this.a = a; this.b = b;}
    }
    int hight,width,tilesize = 25;
    Tile food,head; Random random;
    ArrayList <Tile> snakeBody; Timer gameloop;   
    int valocityX,valocityY,value;
    boolean gameOver = false;    
    SnakeGame(int hight,int width,int time){
        this.hight = hight; this.width = width;       
        setPreferredSize(new Dimension(this.width,this.hight));
        setBackground(Color.black);addKeyListener(this);setFocusable(true);
        head = new Tile(5,5); food = new Tile(5,5);
        snakeBody = new ArrayList<Tile>();        
        random = new Random(); Food();                
        gameloop = new Timer(time,this);
        gameloop.start(); valocityX = 1; valocityY = 0;
    }    
    public boolean collision(Tile taile1, Tile taile2){
        return taile1.a == taile2.a && taile1.b == taile2.b;
    }@Override
    public void paintComponent(Graphics gp){
        super.paintComponent(gp); draw(gp);
    }    
    public void draw(Graphics g){        
        g.setColor(Color.red);
        g.fill3DRect(food.a*tilesize, food.b*tilesize, tilesize, tilesize,true);        
        g.setColor(Color.blue);
        g.fill3DRect(head.a*tilesize, head.b*tilesize, tilesize, tilesize,true);        
        draw2(g);       
    }
    public void draw2(Graphics g){
        for(int i=0;i<snakeBody.size();i++){
            g.setColor(new Color(40, 200, 150));
            Tile snakepart = snakeBody.get(i);
            g.fill3DRect(snakepart.a*tilesize, snakepart.b*tilesize, tilesize, tilesize,true);
        } g.setFont(new Font("Arial",Font.PLAIN,30));
        if(gameOver){
            g.setColor(Color.red);
            g.drawString("Game Over: "+String.valueOf(snakeBody.size()),tilesize-16,tilesize);            
        }else{
        g.drawString("Score: "+String.valueOf(snakeBody.size()),tilesize-16,tilesize);value = snakeBody.size();
        }
    }
    public void Food(){ // here the food position wil be a random number
        food.a = random.nextInt(width/tilesize); food.b = random.nextInt(hight/tilesize);
    }
    public void move(){ // by eating food our snake will be big
        if (collision(head, food)){
            snakeBody.add(new Tile(food.a, food.b));Food();
        }         
        for (int i = snakeBody.size()-1;i>=0;i--){
        Tile snakePart = snakeBody.get(i);
        if(i==0){snakePart.a = head.a; snakePart.b = head.b;}
        else{Tile preSnakePart = snakeBody.get(i-1);
            snakePart.a = preSnakePart.a; snakePart.b = preSnakePart.b;}
        }        
        move2();
    }
    public void move2(){
        head.a += valocityX; head.b += valocityY;
        for(int i=0;i<snakeBody.size();i++){
            Tile snakepart = snakeBody.get(i);
            if(collision(head,snakepart)){gameOver = true;}
        }        
        if(head.a*tilesize<0 || head.a*tilesize>width || head.b*tilesize<0 || head.b*tilesize>hight){
            gameOver = true;
        }
    }
@Override
    public void actionPerformed(ActionEvent e) {
         repaint(); move();
         if(gameOver){ gameloop.stop();
            JOptionPane.showMessageDialog(null, "GAME OVER\n SCORE : "+value, null, JOptionPane.PLAIN_MESSAGE);
        try{FileWriter file = new FileWriter("C:\\Users\\HP\\Documents\\NetBeansProjects\\Practise\\Game.txt",true);
            BufferedWriter writer = new BufferedWriter(file);
            writer.write("Game Score : "+value+"\n");writer.close();file.close();
        }catch(IOException ee){ ee.printStackTrace();}
        }
    }switch (e.getKeyCode()) {
        case KeyEvent.VK_UP:
             valocityX = 0;valocityY = -1;
                    break;
        case KeyEvent.VK_DOWN:        
             valocityX = 0;valocityY = 1;
                    break;
        case KeyEvent.VK_LEFT:
             valocityX = -1;valocityY = 0;
                    break;
        case KeyEvent.VK_RIGHT:
             valocityX = 1;valocityY = 0;
                    break;
            }
    }