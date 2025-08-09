package co.unicauca.figures;

import co.unicauca.figures.domain.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maryuri
 */
public class Figures {

    public static void main(String[] args) {
        Figure fig1 = new Circle(1);
        Figure fig2 = new Circle(2.5);
        Figure fig3 = new Square(4);
        Figure fig4 = new Square(5.6);
        Figure fig5 = new Triangle(4, 15, 10, 10);
        Figure fig6 = new Triangle(5.6, 13, 9.7, 15);
        
        //Arreglo polimorfico
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        figures.add(fig4);
        figures.add(fig5);
        figures.add(fig6);
        
        //recorremos e arreglo
        for(Figure fig: figures){
            System.out.println("El area es: " + fig.calculateArea());
            System.out.println("El perimetro es: " + fig.calculatePerimeter());
        }
   
    }
}
