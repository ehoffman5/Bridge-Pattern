package Shapes;

import Interfaces.Shape;

public class Circle extends Shape {

    public void addColor()
    {
        System.out.print("Circle has been filled with the following color: ");
        color.showColor();
    }

}
