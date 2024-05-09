package snakegame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import snakegame.SnakeGame;
import snakegame.SnakeGame.Tile;

public class Snake extends SnakeGame implements ActionListener{

    public Snake(int hight, int width, int time) {
        super(hight, width, time);
        Food();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         repaint(); move();
         check1 = 15;
         if(gameOver){ gameloop.stop();
            JOptionPane.showMessageDialog(null, "GAME OVER\n SCORE : "+value, null, JOptionPane.PLAIN_MESSAGE);
        try{FileWriter file = new FileWriter("C:\\Users\\USER\\OneDrive\\Documents\\NetBeansProjects\\Game\\src\\main\\java\\com\\mycompany\\game\\Game_record.txt",true);
            BufferedWriter writer = new BufferedWriter(file);
            LocalTime localtime = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
            String time = localtime.format(formatter);        
            Date date = new Date();
            DateFormat dateformat = new SimpleDateFormat("dd:MM:YYYY");
            String formatdate = dateformat.format(date);
            writer.write("Game Score : "+value+" & Ending Time:"+time+" & Date:"+formatdate+"\n");
            writer.close();file.close();
        }catch(IOException ee){ ee.printStackTrace();}
        }
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
    public void Food(){ // here the food position wil be a random number
        food.a = random.nextInt(width/tilesize); 
        food.b = random.nextInt(hight/tilesize);
    }
}