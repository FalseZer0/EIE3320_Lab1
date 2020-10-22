import java.io.IOException;
import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        while (true) {
            display();
            try {
                menu();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void display() {
        System.out.println("**************************************");
        System.out.println("* Please choose one the followings   *");
        System.out.println("* Press \'c\' - Circle                 *");
        System.out.println("* Press \'s\' - Square                 *");
        System.out.println("* Press \'r\' - Rectangle              *");
        System.out.println("* Press \'x\' - EXIT                   *");
        System.out.println("**************************************");
    }

    public static void menu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        char in = scanner.next().charAt(0);
        Shape s;
        switch (in) {
            case 'x':
                System.exit(1);
                break;
            case 'c':
                s = new Circle();
                break;
            case 's':
                s = new Square();
                break;
            case 'r':
                s = new Rectangle();
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}
