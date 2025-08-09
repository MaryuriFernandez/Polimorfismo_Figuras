package co.unicauca.figures.domain;

/**
 *
 * @author maryuri
 */
public class Triangle implements Figure{
    private double base;
    private double altura;
    private double lado2;
    private double lado3;

    public Triangle(double base, double altura, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    
    @Override
    public double calculatePerimeter() {
        return base*altura/2;
    }

    @Override
    public double calculateArea() {
        return base+lado2+lado3;
    }
    
}
