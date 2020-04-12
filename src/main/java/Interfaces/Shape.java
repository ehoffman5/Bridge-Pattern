package Interfaces;

import Interfaces.Color;

public abstract class Shape {

    protected Color color;  // object of color
    public Color getColor()
    {
        return color;
    }  // getter method
    public void setColor( Color color )
    {
        this.color = color;
    }  // setter method
    abstract public void assignColor();

}
