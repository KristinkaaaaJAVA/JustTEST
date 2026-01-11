package forms;

import java.util.Arrays;

public class ArraysSortirovka {

    int counter = 0;

    public int[] sortArray (int[] a) {


        int i;
        int j = 0;
        int v = 0;

        int[] finalResult;

        int[] result = new int[a.length];

        for (i = 0; i < a.length; i++) {
            if (a[i] == 0 == false) {
                result[v] = a[i];
                v++;
                j++;
            }
        }

        finalResult = new int[j];
        for (i = 0; i < j; i++) {
            finalResult[i] = result[i];
        }

        Arrays.sort(finalResult);
        System.out.println("Массив отсортирован! " + Arrays.toString(finalResult));
        counter++;
        return finalResult;
    }
}

