package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maryuri
 */
public class TriangleTest {
    
    public TriangleTest() {
    }

    /**
     * Test of calculatePerimeter method, of class Triangle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Triangle instance = new Triangle(5, 15, 10, 10);
        double expResult = 5*15/2; //resultado esperado
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(5, 15, 10, 10);
        double expResult = 5+10+10; //resultado esperado
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }

}
