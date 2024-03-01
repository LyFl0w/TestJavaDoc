package net.lyflow.testjavadoc;

import net.lyflow.testjavadoc.entity.Creeper;
import net.lyflow.testjavadoc.entity.Player;
import net.lyflow.testjavadoc.entity.Zombie;

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
        final Zombie zombie = new Zombie(2, "zombieee");
        final Creeper creeper = new Creeper(3, "creeeper");

        // Describing the player and the zombie
        player.describe();
        System.out.println();
        zombie.describe();
        System.out.println();
        creeper.describe();
        System.out.println();

        // Creating a new random object for generating random keyboard inputs
        final Random random = new Random();

        // Infinite loop to continuously generate random keyboard inputs and update the player's position
        int totalRef = 0;
        while (totalRef <= 20) {
            // Generating a random keyboard input (0, 1, 2, or 3)
            totalRef ++;
            final int reference = random.nextInt(4);

            // Updating the player's position based on the generated keyboard input
            player.pressTouch(reference);

            // Describing the player with updated position
            player.describe();
        }
    }
}
