package speed;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import snakegame.Snake; 
public class Speed{
    int hight,width,mtime=500,ltime=1000,htime=200,fSize=400,h=150,w=30,x=100;
    public Speed(int hight, int width){
        this.hight=hight;
        this.width = width;
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
            bton3.setBounds(x,y,h,w);
            bton3.setBackground(Color.yellow);
            bton3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
            int time = 200;
            Snake game = new Snake(width,hight,time);
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
            frame.setSize(fSize,fSize);  
            frame.setLayout(null);frame.setVisible(true);
    }    
    void Medium(int y,JButton bton4,int hight,int width,JFrame frame){
            bton4.setBounds(x,y,h,w);
            bton4.setBackground(Color.yellow);
            bton4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
            int time = 500;
            Snake game = new Snake(width,hight,time);
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
            frame.setSize(fSize,fSize);  
            frame.setLayout(null);frame.setVisible(true);
    }      
}