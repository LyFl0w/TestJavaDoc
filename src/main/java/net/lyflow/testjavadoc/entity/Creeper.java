package net.lyflow.testjavadoc.entity;

/**
 * The {@code Creeper} class represents a creeper entity in a 2D space.
 * This class extends the {@link Entity} class and provides functionality
 * for managing zombie entities, such as describing the zombie.
 */
public class Creeper extends Entity {

    /**
     * Constructs a new {@code Creeper} with the specified ID and name.
     *
     * @param id the unique identifier for the creeper
     * @param name the name of the creeper
     */
    public Creeper(int id, String name) {
        super(id, name);
    }

    /**
     * Describes the creeper by printing its name, ID, and position.
     * Overrides the {@code describe()} method defined in the {@code Entity} class.
     */
    @Override
    public void describe() {
        System.out.println("Hello, I'm " + name + "(" + id + ") creeper!");
        System.out.println("My position is: " + x + ", " + y);
    }

}
