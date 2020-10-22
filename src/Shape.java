import java.awt.geom.Ellipse2D;

public abstract class Shape implements Drawable{
    protected float area = 0;
    protected float perimeter=0;
    abstract public void readShape();// To read the shape information from users
    abstract public void computeArea(); // To compute the shape’s area
    abstract public void computePerimeter(); // To computer the shape’s perimeter
    abstract public void displayShape(); // To display the area and perimeter of the shape
    abstract public void draw();//draws object
}
