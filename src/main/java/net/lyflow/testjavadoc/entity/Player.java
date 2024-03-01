package net.lyflow.testjavadoc.entity;

/**
 * The {@code Player} class represents a player entity in a 2D space.
 * This class extends the {@link Entity} class and implements the {@link Keyboardable} interface
 * to allow player interaction via keyboard inputs.
 */
public class Player extends Entity implements Keyboardable {

    /**
     * Constructs a new {@code Player} with the specified ID and name.
     *
     * @param id the unique identifier for the player
     * @param name the name of the player
     */
    public Player(int id, String name) {
        super(id, name);
    }

    /**
     * Describes the player by printing its name, ID, and position.
     * Overrides the {@code describe()} method defined in the {@code Entity} class.
     */
    @Override
    public void describe() {
        System.out.println("Hello, I'm " + name + "(" + id + ")!");
        System.out.println("My position is: " + x + ", " + y);
    }

    /**
     * Moves the player based on the keyboard input.
     * Overrides the {@code pressTouch()} method defined in the {@code Keyboardable} interface.
     *
     * @param reference the keyboard input reference
     */
    @Override
    public void pressTouch(int reference) {
        if (reference == 0) {
            x++;
            return;
        }

        if (reference == 1) {
            x--;
            return;
        }

        if (reference == 2) {
            y++;
            return;
        }

        if (reference == 3) {
            y--;
        }
    }
}

