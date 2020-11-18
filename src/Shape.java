//Seksembayev Kairat
//18078689D
//IntelliJ IDEA Community Edition 2020.1.3
public abstract class Shape implements Drawable {
    protected float area = 0;
    protected float perimeter = 0;

    public float getArea() {
        return area;
    }

    public float getPerimeter() {
        return perimeter;
    }
    public void initShape(){
        computeArea();
        computePerimeter();
        draw();
    }

    abstract public void readShape();// To read the shape information from users

    abstract public void computeArea(); // To compute the shape’s area

    abstract public void computePerimeter(); // To computer the shape’s perimeter

    abstract public void displayShape(); // To display the area and perimeter of the shape

    abstract public void draw();// draws object
}
