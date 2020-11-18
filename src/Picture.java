//Seksembayev Kairat
//18078689D
//IntelliJ IDEA Community Edition 2020.1.3
import java.util.ArrayList;
import java.util.Iterator;

public class Picture {
    ArrayList<Shape> shapes;

    public Picture() {
        shapes = new ArrayList<Shape>(100);
    }

    void addShape(Shape s) {
        shapes.add(s);
    }

    void computeShape() {
        for (Shape entry : shapes) {
            entry.computePerimeter();
            entry.computeArea();
        }
    }

    public void listAllShapeTypes() {
        for (Shape entry : shapes) {
            entry.displayShape();
        }
    }

    public void listSingleShapeType(String className) {

        for (Shape entry : shapes) {
            if (entry.getClass().getSimpleName().equals(className))
                entry.displayShape();
        }
    }
}
