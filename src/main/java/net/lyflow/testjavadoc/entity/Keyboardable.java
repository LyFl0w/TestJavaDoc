package net.lyflow.testjavadoc.entity;

/**
 * The {@code Keyboardable} interface represents an object that can respond to keyboard inputs.
 * Classes implementing this interface must define the behavior for handling keyboard touches.
 */
public interface Keyboardable {

    /**
     * Handles a keyboard touch event based on the given reference.
     *
     * @param reference the reference representing the keyboard touch event
     */
    void pressTouch(int reference);

}