package net.lyflow.testjavadoc.person;

/**
 * The {@code Zombie} class represents a zombie entity in a 2D space.
 * This class extends the {@link Entity} class and provides functionality
 * for managing zombie entities, such as describing the zombie.
 */
public class Zombie extends Entity {

    /**
     * Constructs a new {@code Zombie} with the specified ID and name.
     *
     * @param id the unique identifier for the zombie
     * @param name the name of the zombie
     */
    public Zombie(int id, String name) {
        super(id, name);
    }

    /**
     * Describes the zombie by printing its name, ID, and position.
     * Overrides the {@code describe()} method defined in the {@code Entity} class.
     */
    @Override
    public void describe() {
        System.out.println("Hello, I'm " + name + "(" + id + ") zombie!");
        System.out.println("My position is: " + x + ", " + y);
    }

}
