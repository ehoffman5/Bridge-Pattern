package Shapes;

import Interfaces.Shape;

public class Circle extends Shape {

    // assigns the selected color to the CIRCLE shape
    public void assignColor()
    {
        System.out.print("Circle has been filled with the following color: ");
        color.chooseColor();
    }

}
