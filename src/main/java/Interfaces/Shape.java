package Interfaces;

import Interfaces.Color;

public abstract class Shape {

    protected Color color;
    protected Color getColor()
    {
        return color;
    }
    protected void setColor( Color color )
    {
        this.color = color;
    }
    abstract public void addColor();
    abstract public void draw();

}
