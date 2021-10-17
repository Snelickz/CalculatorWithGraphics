import javax.swing.*;
import java.awt.*;

public class LabelOutput {

    public static JLabel[] createLabel() {
        JLabel[] label = new JLabel[2];

        JLabel typing = new JLabel();
        JLabel output = new JLabel();

        typing.setBackground(Color.gray);
        typing.setOpaque(true);
        typing.setSize(new Dimension(300, 30));
        typing.setLocation(10, 230);
        typing.setHorizontalAlignment(SwingConstants.CENTER);

        output.setBackground(Color.gray);
        output.setOpaque(true);
        output.setSize(new Dimension(240, 30));
        output.setLocation(40, 270);
        output.setHorizontalAlignment(SwingConstants.CENTER);

        label[0] = typing;
        label[1] = output;

        return label;
    }
}
