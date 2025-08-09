package co.unicauca.figures.domain;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ING-SIS
 */
public class CircleTest {
    
    public CircleTest() {
    }

    /**
     * Test of calculatePerimeter method, of class Circle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        Circle instance = new Circle(1);
        double expResult = Math.PI*2;
        double result = instance.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of calculateArea method, of class Circle.
     */
    @org.junit.jupiter.api.Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Circle instance = new Circle(1);
        double expResult = Math.PI;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.01);
    }

}
