import java.util.ArrayList;

public class Picture {
    ArrayList<Shape> shapes;

    public Picture() {
        shapes = new ArrayList<Shape>(100);
    }

    public void addShape(Shape s) {
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
