
package com.mycompany.game;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FeatureTest {
    
    public FeatureTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testButton() {
        System.out.println("button");
        int x = 100;
        JButton bton = null;
        int hight = 0;
        int width = 0;
        Feature instance = new Feature(hight,width);
        assertEquals(x,instance.x);
    }

    @Test
    public void testControl_speed() {
        System.out.println("control_speed");
        int y = 250;
        JButton bton2 = null;
        int hight = 0;
        int width = 0;
        Feature instance = new Feature(hight,width);
        //System.out.println(instance.y);
        assertEquals(y,instance.y);
    }

    @Test
    public void testSaved_score() {
        System.out.println("saved_score");
        int z = 100;
        JButton bton7 = null;
        int hight = 0;
        int width = 0;
        Feature instance = new Feature(hight,width);
        assertEquals(z,instance.x);
    }

    @Test
    public void testExit() {
        System.out.println("exit");
        boolean bool = true;
        JButton bton6 = null;
        int hight = 0;
        int width = 0;
        Feature instance = new Feature(hight,width);
        assertEquals(bool,instance.exit);
    }

    @Test
    public void testFrame() {
        System.out.println("Frame");
        Color color = Color.GREEN;
        int hight = 0;
        int width = 0;
        Feature instance = new Feature(hight,width);
        assertEquals(color,instance.bk);
    }   
}
