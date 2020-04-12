package Shapes;

import Interfaces.Shape;

public class Triangle extends Shape {

    // assigns the selected color to the TRIANGLE shape
    public void assignColor()
    {
        System.out.print("Triangle has been filled with the following color: ");
        color.chooseColor();
    }

}
