package forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class GuiClass {

    JFrame frame = new JFrame();
    private JButton tttButton;
    private JPanel panel1;
    private JTextField settingsButton;
    private JButton goTo;
    private JTextField startButton;
    private JButton go;
    private JTextArea textFieldRazrabotka;
    private JButton getTheBrickIntoFaceButton;
    private JTextField textPlay3;
    private JButton play3Button;
    private Check check = null;
    private Check2 check2 = new Check2();
    private Play3 play3 = new Play3();

    boolean checked = false;

    public GuiClass() {
        goTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//            gui2.StartSettings();
            }
        });
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!Objects.isNull(check)) {
                    check.getFinalCheck().getFrameField().dispose();
                }

                check = new Check();
                checked = true;

                check.play();
            }
        });

        play3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                play3.play3();
            }
        });
    }

    public void guiLayOut() {

        getTheBrickIntoFaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                check2.play2();
            }
        });
            frame.getContentPane().add(panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setSize(800, 500);

    }
}

