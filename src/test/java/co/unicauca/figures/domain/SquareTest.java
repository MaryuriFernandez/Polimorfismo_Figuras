package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maryuri
 */
public class SquareTest {
    
    public SquareTest() {
    }

    /**
     * Test of calculatePerimeter method, of class Square.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Square instance = new Square(4);
        double expResult = 4*4; //resultado esperado
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Square instance = new Square(4);
        double expResult = 4*4; //resultado esperado
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
    
}
