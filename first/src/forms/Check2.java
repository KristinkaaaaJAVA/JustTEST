package forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Check2 {

    private int cross1;
    private int counter;


    Random rand = new Random();
    JFrame frameFight = new JFrame();
    JPanel Pole;
    private JButton field1;
    private JButton field2;
    private JButton field3;
    private JButton field4;
    private JButton field5;
    private JButton field6;
    private JButton field7;
    private JButton field8;
    private JButton field9;
    private JLabel winner;
    private CheckCross chCross = new CheckCross();
    private CheckCircle chCircle = new CheckCircle();
    private JLabel winner2;
    private int rng;
    private Player2 player = new Player2();
    private ArraysSortirovka sortirovka = new ArraysSortirovka();
    private ArraysSortirovka sortirovka2 = new ArraysSortirovka();
    private int buttonCounter = 0;

    int[] circle = new int[9];


    private int buttonPressedIndex;


    JButton[] buttons = {field1, field2, field3, field4, field5, field6, field7, field8, field9};

    public Check2() {
        field1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText("o");
                buttonPressedIndex = 0;
                circle[0] = 1;
                buttonCounter++;
                setCrosses();
            }
        });

        field2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field2.setText("o");
                buttonPressedIndex = 1;
                circle[1] = 2;
                buttonCounter++;
                setCrosses();
            }
        });

        field3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field3.setText("o");
                buttonPressedIndex = 2;
                circle[2] = 3;
                buttonCounter++;
                setCrosses();
            }
        });

        field4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field4.setText("o");
                buttonPressedIndex = 3;
                circle[3] = 4;
                buttonCounter++;
                setCrosses();
            }
        });

        field5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field5.setText("o");
                buttonPressedIndex = 4;
                circle[4] = 5;
                buttonCounter++;
                setCrosses();
            }
        });

        field6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field6.setText("o");
                buttonPressedIndex = 5;
                circle[5] = 6;
                buttonCounter++;
                setCrosses();
            }
        });

        field7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field7.setText("o");
                buttonPressedIndex = 6;
                circle[6] = 7;
                buttonCounter++;
                setCrosses();
            }
        });

        field8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field8.setText("o");
                buttonPressedIndex = 7;
                circle[7] = 8;
                buttonCounter++;
                setCrosses();
            }
        });

        field9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field9.setText("o");
                buttonPressedIndex = 8;
                circle[8] = 9;
                buttonCounter++;
                setCrosses();
            }
        });
    }

    public void play2() {

        rng = rand.nextInt(2);

        frameFight.add(Pole);
        frameFight.setVisible(true);
        frameFight.setLocationRelativeTo(null);
        frameFight.setSize(800, 800);

        if (rng == 0) {
            JOptionPane.showMessageDialog(null, "Ты ходишь первым");
        } else {
            JOptionPane.showMessageDialog(null, "Враг ходит первым");
            setCrosses();
        }
    }

    public void setCrosses() {

        System.out.println("Нажата кнопка " + buttonPressedIndex);

        if (counter < 4 && rng == 0) {

            cross1 = player.setVar2(buttonPressedIndex, rng);
            buttons[buttonPressedIndex] = null;

            buttons[cross1].setText("x");
            buttons[cross1] = null;
            counter++;

        } else if (counter < 5 && rng == 1) {

            cross1 = player.setVar2(buttonPressedIndex, rng);
            buttons[buttonPressedIndex] = null;

            buttons[cross1].setText("x");
            buttons[cross1] = null;
            counter++;
        }
        arrayCollection();
    }

    private void arrayCollection() {

        System.out.println("КЛИКИ " + buttonCounter);
        boolean circleWinner = false;
        boolean crossWinner = false;

        if (buttonCounter >= 3) {
        int[] Cross1 = {player.Cross2[0], player.Cross2[1], player.Cross2[2]};
        Arrays.sort(Cross1);
        crossWinner = chCross.checkCross2(sortirovka.sortArray(Cross1));
    }

        if (buttonCounter >= 4) {

            int[] Cross2 = player.Cross2;
            Arrays.sort(Cross2);
            crossWinner = chCross.MainCheckCross(sortirovka.sortArray(Cross2), rng);
        }

        if (buttonCounter >= 3) {
            Arrays.sort(circle);
            int[] cc1 = sortirovka2.sortArray(circle);
            int[] Circle1 = {cc1[0], cc1[1], cc1[2]};
            System.out.println(Arrays.toString(Circle1));

            circleWinner = chCircle.checkCircle1(Circle1);
        }

        if (buttonCounter >= 4) {
            int[] Circle2 = sortirovka2.sortArray(circle);
            System.out.println("СРАБОТАЛ");
            circleWinner = chCircle.MainCheckCircle(rng, Circle2);
        }

        finalCheck(crossWinner, circleWinner);
    }

    private void finalCheck(boolean crossWinner, boolean circleWinner) {

        if (crossWinner) {
            JOptionPane.showMessageDialog(null, "бот победил! (Как вообще ты измудрился ему проиграть?)");
            return;
        }

        if (circleWinner) {
            JOptionPane.showMessageDialog(null, "Ты уделал этого бота! (Бот в разработке и думаю он станет умнее)");
        }
    }
}


