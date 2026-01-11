package forms;

import java.util.Arrays;

public class Protect {

    ArraysSortirovka sortirovka = new ArraysSortirovka();
    boolean firstTime = true;
    Player1 generator = new Player1();
    Player1 generator2 = new Player1();


    public int[][] getPos(int[] readyCheck, int[] circlePos) {

        int index1 = 0;
        int index2 = 0;
        int[] truePos = new int[10];
        int[] falsePos = new int[10];
        int index3;
        int index4;
        boolean checked = false;

        System.out.println(Arrays.toString(circlePos) + "c");

        if (circlePos.length < 4) {

            generator2.Positions = new int[]{1, 2, 3};
            generator2.Reserve = new int[]{1, 2, 3};

            if (circlePos.length < 3) {
                generator.Positions = new int[]{1, 2};
                generator.Reserve = new int[]{1, 2};
            }

            if (readyCheck.length == 3 && circlePos.length == 3) {
                generator.Positions = new int[]{1, 2, 3};
                generator.Reserve = new int[]{1, 2, 3};
            }
        }

        while (generator.Positions[0] != 0 && generator.Positions[1] != 0 && circlePos.length == 2) {
            index3 = generator.setVar() - 1;
            index4 = generator2.setVar() - 1;


            if (readyCheck[index4] == circlePos[index3]) {
                truePos[index1] = circlePos[index3];
                index1++;
                System.out.println(Arrays.toString(truePos) + "пишу в тру");
            } else if (readyCheck[index4] != circlePos[index3]) {
                falsePos[index2] = circlePos[index3];
                index2++;
                System.out.println(Arrays.toString(falsePos) + "пишу в фолс");
            }
        }

        while (generator.Positions[0] != 0 && generator.Positions[1] != 0 && generator.Positions[2] != 0 && circlePos.length == 3) {
            index3 = generator.setVar() - 1;
            index4 = generator2.setVar() - 1;

            if (readyCheck[index4] == circlePos[index3]) {
                truePos[index1] = circlePos[index3];
                index1++;
            } else if (readyCheck[index4] != circlePos[index3]) {
                falsePos[index2] = circlePos[index3];
                index2++;
            }
        }

        if (circlePos.length >= 4) {

            for (int i = 0; i < circlePos.length; i++) {

                if (circlePos[i] == readyCheck[i]) {
                    truePos[index1] = circlePos[i];
                    index1++;
                } else if (circlePos[i] != readyCheck[i]) {
                    falsePos[index2] = circlePos[i];
                    index2++;
                }
            }
        }
        return new int[][]{sortirovka.sortArray(truePos), sortirovka.sortArray(falsePos)};
    }
}
