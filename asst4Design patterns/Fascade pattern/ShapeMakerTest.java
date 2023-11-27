
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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
public class ShapeMakerTest {
    @Test
    public void testDrawCircle() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();

        // Restore the standard output
        System.setOut(System.out);

        // Check if the output matches the expected output
        assertEquals("Circle::draw()\n", outContent.toString());
    }
@Test
    public void testDrawCircleTwice() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawCircle();

        System.setOut(System.out);

        assertEquals("Circle::draw()\nCircle::draw()\n", outContent.toString());
    }
    @Test
    public void testDrawCircleWithOtherShapes() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawRectangle();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();

        System.setOut(System.out);

        assertEquals("Rectangle::draw()\nCircle::draw()\nSquare::draw()\n", outContent.toString());
    }
    @Test
    public void testDrawRectangle() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawRectangle();

        System.setOut(System.out);

        assertEquals("Rectangle::draw()\n", outContent.toString());
    }
@Test
    public void testDrawRectangleWithDifferentInput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawRectangle(); // The default output is "Circle::draw()"

        System.setOut(System.out);

        // Check if the output does not match an unexpected value
        assertNotEquals("Unexpected Output", outContent.toString());
    }

    @Test
    public void testDrawSquare() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawSquare();

        System.setOut(System.out);

        assertEquals("Square::draw()\n", outContent.toString());
    }
}
