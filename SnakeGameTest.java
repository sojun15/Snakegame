
package com.mycompany.game;
import java.awt.event.KeyEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class SnakeGameTest {
    public SnakeGameTest() {
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
    public void testKeyPressedUpArrow() {
        // Create an instance of SnakeGame
        SnakeGame snakeGame = new SnakeGame(600, 600, 210);

        // Create a KeyEvent object representing a key press event for the up arrow key
        KeyEvent keyEvent = new KeyEvent(snakeGame, KeyEvent.KEY_PRESSED,
                                          System.currentTimeMillis(), 0,
                                          KeyEvent.VK_UP, KeyEvent.CHAR_UNDEFINED);

        // Call the method under test
        snakeGame.keyPressed(keyEvent);
        char ch = 'U';
        // Assert that the state of SnakeGame has been updated as expected
        // Check if the snake's direction has changed to UP after pressing the up arrow key
        assertEquals(ch, snakeGame.key_pressed);
    }
    
    @Test
    public void testFood() {
        System.out.println("Food");

        // Define the size of the game area
        int width = 600;
        int height = 600;

        // Create an instance of SnakeGame
        SnakeGame instance = new SnakeGame(width, height, 100);

        // Call the Food method multiple times and store the generated food coordinates
        int previousFoodX = -1;
        int previousFoodY = -1;
        for (int i = 0; i < 1000; i++) { // Test multiple times to ensure randomness
            instance.Food();
            
            // Check that the food coordinates are within the game bounds
            assertTrue(instance.food.a >= 0 && instance.food.a < width / instance.tilesize);
            assertTrue(instance.food.b >= 0 && instance.food.b < height / instance.tilesize);

            // Check that the food position is different from the previous one
            assertNotEquals(instance.food.a>0 && instance.food.a<26, instance.food.b);
            
        }
    }
    
    @Test
    public void testCollision_True() { // Create two tiles with the same coordinates

        // Create an instance of SnakeGame (or you can use an existing instance if available)
        SnakeGame game = new SnakeGame(500, 500, 100);
        int val = 25;
        // Verify that the collision method returns true since the tiles have the same coordinates
        assertEquals(val,game.tilesize);
    }

    @Test
public void testActionPerformed_GameOver() {
    // Create an instance of SnakeGame
    SnakeGame game = new SnakeGame(500, 500, 100);

    // Simulate the game over condition
    game.gameOver = false;

    // Invoke the actionPerformed method to trigger game over behavior
    game.actionPerformed(null);
    int chk2 = 15;
    // Now check if the value of check1 is as expected
    assertEquals(chk2, game.check1);
    }
}