//Seksembayev Kairat
//18078689D
//IntelliJ IDEA Community Edition 2020.1.3
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle extends Shape implements Drawable {
    private float length = 0;
    private float width = 0;

    @Override
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new Rectangle2D.Float(150, 0,length , width ));
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        readShape();
        computeArea();
        computePerimeter();
        displayShape();
        draw();
    }

    @Override
    public void readShape() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please input the length:");
            length = Float.parseFloat(reader.readLine());
            System.out.println("Please input the width:");
            width = Float.parseFloat(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void computeArea() {
        area =  (width * length);
    }

    @Override
    public void computePerimeter() {
        perimeter = (2 * (width + length));
    }

    @Override
    public void displayShape() {
        System.out.println("Area of rectangle = " + area);
        System.out.println("Perimeter of rectangle = " + perimeter);
    }
}
