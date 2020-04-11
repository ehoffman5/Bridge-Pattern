package Shapes;

import Interfaces.Shape;

public class Rectangle extends Shape {

    public void addColor()
    {
        System.out.print("Rectangle has been filled with the following color: ");
        color.showColor();
    }

}
