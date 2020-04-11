package Shapes;

import Interfaces.Shape;

public class Triangle extends Shape {

    public void addColor()
    {
        System.out.print("Triangle has been filled with the following color: ");
        color.showColor();
    }

}
