package forms;

import java.util.Arrays;

public class Player2 {

    int[] Cross2;
    int posistion;
    int index = 0;
    boolean first = true;

    Player1 player1 = new Player1();

    public Integer setVar2(int buttonPressedIndex, int rng) {

        posistion = player1.setVar();
        player1.Positions[buttonPressedIndex] = 0;

        while (posistion - 1 == buttonPressedIndex) {
            posistion = player1.setVar();
        }

        if (rng == 0 && first) {
            Cross2 = new int[4];
            first = false;
        }
        else if (rng == 1 && first) {
            first = false;
            Cross2 = new int[5];
        }

        Cross2[index] = posistion;

        if (index < 4 && rng == 0) {
            index++;
        }
        else if (rng == 1 && index < 5) {
            index++;
        }

        System.out.println("Массив позиций врага: " + Arrays.toString(Cross2));
        return posistion - 1;
    }
}
