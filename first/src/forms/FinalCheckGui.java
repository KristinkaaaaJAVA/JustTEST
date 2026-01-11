package forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class FinalCheckGui {

    private JFrame frameField = new JFrame("Поле");
    private GuiClass guiClass = new GuiClass();
    private Check check;
    private JPanel panel1;
    private JLabel pole;
    private JLabel field1;
    private JLabel field2;
    private JLabel field3;
    private JLabel field4;
    private JLabel field5;
    private JLabel field6;
    private JLabel field7;
    private JLabel field8;
    private JLabel field9;
    private JLabel winner;
    private JLabel reserve;
    private JLabel firstOneTitle;
    private JLabel firstOne;
    private JButton returnButton;

    private boolean CrWin;
    private boolean CirWin;

    public FinalCheckGui(Check check) {
        this.check = check;

    }

    public JFrame getFrameField() {
        return frameField;
    }

    public void finalGui(int RNG, int[] Cross1, int[] Circle1, int[] Circle2, int[] Cross2, boolean CrossWinner, boolean CircleWinner) {

        if (RNG == 0) {
            firstOne.setText("Круг");
        }
        else {
            firstOne.setText("икс");
        }

        CrWin = CrossWinner;
        CirWin = CircleWinner;

        boolean nd2 = true;

        JLabel[] lables = {reserve, field1, field2, field3, field4, field5, field6, field7, field8, field9};

        reserve.setVisible(false);

        //Проверка сколько будет значений

        for (int i = 0; i < Cross2.length; i++) {

            if (0 == Cross2[i]) {
                nd2 = false;
                break;
            }
        }

        try {

            if (!nd2) {

                lables[Circle1[0]].setText("o");
                lables[Circle1[1]].setText("o");
                lables[Circle1[2]].setText("o");

                lables[Cross1[0]].setText("x");
                lables[Cross1[1]].setText("x");
                lables[Cross1[2]].setText("x");

                guiBuild();

            } else if (nd2) {

                if (RNG == 1) {

                    lables[Cross2[0]].setText("x");
                    lables[Cross2[1]].setText("x");
                    lables[Cross2[2]].setText("x");
                    lables[Cross2[3]].setText("x");
                    lables[Cross2[4]].setText("x");

                    lables[Circle2[0]].setText("o");
                    lables[Circle2[1]].setText("o");
                    lables[Circle2[2]].setText("o");
                    lables[Circle2[3]].setText("o");

                    guiBuild();

                } else if (RNG == 0) {

                    lables[Cross2[0]].setText("x");
                    lables[Cross2[1]].setText("x");
                    lables[Cross2[2]].setText("x");
                    lables[Cross2[3]].setText("x");

                    lables[Circle2[0]].setText("o");
                    lables[Circle2[1]].setText("o");
                    lables[Circle2[2]].setText("o");
                    lables[Circle2[3]].setText("o");
                    lables[Circle2[4]].setText("o");

                    guiBuild();
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println(Arrays.toString(Cross2) + " " + Arrays.toString(Cross1) + " " + Arrays.toString(Circle2) + " " + Arrays.toString(Circle1));
        }
    }

    private void guiBuild() {

        frameField.setSize(800, 800);
        frameField.setLocationRelativeTo(null);
        frameField.add(panel1);
        frameField.setVisible(true);

        winnerSetter();
    }

    private void winnerSetter() {

        if (CrWin) {
            winner.setText("Икс победил");
        }
        else if (CirWin) {
            winner.setText("Круг победил");
        }

        if (CrWin && CirWin) {
            check.play();
        }

        if (!CrWin && !CirWin) {
            winner.setText("Ничья");
        }
    }
}
