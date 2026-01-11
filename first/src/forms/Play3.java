package forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Play3 {

    private JButton field1;
    private JButton field2;
    private JButton field3;
    private JButton field4;
    private JButton field5;
    private JButton field6;
    private JButton field7;
    private JButton field8;
    private JButton field9;
    private JPanel fightField;
    private Random rand = new Random();
    private Player3 player = new Player3();

    int[] circlePos = new int[11];
    int[] crossPos = new int[11];
    int index;

    int rng = rand.nextInt(2);


    public Play3() {

        field1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                circlePos[0] = 1;
                field1.setText("o");
                index++;
                crossPos[index] = player.setCross(circlePos, crossPos, rng);
                System.out.println("cross pos " + Arrays.toString(crossPos));
            }
        });

        field2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                circlePos[1] = 2;
                field2.setText("o");
                index++;
                crossPos[index] = player.setCross(circlePos, crossPos, rng);
                System.out.println("cross pos " + Arrays.toString(crossPos));
            }
        });

        field3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                circlePos[2] = 3;
                field3.setText("o");
                index++;
                crossPos[index] = player.setCross(circlePos, crossPos, rng);
                System.out.println("cross pos " + Arrays.toString(crossPos));
            }
        });

        field4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                circlePos[3] = 4;
                field4.setText("o");
                index++;
                crossPos[index] = player.setCross(circlePos, crossPos, rng);
                System.out.println("cross pos " + Arrays.toString(crossPos));
            }
        });

        field5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                circlePos[4] = 5;
                field5.setText("o");
                index++;
                crossPos[index] = player.setCross(circlePos, crossPos, rng);
                System.out.println("cross pos " + Arrays.toString(crossPos));
            }
        });

        field6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                circlePos[5] = 6;
                field6.setText("o");
                index++;
                crossPos[index] = player.setCross(circlePos, crossPos, rng);
                System.out.println("cross pos " + Arrays.toString(crossPos));
            }
        });

        field7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                circlePos[6] = 7;
                field7.setText("o");
                index++;
                crossPos[index] = player.setCross(circlePos, crossPos, rng);
                System.out.println("cross pos " + Arrays.toString(crossPos));
            }
        });

        field8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                circlePos[7] = 8;
                field8.setText("o");
                index++;
                crossPos[index] = player.setCross(circlePos, crossPos, rng);
                System.out.println("cross pos " + Arrays.toString(crossPos));
            }
        });

        field9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                circlePos[8] = 9;
                field9.setText("o");
                index++;
                crossPos[index] = player.setCross(circlePos, crossPos, rng);
                System.out.println("cross pos " + Arrays.toString(crossPos));
            }
        });
    }


    public void play3() {

        JFrame mainField = new JFrame();

        mainField.setSize(500, 500);
        mainField.add(fightField);
        mainField.setVisible(true);
        mainField.setLocationRelativeTo(null);

        if (rng == 1) {

            crossPos[index] = player.setCross(circlePos, crossPos, rng);
            index++;
            System.out.println(Arrays.toString(crossPos));
        }
    }
}
