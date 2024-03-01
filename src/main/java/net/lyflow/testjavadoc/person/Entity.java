package net.lyflow.testjavadoc.person;



/**
 * The {@code Entity} class represents an abstract entity in a 2D space.
 * This class provides basic functionality for managing entities, such as
 * retrieving the ID and name, as well as describing the entity.
 */
public abstract class Entity {

    /**
     * The unique identifier for the entity.
     */
    protected final int id;

    /**
     * The name of the entity.
     */
    protected final String name;

    /**
     * The x-coordinate of the entity in the 2D space.
     */
    protected double x;

    /**
     * The y-coordinate of the entity in the 2D space.
     */
    protected double y;

    /**
     * Constructs a new {@code Entity} with the specified ID and name.
     * The initial position of the entity is set to (0.0, 0.0).
     *
     * @param id the unique identifier for the entity
     * @param name the name of the entity
     */
    protected Entity(int id, String name) {
        this.id = id;
        this.name = name;
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * Retrieves the ID of the entity.
     *
     * @return the ID of the entity
     */
    public int getId() {
        return id;
    }

    /**
     * Retrieves the name of the entity.
     *
     * @return the name of the entity
     */
    public String getName() {
        return name;
    }

    /**
     * Describes the entity.
     * Subclasses should implement this method to provide specific
     * descriptions for different types of entities.
     */
    public abstract void describe();
}

