import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Frame extends JFrame {
    private JButton getResultButton = new JButton("Get Results");
    private JTextField choice = new JTextField(10);
    private JTextField radius = new JTextField(10);
    private JTextField length = new JTextField(10);
    private JTextField width = new JTextField(10);
    private JTextField area = new JTextField(10);
    private JTextField perimeter = new JTextField(10);
    private List<JTextField> list = new ArrayList<>(10);
    public Frame(){
        area.setEditable(false);
        perimeter.setEditable(false);
        list.add(choice);
        list.add(radius);
        list.add(length);
        list.add(width);

        setLayout(new GridLayout(7,2,2,2));
        add(new JLabel("Choose shape \'s\',\'r\' or \'c\'"));
        add(choice);
        add(new JLabel("Input radius of circle"));
        add(radius);
        add(new JLabel("Input length of square or rectangle"));
        add(length);
        add(new JLabel("Input width of rectangle"));
        add(width);
        add(new JLabel("Area:"));
        add(area);
        add(new JLabel("Perimeter:"));
        add(perimeter);
        add(getResultButton);

        getResultButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (choice.getText().charAt(0))
                {
                    case's':
                        Square s = new Square(Integer.parseInt(length.getText()));
                        s.initShape();
                        area.setText(String.valueOf(s.getArea()));
                        perimeter.setText(String.valueOf(s.getPerimeter()));

                        break;
                    case'r':
                        Rectangle r = new Rectangle(Integer.parseInt(length.getText()),Integer.parseInt(width.getText()));
                        r.initShape();
                        area.setText(String.valueOf(r.getArea()));
                        perimeter.setText(String.valueOf(r.getPerimeter()));
                        break;
                    case'c':
                        Circle c = new Circle(Integer.parseInt(radius.getText()));
                        c.initShape();
                        area.setText(String.valueOf(c.getArea()));
                        perimeter.setText(String.valueOf(c.getPerimeter()));
                        break;
                    default:
                        break;
                }
                eraseScreenContent();
            }
        });
    }
    public void eraseScreenContent(){
        for(JTextField entry:list)
        {
            entry.setText("");
        }
    }

}
