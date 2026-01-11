package forms;

import java.util.Arrays;
import java.util.Random;

public class Player1 {

    int SetPositions = 0;

    Random rand = new Random();

    int[] Positions = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] Reserve = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public Integer setVar() {

        boolean Do = true;
        boolean check = false;

        while (SetPositions == 0 || Do) {
            int rng1 = rand.nextInt(Positions.length);

            SetPositions = Positions[rng1];
            Positions[rng1] = 0;

            Do = false;
            System.out.println("Ставлю значение");
        }
        System.out.println("Успешно поставил значение " + SetPositions);

        for (int i = 0; i < Positions.length; i++) {
            if (Positions[i] == 0) {
                check = true;
            }
            else {
                check = false;
                break;
            }
        }

        if (check) {
            Positions = Arrays.copyOf(Reserve, Reserve.length);
        }
        return SetPositions;
    }
}


