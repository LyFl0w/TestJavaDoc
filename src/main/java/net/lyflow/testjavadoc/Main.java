package net.lyflow.testjavadoc;

import net.lyflow.testjavadoc.person.Player;
import java.util.Random;

/**
 * The {@code Main} class contains the main method to execute the program.
 */
public class Main {

    /**
     * The main method of the program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new player object with ID 1 and name "md5"
        final Player player = new Player(1, "md5");

        // Describing the player
        player.describe();

        // Creating a new random object for generating random keyboard inputs
        final Random random = new Random();

        // Infinite loop to continuously generate random keyboard inputs and update the player's position
        while (true) {
            // Generating a random keyboard input (0, 1, 2, or 3)
            int reference = random.nextInt(4);

            // Updating the player's position based on the generated keyboard input
            player.pressTouch(reference);

            // Describing the player with updated position
            player.describe();
        }
    }
}
