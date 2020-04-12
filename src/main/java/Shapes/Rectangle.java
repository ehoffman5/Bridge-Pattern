package Shapes;

import Interfaces.Shape;

public class Rectangle extends Shape {

    // assigns the selected color to the RECTANGLE shape
    public void assignColor()
    {
        System.out.print("Rectangle has been filled with the following color: ");
        color.chooseColor();
    }

}
