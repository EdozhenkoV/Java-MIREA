package mirea;

import mirea.Rectangle;
import mirea.Square;

public class Test {
    public static void main(String[] args) {
        Square x = new Square(10, "orange");
        Rectangle y = new Rectangle(5, 4, "blue");

        x.Perimeter();
        x.Area();
        y.Perimeter();
        y.Area();

        System.out.println(x);
        System.out.println(y);
    }
}
