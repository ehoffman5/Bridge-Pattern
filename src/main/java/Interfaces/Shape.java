package Interfaces;

import Interfaces.Color;

public abstract class Shape {

    public Color color;
    public Color getColor()
    {
        return color;
    }
    public void setColor( Color color )
    {
        this.color = color;
    }
    abstract public void addColor();

}
