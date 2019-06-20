/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test public void should_get_perimeter() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(12, rectangle.getPerimeter(), 0.0);
    }

    @Test public void should_get_area() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(8, rectangle.getArea(), 0.0);
    }
}
