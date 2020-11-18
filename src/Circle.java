//Seksembayev Kairat
//18078689D
//IntelliJ IDEA Community Edition 2020.1.3
import java.awt.geom.Ellipse2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {
        readShape();
        computeArea();
        computePerimeter();
        displayShape();
        draw();
    }

    @Override
    public void readShape() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input the radius:");
        try {
            radius = Float.parseFloat(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void computeArea() {
        area = (float) (Math.PI * radius * radius);
    }

    @Override
    public void computePerimeter() {
        perimeter = (float) (2 * Math.PI * radius);
    }

    @Override
    public void displayShape() {
        System.out.println("Area of circle = " + area);
        System.out.println("Perimeter of circle = " + perimeter);
    }

    @Override
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new Ellipse2D.Double(0, 0,
                2 * radius, 2 * radius));
    }
}
