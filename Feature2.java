package feature;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Feature2 extends Feature{
    public Feature2(int hight,int width){
        super(hight, width);
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
    void saved_score(int y,JButton bton7,int hight,int width,JFrame frame){
        bton7.setBounds(x,y,h,w);
            bton7.setBackground(Color.orange);
            bton7.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){            
            try{ //constructor of file class having file as argument  
            File file = new File("C:\\Users\\USER\\OneDrive\\Documents\\NetBeansProjects\\Game\\src\\main\\java\\com\\mycompany\\game\\Game_record.txt");   
            if(!Desktop.isDesktopSupported()){//check if Desktop is supported by Platform or not               
            System.out.println("not supported");return;}  
            Desktop desktop = Desktop.getDesktop();  
            if(file.exists())         //checks file exists or not  
            desktop.open(file);       //opens the specified file  
            }  
            catch(Exception ee){ ee.printStackTrace(); }                     
            }  
        }); frame.add(bton7);
            frame.setSize(fSize,fSize);  
            frame.setLayout(null);frame.setVisible(true);
    }
}