package forms;

import java.util.Arrays;
import java.util.Random;

public class Check {

    Player1 p1 = new Player1();
    Random rand = new Random();
    CheckCircle check = new CheckCircle();
    CheckCross checkCross = new CheckCross();
    FinalCheckGui finalCheck = new FinalCheckGui(Check.this);

    public FinalCheckGui getFinalCheck() {
        return finalCheck;
    }

    public void play() {

        boolean CircleWinner = false;
        boolean CrossWinner = false;

        int RNG = rand.nextInt(2);

        int circlePos1 = 0;
        int crossPos1 = 0;
        int circlePos2 = 0;
        int crossPos2 = 0;
        int circlePos3 = 0;
        int crossPos3 = 0;
        int circlePos4 = 0;
        int crossPos4 = 0;
        int circlePos5 = 0;
        int crossPos5 = 0;

        int[] Cross1;
        int[] Cross2;
        int[] Circle1;
        int[] Circle2;

        if (RNG == 0) {

            System.out.println("Кружок ходил первым");

            circlePos1 = p1.setVar();
            crossPos1 = p1.setVar();

            circlePos2 = p1.setVar();
            crossPos2 = p1.setVar();

            circlePos3 = p1.setVar();
            crossPos3 = p1.setVar();

            circlePos4 = p1.setVar();
            crossPos4 = p1.setVar();

            circlePos5 = p1.setVar();

        } else {

            System.out.println("Икс ходил первым");

            crossPos1 = p1.setVar();
            circlePos1 = p1.setVar();

            crossPos2 = p1.setVar();
            circlePos2 = p1.setVar();

            crossPos3 = p1.setVar();
            circlePos3 = p1.setVar();

            crossPos4 = p1.setVar();
            circlePos4 = p1.setVar();

            crossPos5 = p1.setVar();
        }

        Cross1 = new int[3];
        Circle1 = new int[3];

        Cross2 = new int[4];
        Circle2 = new int[4];

        if (RNG == 0) {

            Circle1[0] = circlePos1;
            Circle1[1] = circlePos2;
            Circle1[2] = circlePos3;

            Cross1[0] = crossPos1;
            Cross1[1] = crossPos2;
            Cross1[2] = 0;

        } else {

            Cross1[0] = crossPos1;
            Cross1[1] = crossPos2;
            Cross1[2] = crossPos3;

            Circle1[0] = circlePos1;
            Circle1[1] = circlePos2;
            Circle1[2] = 0;
        }

        Arrays.sort(Cross1);
        Arrays.sort(Circle1);

        if (RNG == 0) {
            CircleWinner = check.checkCircle1(Circle1);

        } else {
            CrossWinner = checkCross.checkCross2(Cross1);
        }

        if (CrossWinner || CircleWinner) {
            finalCheck.finalGui(RNG, Cross1, Circle1, Circle2, Cross2, CrossWinner, CircleWinner);
        }

        if (RNG == 0) {
            Cross1[2] = crossPos3;

            Arrays.sort(Cross1);

            CrossWinner = checkCross.checkCross2(Cross1);

        } else {
            Circle1[2] = circlePos3;

            Arrays.sort(Circle1);

            CircleWinner = check.checkCircle1(Circle1);
        }

        if (CircleWinner || CrossWinner) {
            finalCheck.finalGui(RNG, Cross1, Circle1, Circle2, Cross2, CrossWinner, CircleWinner);
        }

        if (RNG == 0) {
            Circle2 = new int[5];

            Circle2[0] = circlePos1;
            Circle2[1] = circlePos2;
            Circle2[2] = circlePos3;
            Circle2[3] = circlePos4;
            Circle2[4] = circlePos5;

            Cross2[0] = crossPos1;
            Cross2[1] = crossPos2;
            Cross2[2] = crossPos3;
            Cross2[3] = crossPos4;

            Arrays.sort(Cross2);
            Arrays.sort(Circle2);
        } else {
            Cross2 = new int[5];

            Cross2[0] = crossPos1;
            Cross2[1] = crossPos2;
            Cross2[2] = crossPos3;
            Cross2[3] = crossPos4;
            Cross2[4] = crossPos5;

            Circle2[0] = circlePos1;
            Circle2[1] = circlePos2;
            Circle2[2] = circlePos3;
            Circle2[3] = circlePos4;

            Arrays.sort(Circle2);
            Arrays.sort(Cross2);
        }

        if (RNG == 0) {

            CircleWinner = check.MainCheckCircle(RNG, Circle2);
            CrossWinner = checkCross.MainCheckCross(Cross2, RNG);

            finalCheck.finalGui(RNG, Cross1, Circle1, Circle2, Cross2, CrossWinner, CircleWinner);
        } else {

            CrossWinner = checkCross.MainCheckCross(Cross2, RNG);
            CircleWinner = check.MainCheckCircle(RNG, Circle2);

            finalCheck.finalGui(RNG, Cross1, Circle1, Circle2, Cross2, CrossWinner, CircleWinner);
        }

        finalCheck.finalGui(RNG, Cross1, Circle1, Circle2, Cross2, CrossWinner, CircleWinner);
    }
}