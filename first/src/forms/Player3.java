package forms;

import java.util.Arrays;

public class Player3 {

    boolean first = true;
    boolean second = false;
    Player1 gen = new Player1();
    ArraysSortirovka a = new ArraysSortirovka();
    Protect p = new Protect();
    CheckCross ch = new CheckCross();


    public int setCross(int[] circlePos, int[] crossPos, int rng) {

        System.out.println(Arrays.toString(circlePos));

        if (first) {
            int pos = gen.setVar();
            int[] altCirclePos = a.sortArray(circlePos);

            for (int i = 0; i < altCirclePos.length; i++) {
                if (altCirclePos[i] == pos) {
                    pos = gen.setVar();
                }
            }

            first = false;
            second = true;
            return pos;
        }

        else if (second) {

            int[][] checks1 = {ch.check1, ch.check2, ch.check3, ch.check4, ch.check5, ch.check6, ch.check7, ch.check8};

            int[] readyCheck;
            second = false;
            int[][] cPos = null;


            for (int i = 0; i < checks1.length; i++) {

                cPos = p.getPos(checks1[i], a.sortArray(circlePos));
                System.out.println("CPOS: " + Arrays.deepToString(cPos));

                if (cPos[0].length >= 2) {
                    System.out.println(Arrays.deepToString(cPos) + "CPOS, DONE");
                    break;
                }
            }

            System.out.println(Arrays.deepToString(cPos) + "CPOS, READY");
        }
        return 0;
    }
}
