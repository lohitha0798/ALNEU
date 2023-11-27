
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lohitha Atluri
 */
public class ShapeFactoryTest {
   @Test
    public void testGetCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        assertEquals("Inside Circle:draw() method.\n", getDrawOutput(shape));
    }

    @Test
    public void testGetRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("RECTANGLE");
        assertEquals("Inside Rectangle::draw() method.\n", getDrawOutput(shape));
    }

    @Test
    public void testGetSquare() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("SQUARE");
        assertEquals("Inside Square::draw() method.\n", getDrawOutput(shape));
    }

    @Test
    public void testGetInvalidShape() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("INVALID_SHAPE");
        assertNull(shape); // Expecting null for an invalid shape
    }

    @Test
    public void testGetCircleMultipleTimes() {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Getting the circle instance twice
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Shape shape2 = shapeFactory.getShape("CIRCLE");

        // Ensuring both instances are not the same object
        assertNotSame(shape1, shape2);

        // Verifying the draw output for each instance
        assertEquals("Inside Circle:draw() method.\n", getDrawOutput(shape1));
        assertEquals("Inside Circle:draw() method.\n", getDrawOutput(shape2));
    }

    @Test
    public void testGetDifferentShapes() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape square = shapeFactory.getShape("SQUARE");

        // Verifying the draw output for each shape
        assertEquals("Inside Rectangle::draw() method.\n", getDrawOutput(rectangle));
        assertEquals("Inside Square::draw() method.\n", getDrawOutput(square));
    }

    @Test
    public void testGetShapesWithNullInput() {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Getting shapes with null input
        Shape nullShape1 = shapeFactory.getShape(null);
        Shape nullShape2 = shapeFactory.getShape(null);

        // Ensuring both instances are not the same object
        assertNotSame(nullShape1, nullShape2);

        // Verifying that null shapes are returned
        assertNull(nullShape1);
        assertNull(nullShape2);
    }

    private String getDrawOutput(Shape shape) {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        shape.draw();

        // Restore the standard output
        System.setOut(System.out);

        return outContent.toString();
    }
}
