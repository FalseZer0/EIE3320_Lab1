//Seksembayev Kairat
//18078689D
//IntelliJ IDEA Community Edition 2020.1.3
import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {

        while (true) {
            initGUI();
            display();
            try {
                selectShape();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void initGUI(){
        JFrame frame = new Frame();
        frame.setTitle("GUI lab1");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setVisible(true);
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

    public static void selectShape() throws IOException {
        Scanner scanner = new Scanner(System.in);
        char in = scanner.next().charAt(0);
        switch (in) {
            case 'x':
                System.exit(1);
                break;
            case 'c':
                new Circle();
                break;
            case 's':
                new Square();
                break;
            case 'r':
                new Rectangle();
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}
