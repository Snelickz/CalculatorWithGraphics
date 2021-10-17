import javax.swing.*;
import java.awt.*;

public class NumberButtons {
    private static int x = 0;
    private static int y = 0;

    public static JButton[] createButtons() {
        JButton[] arrayOfButtons = new JButton[11];

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton decimal = new JButton(".");

        one.setBackground(Color.orange);
        one.setSize(new Dimension(100, 50));
        one.setLocation(x = x + 5, y = y + 5);

        two.setBackground(Color.orange);
        two.setSize(new Dimension(100, 50));
        two.setLocation(x = x + 105, y = y);

        three.setBackground(Color.orange);
        three.setSize(new Dimension(100, 50));
        three.setLocation(x = x + 105, y = y);

        four.setBackground(Color.orange);
        four.setSize(new Dimension(100, 50));
        four.setLocation(x = x - 210, y = y + 55);

        five.setBackground(Color.orange);
        five.setSize(new Dimension(100, 50));
        five.setLocation(x = x + 105, y = y);

        six.setBackground(Color.orange);
        six.setSize(new Dimension(100, 50));
        six.setLocation(x = x + 105, y = y);

        seven.setBackground(Color.orange);
        seven.setSize(new Dimension(100, 50));
        seven.setLocation(x = x - 210, y = y + 55);

        eight.setBackground(Color.orange);
        eight.setSize(new Dimension(100, 50));
        eight.setLocation(x = x + 105, y = y);

        nine.setBackground(Color.orange);
        nine.setSize(new Dimension(100, 50));
        nine.setLocation(x = x + 105, y = y);

        zero.setBackground(Color.orange);
        zero.setSize(new Dimension(100, 50));
        zero.setLocation(x = x - 210, y = y + 55);

        decimal.setBackground(Color.orange);
        decimal.setSize(new Dimension(100, 50));
        decimal.setLocation(x = x + 105, y = y);

        arrayOfButtons[0] = one;
        arrayOfButtons[1] = two;
        arrayOfButtons[2] = three;
        arrayOfButtons[3] = four;
        arrayOfButtons[4] = five;
        arrayOfButtons[5] = six;
        arrayOfButtons[6] = seven;
        arrayOfButtons[7] = eight;
        arrayOfButtons[8] = nine;
        arrayOfButtons[9] = zero;
        arrayOfButtons[10] = decimal;

        return arrayOfButtons;
    }
}