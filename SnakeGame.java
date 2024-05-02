package snakegame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
public class SnakeGame extends JPanel implements ActionListener, KeyListener{
    public class Tile{
        int a,b;
        Tile(int a,int b){ 
            this.a = a; this.b = b;
        }
    }
    char key_pressed;
    int check1,zero=0,clr1=40,clr2=200,clr3=150,one=1,fnt=30,sub=16;
    int hight,width,tilesize = 25,t=5;
    Tile food,head; 
    Random random;
    ArrayList <Tile> snakeBody; Timer gameloop;   
    int valocityX,valocityY,value;
    boolean gameOver = false;    
    public SnakeGame(int hight,int width,int time){
        this.hight = hight; 
        this.width = width;       
        setPreferredSize(new Dimension(this.width,this.hight));
        setBackground(Color.black);addKeyListener(this);setFocusable(true);
        head = new Tile(t,t); food = new Tile(t,t);
        snakeBody = new ArrayList<Tile>();        
        random = new Random();                 
        gameloop = new Timer(time,this);
        gameloop.start(); valocityX = 1; valocityY = 0;
    }    
    public boolean collision(Tile taile1, Tile taile2){
        return taile1.a == taile2.a && taile1.b == taile2.b;
    }
    @Override
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
            g.setColor(new Color(clr1,clr2, clr3));
            Tile snakepart = snakeBody.get(i);
            g.fill3DRect(snakepart.a*tilesize, snakepart.b*tilesize, tilesize, tilesize,true);
        } g.setFont(new Font("Arial",Font.PLAIN,fnt));
        if(gameOver){
            g.setColor(Color.red);
            g.drawString("Game Over: "+String.valueOf(snakeBody.size()),tilesize-sub,tilesize);            
        }else{
        g.drawString("Score: "+String.valueOf(snakeBody.size()),tilesize-sub,tilesize);value = snakeBody.size();
        }
    }
         
    @Override
    public void keyPressed(KeyEvent e) { 
    if (e.getKeyCode()== KeyEvent.VK_UP && valocityY != one ){
        key_pressed = 'U';valocityX = zero; valocityY = - one;             // up button to go UP        
    }else if (e.getKeyCode()== KeyEvent.VK_DOWN && valocityY != - one){ // down button to go down
        valocityX = zero; valocityY = one;
    }else if (e.getKeyCode()== KeyEvent.VK_LEFT && valocityX != one){ // left button to go left
        valocityX = - one; valocityY = zero;
    }else if (e.getKeyCode()== KeyEvent.VK_RIGHT && valocityX !=- one){ // right button to go right
        valocityX = one; valocityY = zero;}
    }
    @Override
    public void keyTyped(KeyEvent e) {}@Override
    public void keyReleased(KeyEvent e) {} 
    @Override
    public void actionPerformed(ActionEvent e) {}
}