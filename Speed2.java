package speed;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import snakegame.Snake;
public class Speed2 extends Speed{
    
    public Speed2(int hight, int width) {
        super(hight, width);
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
    void Low(int y,JButton bton5,int hight,int width,JFrame frame){
            bton5.setBounds(x,y,h,w);
            bton5.setBackground(Color.yellow);
            bton5.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
            int time = 1000;
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
            frame.add(bton5);
            frame.setSize(fSize,fSize);  
            frame.setLayout(null);  
            frame.setVisible(true);
    }
}