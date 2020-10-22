import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square extends Shape implements Drawable {
    private float length = 0;

    @Override
    public void draw() {
        Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, "blue", new Rectangle2D.Float(0, 100, length, length));
    }

    public Square(float length) {
        this.length = length;
    }

    public Square() {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void computeArea() {
        area = (float) (length * length);
    }

    @Override
    public void computePerimeter() {
        perimeter = (float) (4 * length);
    }

    @Override
    public void displayShape() {
        System.out.println("Area of square = " + area);
        System.out.println("Perimeter of square = " + perimeter);
    }
}
