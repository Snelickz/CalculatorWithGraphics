import javax.swing.*;
import java.awt.*;

public class OperationButtons {

    private static int x = 320;
    private static int y = 5;

    public static JButton[] createButtons() {
        JButton[] arrayOfButtons = new JButton[6];

        JButton add = new JButton("+");
        JButton subtract = new JButton("-");
        JButton divide = new JButton("/");
        JButton multiply = new JButton("x");
        JButton equals = new JButton("=");
        JButton clear = new JButton("c");

        add.setBackground(Color.PINK);
        add.setSize(new Dimension(100, 50));
        add.setLocation(x , y);

        subtract.setBackground(Color.PINK);
        subtract.setSize(new Dimension(100, 50));
        subtract.setLocation(x, y = y + 55);

        divide.setBackground(Color.PINK);
        divide.setSize(new Dimension(100, 50));
        divide.setLocation(x, y = y + 55);

        multiply.setBackground(Color.PINK);
        multiply.setSize(new Dimension(100, 50));
        multiply.setLocation(x, y = y + 55);

        equals.setBackground(Color.green);
        equals.setSize(new Dimension(100, 50));
        equals.setLocation(x, y = y + 55);

        clear.setBackground(Color.red);
        clear.setSize(new Dimension(100, 50));
        clear.setLocation(x, y = y + 55);

        arrayOfButtons[0] = add;
        arrayOfButtons[1] = subtract;
        arrayOfButtons[2] = divide;
        arrayOfButtons[3] = multiply;
        arrayOfButtons[4] = equals;
        arrayOfButtons[5] = clear;

        return arrayOfButtons;
    }
}
