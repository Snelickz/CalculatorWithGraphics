import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Objects;

public class Frame extends Canvas {
    ArrayList<Integer> internalValue1 = new ArrayList<Integer>();
    ArrayList<Integer> internalValue2 = new ArrayList<Integer>();
    boolean flag = true;
    String operation = "";
    long totalValue = 0;


    public Frame(int width, int height, String title, Main main) {
        JFrame frame = new JFrame();

        JButton[] arrayOfButtons = NumberButtons.createButtons();
        JButton[] arrayOfOperationButtons = OperationButtons.createButtons();
        JLabel[] labels = LabelOutput.createLabel();

        for (int i = 0; i < 6; i++) {
            frame.add(arrayOfOperationButtons[i]);
        }

        for (int i = 0; i < 2; i++) {
            frame.add(labels[i]);
        }

        for (int i = 0; i < 11; i++) {
            frame.add(arrayOfButtons[i]);
        }

        arrayOfOperationButtons[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String valueString1 = "";
                String valueString2 = "";
                long value1 = 0;
                long value2 = 0;

                for (int i = 0; i < internalValue1.size(); i++) {
                    valueString1 = valueString1 +(internalValue1.get(i));
                }
                value1 = Long.parseLong(valueString1);

                for (int i = 0; i < internalValue2.size(); i++) {
                    valueString2 = valueString2 +(internalValue2.get(i));
                }
                value2 = Long.parseLong(valueString2);

                if (Objects.equals(operation, "+")) {
                    totalValue = value1 + value2;
                    labels[0].setText(labels[0].getText() + "=");
                    labels[1].setText(String.valueOf((totalValue)));
                }
                else if (Objects.equals(operation, "-")) {
                    totalValue = value1 - value2;
                    labels[0].setText(labels[0].getText() + "=");
                    labels[1].setText(String.valueOf((totalValue)));
                }
                else if (Objects.equals(operation, "/")) {
                    double divideTotalValue = totalValue;
                    divideTotalValue = Double.parseDouble(String.valueOf(value1)) / Double.parseDouble(String.valueOf(value2));
                    labels[0].setText(labels[0].getText() + "=");
                    labels[1].setText(String.valueOf((divideTotalValue)));

                }
                else if (Objects.equals(operation, "X")) {
                    totalValue = value1 * value2;
                    labels[0].setText(labels[0].getText() + "=");
                    labels[1].setText(String.valueOf((totalValue)));
                }
            }
        });

        arrayOfOperationButtons[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText("");
                labels[1].setText("");
                internalValue1.clear();
                internalValue2.clear();
                flag = true;
                operation = "";
                totalValue = 0;
            }
        });

        arrayOfOperationButtons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + "+");
                flag = false;
                operation = "+";
            }
        });

        arrayOfOperationButtons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + "-");
                flag = false;
                operation = "-";
            }
        });

        arrayOfOperationButtons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + "/");
                flag = false;
                operation = "/";
            }
        });

        arrayOfOperationButtons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + "x");
                flag = false;
                operation = "X";
            }
        });

        arrayOfButtons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + 1);
                if (flag)
                    internalValue1.add(1);
                else
                    internalValue2.add(1);

            }
        });

        arrayOfButtons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + 2);
                if (flag)
                    internalValue1.add(2);
                else
                    internalValue2.add(2);

            }
        });

        arrayOfButtons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + 3);
                if (flag)
                    internalValue1.add(3);
                else
                    internalValue2.add(3);

            }
        });

        arrayOfButtons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + 4);
                if (flag)
                    internalValue1.add(4);
                else
                    internalValue2.add(4);

            }
        });

        arrayOfButtons[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + 5);
                if (flag)
                    internalValue1.add(5);
                else
                    internalValue2.add(5);

            }
        });

        arrayOfButtons[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + 6);
                if (flag)
                    internalValue1.add(6);
                else
                    internalValue2.add(6);

            }
        });

        arrayOfButtons[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + 7);
                if (flag)
                    internalValue1.add(7);
                else
                    internalValue2.add(7);

            }
        });

        arrayOfButtons[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + 8);
                if (flag)
                    internalValue1.add(8);
                else
                    internalValue2.add(8);

            }
        });

        arrayOfButtons[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + 9);
                if (flag)
                    internalValue1.add(9);
                else
                    internalValue2.add(9);

            }
        });

        arrayOfButtons[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labels[0].setText(labels[0].getText() + 0);
                if (flag)
                    internalValue1.add(0);
                else
                    internalValue2.add(0);

            }
        });

        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(title);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(main);

        frame.setVisible(true);
        main.start();


    }
}
