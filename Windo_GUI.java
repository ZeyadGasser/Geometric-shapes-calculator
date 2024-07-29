package com.mycompany.geometric_obj;

import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;
import javax.swing.*;

public class Window extends JFrame implements ActionListener {

    public void removeAreaAndPerimeterLabels() {
        panel.remove(areaLabel);
        panel.remove(areaValueLabel);
        panel.remove(perimeterLabel);
        panel.remove(perimeterValueLabel);
    }

    public void addAreaAndPerimeterLabels() {
        panel.add(areaLabel);
        panel.add(areaValueLabel);
        panel.add(perimeterLabel);
        panel.add(perimeterValueLabel);
    }

    public void boundsForClearAndCheckboxs() {
        clear.setBounds(500, 250, 180, 40);
        clear.setBackground(new Color(128, 0, 128));
        clear.setForeground(Color.yellow);
        areaCheckBox.setBounds(350, 200, 80, 40);
        areaCheckBox.setBackground(new Color(48, 213, 200));
        areaCheckBox.setForeground(Color.blue);
        perimeterCheckBox.setBounds(450, 200, 100, 40);
        perimeterCheckBox.setBackground(new Color(48, 213, 200));
        perimeterCheckBox.setForeground(Color.blue);
    }

    public void boundsForAreaAndPerimeter() {
        areaLabel.setBounds(180, 350, 200, 25);
        areaLabel.setFont(new Font("BOLD", Font.BOLD, 25));
        perimeterLabel.setBounds(180, 450, 200, 25);
        perimeterLabel.setFont(new Font("BOLD", Font.BOLD, 25));
        areaValueLabel.setBounds(270, 350, 200, 25);
        areaValueLabel.setFont(new Font("BOLD", Font.BOLD, 25));
        perimeterValueLabel.setBounds(330, 450, 200, 25);
        perimeterValueLabel.setFont(new Font("BOLD", Font.BOLD, 25));
    }

    Rectangle rectangle1 = new Rectangle();
    Circle circle1 = new Circle();
    Square square1 = new Square();

    String[] Shapes = {".............", "Rectangle", "Circle", "Square"};

    JButton calculateAndDisplayForRectangle, calculateAndDisplayForCircle, calculateAndDisplayForSquare, clear;
    JTextField widthTextField, heightTextField, radiusTextField, sideTextField;
    JLabel chooseShapeLabel, widthLabel, heightLabel, radiusLabel, sideLabel;
    JLabel exception_Label;
    JLabel areaLabel, areaValueLabel, perimeterLabel, perimeterValueLabel;
    JComboBox combobox;
    JCheckBox areaCheckBox, perimeterCheckBox;
    JPanel panel;

    public Window() {

        // Declaring vars
        calculateAndDisplayForRectangle = new JButton("Calculate and Display");
        calculateAndDisplayForCircle = new JButton("Calculate and Display");
        calculateAndDisplayForSquare = new JButton("Calculate and Display");
        clear = new JButton("Clear");

        widthTextField = new JTextField();
        heightTextField = new JTextField();
        radiusTextField = new JTextField();
        sideTextField = new JTextField();

        chooseShapeLabel = new JLabel("Choose the shape :");
        widthLabel = new JLabel("Enter width :");
        heightLabel = new JLabel("Enter height :");
        radiusLabel = new JLabel("Enter radius :");
        sideLabel = new JLabel("Enter side :");

        areaLabel = new JLabel("Area = ");
        perimeterLabel = new JLabel("Perimeter = ");
        areaValueLabel = new JLabel();
        perimeterValueLabel = new JLabel();

        exception_Label = new JLabel("Please Enter a valid value");

        combobox = new JComboBox(Shapes);

        panel = new JPanel();

        areaCheckBox = new JCheckBox("Area");
        perimeterCheckBox = new JCheckBox("Perimeter");

        this.setTitle("Geometric Calculations");
        this.setSize(900, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocation(510, 220);
        this.add(panel);
        panel.setLayout(null);
        panel.setBackground(new Color(255, 213, 154));

        chooseShapeLabel.setBounds(200, 58, 200, 25);
        chooseShapeLabel.setFont(new Font("ITALIC", Font.ITALIC, 22));
        combobox.setBounds(400, 60, 200, 25);

        panel.add(chooseShapeLabel);
        panel.add(combobox);
        panel.add(clear);
        /**
         * ***************************************************************************
         */
        calculateAndDisplayForRectangle.addActionListener(this);
        calculateAndDisplayForCircle.addActionListener(this);
        calculateAndDisplayForSquare.addActionListener(this);
        clear.addActionListener(this);
        combobox.addActionListener(this);
        /**
         * ***************************************************************************
         */
        widthTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && (c != '-') && (c != '.')) {
                    e.consume();
                }
            }
        });
        heightTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && (c != '-') && (c != '.')) {
                    e.consume();
                }
            }
        });
        radiusTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && (c != '-') && (c != '.')) {
                    e.consume();
                }
            }
        });
        sideTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && (c != '-') && (c != '.')) {
                    e.consume();
                }
            }
        });

    }

    /**
     * *********************************************************************
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == combobox) {
            if (combobox.getSelectedItem() == "Rectangle") {
                panel.remove(exception_Label);

                removeAreaAndPerimeterLabels();

                panel.remove(calculateAndDisplayForCircle);
                panel.remove(calculateAndDisplayForSquare);

                panel.remove(radiusTextField);
                panel.remove(sideTextField);
                panel.remove(radiusLabel);
                panel.remove(sideLabel);

                panel.add(widthLabel);
                panel.add(widthTextField);
                panel.add(heightLabel);
                panel.add(heightTextField);
                panel.add(calculateAndDisplayForRectangle);
                panel.add(areaCheckBox);
                panel.add(perimeterCheckBox);

                widthTextField.setBounds(340, 110, 220, 25);
                heightTextField.setBounds(340, 160, 220, 25);
                widthLabel.setBounds(220, 110, 150, 25);
                widthLabel.setFont(new Font("ITALIC", Font.ITALIC, 18));
                heightLabel.setBounds(220, 160, 150, 25);
                heightLabel.setFont(new Font("ITALIC", Font.ITALIC, 18));
                calculateAndDisplayForRectangle.setBounds(250, 250, 180, 40);
                calculateAndDisplayForRectangle.setBackground(new Color(128, 0, 128));
                calculateAndDisplayForRectangle.setForeground(Color.yellow);
                boundsForClearAndCheckboxs();
                /**
                 * ***************************************************************************
                 */
            } else if (combobox.getSelectedItem() == "Circle") {
                panel.remove(exception_Label);

                removeAreaAndPerimeterLabels();
                //  radiusTextField.setText("");

                panel.remove(calculateAndDisplayForRectangle);
                panel.remove(calculateAndDisplayForSquare);

                panel.remove(widthTextField);
                panel.remove(heightTextField);
                panel.remove(sideTextField);
                panel.remove(widthLabel);
                panel.remove(heightLabel);
                panel.remove(sideLabel);

                panel.add(radiusLabel);
                panel.add(radiusTextField);
                panel.add(calculateAndDisplayForCircle);
                panel.add(areaCheckBox);
                panel.add(perimeterCheckBox);

                radiusTextField.setBounds(340, 110, 220, 25);
                radiusLabel.setBounds(220, 110, 110, 25);
                radiusLabel.setFont(new Font("ITALIC", Font.ITALIC, 18));
                calculateAndDisplayForCircle.setBounds(250, 250, 180, 40);
                calculateAndDisplayForCircle.setBackground(new Color(128, 0, 128));
                calculateAndDisplayForCircle.setForeground(Color.yellow);
                boundsForClearAndCheckboxs();
                /**
                 * *************************************************************************
                 */
            } else if (combobox.getSelectedItem() == "Square") {
                panel.remove(exception_Label);
                removeAreaAndPerimeterLabels();

                panel.remove(calculateAndDisplayForRectangle);
                panel.remove(calculateAndDisplayForCircle);

                panel.remove(widthTextField);
                panel.remove(heightTextField);
                panel.remove(radiusTextField);
                panel.remove(widthLabel);
                panel.remove(heightLabel);
                panel.remove(radiusLabel);

                panel.add(sideLabel);
                panel.add(sideTextField);
                panel.add(calculateAndDisplayForSquare);
                panel.add(areaCheckBox);
                panel.add(perimeterCheckBox);

                sideTextField.setBounds(340, 110, 220, 25);
                sideLabel.setBounds(220, 110, 100, 25);
                sideLabel.setFont(new Font("ITALIC", Font.ITALIC, 18));
                calculateAndDisplayForSquare.setBounds(250, 250, 180, 40);
                calculateAndDisplayForSquare.setBackground(new Color(128, 0, 128));
                calculateAndDisplayForSquare.setForeground(Color.yellow);
                boundsForClearAndCheckboxs();

            }

        }
        /**
         * ************************************************************************
         */
        if (e.getSource() == calculateAndDisplayForRectangle) {

            if (areaCheckBox.isSelected() && perimeterCheckBox.isSelected()) {

                removeAreaAndPerimeterLabels();

                rectangle1.setWidth(Double.valueOf(widthTextField.getText()));
                rectangle1.setHeight(Double.valueOf(heightTextField.getText()));

                rectangle1.getArea(rectangle1.getWidth(), rectangle1.getHeight());

                rectangle1.getPerimeter(rectangle1.getWidth(), rectangle1.getHeight());
                double number = rectangle1.getArea(rectangle1.getWidth(), rectangle1.getHeight());
                try {
                    if (number >= 0) {
                        String sarearectangle = String.valueOf(rectangle1.getArea(rectangle1.getWidth(), rectangle1.getHeight()));
                        areaValueLabel = new JLabel(sarearectangle);

                        String sperimeterrectangle = String.valueOf(rectangle1.getPerimeter(rectangle1.getWidth(), rectangle1.getHeight()));
                        perimeterValueLabel = new JLabel(sperimeterrectangle);

                        addAreaAndPerimeterLabels();
                        boundsForAreaAndPerimeter();

                    } else {
                        throw new InputMismatchException();
                    }
                } catch (InputMismatchException ex) {
                    exception_Label = new JLabel("Please Enter a valid value");
                    panel.add(exception_Label);
                    exception_Label.setFont(new Font("BOLD", Font.PLAIN, 20));
                    exception_Label.setForeground(Color.red);
                    exception_Label.setBounds(600, 130, 240, 40);

                }

                /**
                 * *******************************************************************
                 *
                 *
                 *
                 *
                 *
                 * /**
                 * *******************************************************************
                 */
            } else if (areaCheckBox.isSelected()) {

                removeAreaAndPerimeterLabels();

                rectangle1.setWidth(Double.valueOf(widthTextField.getText()));
                rectangle1.setHeight(Double.valueOf(heightTextField.getText()));
                rectangle1.getArea(rectangle1.getWidth(), rectangle1.getHeight());

                double number = rectangle1.getArea(rectangle1.getWidth(), rectangle1.getHeight());
                try {
                    if (number >= 0) {
                        String sarearectangle = String.valueOf(rectangle1.getArea(rectangle1.getWidth(), rectangle1.getHeight()));
                        areaValueLabel = new JLabel(sarearectangle);

                        panel.add(areaLabel);
                        panel.add(areaValueLabel);

                        boundsForAreaAndPerimeter();

                    } else {
                        throw new InputMismatchException();
                    }
                } catch (InputMismatchException ex) {
                    exception_Label = new JLabel("Please Enter a valid value");
                    panel.add(exception_Label);
                    exception_Label.setFont(new Font("BOLD", Font.PLAIN, 20));
                    exception_Label.setForeground(Color.red);
                    exception_Label.setBounds(600, 130, 240, 40);

                }

                /**
                 * *******************************************************************
                 *
                 * /**
                 * *******************************************************************
                 */
            } else if (perimeterCheckBox.isSelected()) {

                removeAreaAndPerimeterLabels();

                rectangle1.setWidth(Double.valueOf(widthTextField.getText()));
                rectangle1.setHeight(Double.valueOf(heightTextField.getText()));

                double number = rectangle1.getPerimeter(rectangle1.getWidth(), rectangle1.getHeight());
                try {
                    if (number >= 0) {
                        String sperimeterrectangle = String.valueOf(rectangle1.getPerimeter(rectangle1.getWidth(), rectangle1.getHeight()));
                        perimeterValueLabel = new JLabel(sperimeterrectangle);

                        panel.add(perimeterLabel);
                        panel.add(perimeterValueLabel);
                        boundsForAreaAndPerimeter();

                    } else {
                        throw new InputMismatchException();
                    }
                } catch (InputMismatchException ex) {
                    exception_Label = new JLabel("Please Enter a valid value");
                    panel.add(exception_Label);
                    exception_Label.setFont(new Font("BOLD", Font.PLAIN, 20));

                    exception_Label.setForeground(Color.red);
                    exception_Label.setBounds(600, 130, 240, 40);

                }

            }

        }
        /**
         * *******************************************************************
         */
        if (e.getSource() == calculateAndDisplayForCircle) {

            if (areaCheckBox.isSelected() && perimeterCheckBox.isSelected()) {

                removeAreaAndPerimeterLabels();

                circle1.setRadius(Double.valueOf(radiusTextField.getText()));
                circle1.getArea(circle1.getRadius());

                circle1.getPerimeter(circle1.getRadius());

                double number = circle1.getPerimeter(circle1.getRadius());
                try {
                    if (number >= 0) {
                        String sareacircl = String.valueOf(circle1.getArea(circle1.getRadius()));
                        areaValueLabel = new JLabel(sareacircl);

                        String sperimetercircl = String.valueOf(circle1.getPerimeter(circle1.getRadius()));
                        perimeterValueLabel = new JLabel(sperimetercircl);
                        addAreaAndPerimeterLabels();

                    } else {
                        throw new InputMismatchException();
                    }
                } catch (InputMismatchException ex) {
                    exception_Label = new JLabel("Please Enter a valid value");
                    panel.add(exception_Label);
                    exception_Label.setForeground(Color.red);
                    exception_Label.setBounds(600, 110, 200, 25);

                }

                /**
                 * *******************************************************************
                 *
                 * /**
                 * *******************************************************************
                 */
            } else if (areaCheckBox.isSelected()) {

                removeAreaAndPerimeterLabels();

                circle1.setRadius(Double.valueOf(radiusTextField.getText()));
                circle1.getArea(circle1.getRadius());

                double number = circle1.getArea(circle1.getRadius());
                try {
                    if (number >= 0) {
                        String sareacircl = String.valueOf(circle1.getArea(circle1.getRadius()));
                        areaValueLabel = new JLabel(sareacircl);

                        panel.add(areaLabel);
                        panel.add(areaValueLabel);
                    } else {
                        throw new InputMismatchException();
                    }

                } catch (InputMismatchException ex) {
                    exception_Label = new JLabel("Please Enter a valid value");
                    panel.add(exception_Label);
                    exception_Label.setForeground(Color.red);
                    exception_Label.setBounds(600, 110, 200, 25);

                }

                /**
                 * *******************************************************************
                 *
                 * /**
                 * *******************************************************************
                 */
            } else if (perimeterCheckBox.isSelected()) {

                removeAreaAndPerimeterLabels();

                circle1.setRadius(Double.valueOf(radiusTextField.getText()));
                circle1.getPerimeter(circle1.getRadius());

                double number = circle1.getPerimeter(circle1.getRadius());

                try {
                    if (number >= 0) {
                        String sperimetercircl = String.valueOf(circle1.getPerimeter(circle1.getRadius()));
                        perimeterValueLabel = new JLabel(sperimetercircl);

                        panel.add(perimeterLabel);
                        panel.add(perimeterValueLabel);
                    } else {
                        throw new InputMismatchException();
                    }

                } catch (InputMismatchException ex) {
                    exception_Label = new JLabel("Please Enter a valid value");
                    panel.add(exception_Label);
                    exception_Label.setForeground(Color.red);
                    exception_Label.setBounds(600, 110, 200, 25);

                }

            }

            boundsForAreaAndPerimeter();

        }
        /**
         * *******************************************************************
         */
        if (e.getSource() == calculateAndDisplayForSquare) {

            if (areaCheckBox.isSelected() && perimeterCheckBox.isSelected()) {

                removeAreaAndPerimeterLabels();

                square1.setSide(Double.valueOf(sideTextField.getText()));
                square1.getArea(square1.getSide());

                square1.getPerimeter(square1.getSide());
                double number = square1.getPerimeter(square1.getSide());

                try {
                    if (number >= 0) {
                        String sareasquare = String.valueOf(square1.getArea(square1.getSide()));
                        areaValueLabel = new JLabel(sareasquare);

                        String sperimetersquare = String.valueOf(square1.getPerimeter(square1.getSide()));
                        perimeterValueLabel = new JLabel(sperimetersquare);
                        addAreaAndPerimeterLabels();
                    } else {
                        throw new InputMismatchException();
                    }
                } catch (InputMismatchException ex) {
                    exception_Label = new JLabel("Please Enter a valid value");
                    panel.add(exception_Label);
                    exception_Label.setForeground(Color.red);
                    exception_Label.setBounds(600, 110, 200, 25);

                }

                /**
                 * *******************************************************************
                 *
                 * /**
                 * *******************************************************************
                 */
            } else if (areaCheckBox.isSelected()) {

                removeAreaAndPerimeterLabels();

                square1.setSide(Double.valueOf(sideTextField.getText()));
                square1.getArea(square1.getSide());
                double number = square1.getArea(square1.getSide());
                try {
                    if (number >= 0) {
                        String sareasquare = String.valueOf(square1.getArea(square1.getSide()));
                        areaValueLabel = new JLabel(sareasquare);

                        panel.add(areaLabel);
                        panel.add(areaValueLabel);
                    } else {
                        throw new InputMismatchException();
                    }

                } catch (InputMismatchException ex) {
                    exception_Label = new JLabel("Please Enter a valid value");
                    panel.add(exception_Label);
                    exception_Label.setForeground(Color.red);
                    exception_Label.setBounds(600, 110, 200, 25);

                }

                /**
                 * *******************************************************************
                 *
                 * /**
                 * *******************************************************************
                 */
            } else if (perimeterCheckBox.isSelected()) {

                removeAreaAndPerimeterLabels();
                panel.remove(exception_Label);

                square1.setSide(Double.valueOf(sideTextField.getText()));
                square1.getPerimeter(square1.getSide());

                double number = square1.getPerimeter(square1.getSide());
                try {
                    if (number >= 0) {

                        String sperimetersquare = String.valueOf(square1.getPerimeter(square1.getSide()));
                        perimeterValueLabel = new JLabel(sperimetersquare);

                        panel.add(perimeterLabel);
                        panel.add(perimeterValueLabel);
                    } else {
                        throw new InputMismatchException();
                    }

                } catch (InputMismatchException ex) {
                    exception_Label = new JLabel("Please Enter a valid value");
                    panel.add(exception_Label);
                    exception_Label.setForeground(Color.red);
                    exception_Label.setBounds(600, 110, 200, 25);

                }

            }

            boundsForAreaAndPerimeter();

        }
        /**
         * *******************************************************************
         */
        if (e.getSource() == clear) {

            widthTextField.setText("");
            heightTextField.setText("");
            radiusTextField.setText("");
            sideTextField.setText("");
            panel.remove(exception_Label);
            combobox.setSelectedIndex(0);

            removeAreaAndPerimeterLabels();

        }

    }

}
/**
 * *******************************************************************
 */
