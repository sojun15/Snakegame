
package com.mycompany.game;

import javax.swing.JButton;
import javax.swing.JFrame;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER
 */
public class SpeedTest {
    
    public SpeedTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    @org.junit.jupiter.api.Test
    public void testFrame() {
        System.out.println("Frame");
        JFrame frame = null;
        int hight = 0;
        int width = 0;
        Speed speed = new Speed(hight,width);
        assertEquals(hight,speed.hight);
    }

    @org.junit.jupiter.api.Test
    public void testHigh() {
        System.out.println("High");
        int y = 0;
        int time=200;
        JButton bton3 = null;
        int hight = 0;
        int width = 0;
        Speed instance = new Speed(hight,width);
        assertEquals(time,instance.htime);
    }

    @org.junit.jupiter.api.Test
    public void testMedium() {
        System.out.println("Medium");
        int y = 0;
        int time = 500;
        JButton bton4 = null;
        int hight = 0;
        int width = 0;
        Speed instance = new Speed(hight,width);
        assertEquals(time,instance.mtime);
    }

    @org.junit.jupiter.api.Test
    public void testLow() {
        System.out.println("Low");
        int time = 1000;
        int y = 0;
        JButton bton5 = null;
        int hight = 0;
        int width = 0;
        Speed instance = new Speed(hight,width);
        assertEquals(time,instance.ltime);
    }   
}
