import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Calculator implements ActionListener {

    ArrayList data = new ArrayList();
    ArrayList dataCopy = new ArrayList();
    boolean plus = true;
    boolean minus = true;
    boolean star = true;
    boolean slash = true;
    boolean useAnswer = false;
    boolean repeat1 = false;
    boolean repeat2 = false;
    boolean repeat3 = false;
    boolean repeat4 = false;
    boolean firstNumber = false;
    boolean secondNumber = false;


    Frame f = new Frame();

    TextField t1 = new TextField();

    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button b0 = new Button("0");

    Button decimal = new Button(".");

    Button addition = new Button("+");
    Button subtraction = new Button("-");
    Button multiplication = new Button("*");
    Button division = new Button("/");

    Button enter = new Button("=");
    Button clear = new Button("Clear");

    Button exit = new Button("Exit");

    Calculator() {

        t1.setBounds(50, 50, 150, 20);

        b1.setBounds(50, 100, 50, 40);
        b4.setBounds(50, 140, 50, 40);
        b7.setBounds(50, 180, 50, 40);
        b2.setBounds(100, 100, 50, 40);
        b5.setBounds(100, 140, 50, 40);
        b8.setBounds(100, 180, 50, 40);
        b3.setBounds(150, 100, 50, 40);
        b6.setBounds(150, 140, 50, 40);
        b9.setBounds(150, 180, 50, 40);

        b0.setBounds(100, 220, 50, 40);
        decimal.setBounds(100, 300, 50, 40);

        addition.setBounds(50, 260, 50, 40);
        subtraction.setBounds(100, 260, 50, 40);
        multiplication.setBounds(150, 260, 50, 40);
        division.setBounds(50, 300, 50, 40);

        enter.setBounds(150, 220, 50, 40);
        clear.setBounds(50, 220, 50, 40);

        exit.setBounds(150, 300, 50, 40);

        f.add(t1);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);

        f.add(decimal);

        f.add(addition);
        f.add(subtraction);
        f.add(multiplication);
        f.add(division);

        f.add(enter);
        f.add(clear);

        f.add(exit);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        decimal.addActionListener(this);
        addition.addActionListener(this);
        subtraction.addActionListener(this);
        multiplication.addActionListener(this);
        division.addActionListener(this);
        enter.addActionListener(this);
        clear.addActionListener(this);
        exit.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(250, 350);
    }

    public void actionPerformed(ActionEvent event) {

        data.add("");
        data.add("");
        data.add(0);

        if (event.getSource() == b1) {
            useAnswer = false;
            if (!firstNumber) {
                t1.setText(String.valueOf(1));
                data.set(0, t1.getText());
                firstNumber = true;
            } else if (firstNumber && !secondNumber) {
                String stringInput = (String) data.get(0);
                String newString = stringInput + "1";
                t1.setText(newString);
                data.set(0, newString);
            } else if (secondNumber) {
                try {
                    String stringInput = (String) data.get(1);
                    String newString = stringInput + "1";
                    t1.setText(newString);
                    data.set(1, newString);
                } catch (IndexOutOfBoundsException oob) {
                    t1.setText("Syntax Error: Press Clear");
                }
            }
        } else if (event.getSource() == b2) {
            useAnswer = false;
            if (!firstNumber) {
                t1.setText(String.valueOf(2));
                data.set(0, t1.getText());
                firstNumber = true;
            } else if (firstNumber && !secondNumber) {
                String stringInput = (String) data.get(0);
                String newString = stringInput + "2";
                t1.setText(newString);
                data.set(0, newString);
            } else if (secondNumber) {
                try {
                    String stringInput = (String) data.get(1);
                    String newString = stringInput + "2";
                    t1.setText(newString);
                    data.set(1, newString);
                } catch (IndexOutOfBoundsException oob) {
                    t1.setText("Syntax Error: Press Clear");
                }
            }
        } else if (event.getSource() == b3) {
            useAnswer = false;
            if (!firstNumber) {
                t1.setText(String.valueOf(3));
                data.set(0, t1.getText());
                firstNumber = true;
            } else if (firstNumber && !secondNumber) {
                String stringInput = (String) data.get(0);
                String newString = stringInput + "3";
                t1.setText(newString);
                data.set(0, newString);
            } else if (secondNumber) {
                try {
                    String stringInput = (String) data.get(1);
                    String newString = stringInput + "3";
                    t1.setText(newString);
                    data.set(1, newString);
                } catch (IndexOutOfBoundsException oob) {
                    t1.setText("Syntax Error: Press Clear");
                }
            }
        } else if (event.getSource() == b4) {
            useAnswer = false;
            if (!firstNumber) {
                t1.setText(String.valueOf(4));
                data.set(0, t1.getText());
                firstNumber = true;
            } else if (firstNumber && !secondNumber) {
                String stringInput = (String) data.get(0);
                String newString = stringInput + "4";
                t1.setText(newString);
                data.set(0, newString);
            } else if (secondNumber) {
                try {
                    String stringInput = (String) data.get(1);
                    String newString = stringInput + "4";
                    t1.setText(newString);
                    data.set(1, newString);
                } catch (IndexOutOfBoundsException oob) {
                    t1.setText("Syntax Error: Press Clear");
                }
            }
        } else if (event.getSource() == b5) {
            useAnswer = false;
            if (!firstNumber) {
                t1.setText(String.valueOf(5));
                data.set(0, t1.getText());
                firstNumber = true;
            } else if (firstNumber && !secondNumber) {
                String stringInput = (String) data.get(0);
                String newString = stringInput + "5";
                t1.setText(newString);
                data.set(0, newString);
            } else if (secondNumber) {
                try {
                    String stringInput = (String) data.get(1);
                    String newString = stringInput + "5";
                    t1.setText(newString);
                    data.set(1, newString);
                } catch (IndexOutOfBoundsException oob) {
                    t1.setText("Syntax Error: Press Clear");
                }
            }
        } else if (event.getSource() == b6) {
            useAnswer = false;
            if (!firstNumber) {
                t1.setText(String.valueOf(6));
                data.set(0, t1.getText());
                firstNumber = true;
            } else if (firstNumber && !secondNumber) {
                String stringInput = (String) data.get(0);
                String newString = stringInput + "6";
                t1.setText(newString);
                data.set(0, newString);
            } else if (secondNumber) {
                try {
                    String stringInput = (String) data.get(1);
                    String newString = stringInput + "6";
                    t1.setText(newString);
                    data.set(1, newString);
                } catch (IndexOutOfBoundsException oob) {
                    t1.setText("Syntax Error: Press Clear");
                }
            }
        } else if (event.getSource() == b7) {
            useAnswer = false;
            if (!firstNumber) {
                t1.setText(String.valueOf(7));
                data.set(0, t1.getText());
                firstNumber = true;
            } else if (firstNumber && !secondNumber) {
                String stringInput = (String) data.get(0);
                String newString = stringInput + "7";
                t1.setText(newString);
                data.set(0, newString);
            } else if (secondNumber) {
                try {
                    String stringInput = (String) data.get(1);
                    String newString = stringInput + "7";
                    t1.setText(newString);
                    data.set(1, newString);
                } catch (IndexOutOfBoundsException oob) {
                    t1.setText("Syntax Error: Press Clear");
                }
            }
        } else if (event.getSource() == b8) {
            useAnswer = false;
            if (!firstNumber) {
                t1.setText(String.valueOf(8));
                data.set(0, t1.getText());
                firstNumber = true;
            } else if (firstNumber && !secondNumber) {
                String stringInput = (String) data.get(0);
                String newString = stringInput + "8";
                t1.setText(newString);
                data.set(0, newString);
            } else if (secondNumber) {
                try {
                    String stringInput = (String) data.get(1);
                    String newString = stringInput + "8";
                    t1.setText(newString);
                    data.set(1, newString);
                } catch (IndexOutOfBoundsException oob) {
                    t1.setText("Syntax Error: Press Clear");
                }
            }
        } else if (event.getSource() == b9) {
            useAnswer = false;
            if (!firstNumber) {
                t1.setText(String.valueOf(9));
                data.set(0, t1.getText());
                firstNumber = true;
            } else if (firstNumber && !secondNumber) {
                String stringInput = (String) data.get(0);
                String newString = stringInput + "9";
                t1.setText(newString);
                data.set(0, newString);
            } else if (secondNumber) {
                try {
                    String stringInput = (String) data.get(1);
                    String newString = stringInput + "9";
                    t1.setText(newString);
                    data.set(1, newString);
                } catch (IndexOutOfBoundsException oob) {
                    t1.setText("Syntax Error: Press Clear");
                }
            }
        } else if (event.getSource() == b0) {
            useAnswer = false;
            if (!firstNumber) {
                t1.setText(String.valueOf(0));
                data.set(0, t1.getText());
                firstNumber = true;
            } else if (firstNumber && !secondNumber) {
                String stringInput = (String) data.get(0);
                String newString = stringInput + "0";
                t1.setText(newString);
                data.set(0, newString);
            } else if (secondNumber) {
                try {
                    String stringInput = (String) data.get(1);
                    String newString = stringInput + "0";
                    t1.setText(newString);
                    data.set(1, newString);
                } catch (IndexOutOfBoundsException oob) {
                    t1.setText("Syntax Error: Press Clear");
                }
            }
        } else if (event.getSource() == decimal) {
            useAnswer = false;
            if (!firstNumber) {
                t1.setText(".");
                data.add(t1.getText());
                firstNumber = true;
            } else if (firstNumber && !secondNumber) {
                String stringInput = (String) data.get(0);
                String newString = stringInput + ".";
                t1.setText(newString);
                data.set(0, newString);
            } else if (secondNumber) {
                try {
                    String stringInput = (String) data.get(1);
                    String newString = stringInput + ".";
                    t1.setText(newString);
                    data.set(1, newString);
                } catch (IndexOutOfBoundsException oob) {
                    t1.setText("Syntax Error: Press Clear");
                }
            }
        } else if (event.getSource() == addition) {
            t1.setText("+");
            plus = false;
            firstNumber = true;
            secondNumber = true;
            minus = true;
            star = true;
            slash = true;
            repeat1 = true;
            repeat2 = false;
            repeat3 = false;
            repeat4 = false;


            if (useAnswer == true) {
                String string = Double.toString((double) dataCopy.get(2));
                data.set(0, string);
                useAnswer = false;
            }

        } else if (event.getSource() == subtraction) {
            t1.setText("-");
            minus = false;
            firstNumber = true;
            secondNumber = true;
            plus = true;
            star = true;
            slash = true;
            repeat1 = false;
            repeat2 = true;
            repeat3 = false;
            repeat4 = false;


            if (useAnswer == true) {
                String string = Double.toString((double) dataCopy.get(2));
                data.set(0, string);
                useAnswer = false;
            }

        } else if (event.getSource() == multiplication) {
            t1.setText("*");
            star = false;
            firstNumber = true;
            secondNumber = true;
            plus = true;
            minus = true;
            slash = true;
            repeat1 = false;
            repeat2 = false;
            repeat3 = true;
            repeat4 = false;


            if (useAnswer == true) {
                String string = Double.toString((double) dataCopy.get(2));
                data.set(0, string);
                useAnswer = false;
            }

        } else if (event.getSource() == division) {
            t1.setText("/");
            slash = false;
            firstNumber = true;
            secondNumber = true;
            plus = true;
            minus = true;
            star = true;
            repeat1 = false;
            repeat2 = false;
            repeat3 = false;
            repeat4 = true;


            if (useAnswer == true) {
                String string = Double.toString((double) dataCopy.get(2));
                //data.add(string);
                data.set(0, string);
                useAnswer = false;
            }

        } else if (event.getSource() == enter) {

            try {
                if (useAnswer == false) {
                    double first = Double.parseDouble((String) data.get(0));
                    double second = Double.parseDouble((String) data.get(1));
                    if (!plus) {
                        t1.setText(String.valueOf(first + second));
                        plus = true;
                        repeat1 = true;
                    } else if (!minus) {
                        t1.setText(String.valueOf(first - second));
                        minus = true;
                        repeat2 = true;
                    } else if (!star) {
                        t1.setText(String.valueOf(first * second));
                        star = true;
                        repeat3 = true;
                    } else if (!slash) {
                        t1.setText(String.valueOf(first / second));
                        slash = true;
                        repeat4 = true;
                    }
                    double answer = Double.parseDouble(t1.getText());
                    data.set(2, answer);
                    dataCopy = new ArrayList<>(data);
                    data.clear();
                    useAnswer = true;
                } else if (useAnswer == true) {
                    double first = Double.parseDouble((String) dataCopy.get(1));
                    double second = (double) dataCopy.get(2);
                    if (repeat1) {
                        t1.setText(String.valueOf(first + second));
                    } else if (repeat2) {
                        t1.setText(String.valueOf(second - first));
                    } else if (repeat3) {
                        t1.setText(String.valueOf(first * second));
                    } else if (repeat4) {
                        t1.setText(String.valueOf(second / first));
                    }
                    double answer = Double.parseDouble(t1.getText());
                    dataCopy.set(2, answer);
                }
                secondNumber = false;
                firstNumber = false;
            } catch (Exception e) {
                t1.setText("Syntax Error: Clear to Continue");
            }

        } else if (event.getSource() == clear) {
            t1.setText("");
            data.clear();
            dataCopy.clear();
            useAnswer = false;
            repeat1 = false;
            repeat2 = false;
            repeat3 = false;
            repeat4 = false;
            firstNumber = false;
            secondNumber = false;
        } else if (event.getSource() == exit) {
            System.exit(0);
        }
    }
}
