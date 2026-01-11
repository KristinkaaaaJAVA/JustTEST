package forms;

public class MassivCheck {
    public boolean arrayCheck(int[] ReadyCheck, int[] Cross2) {

        boolean result = false;

        for (int i = 0; i < Cross2.length; i++) {

            if (ReadyCheck[i] == Cross2[i] || ReadyCheck[i] == 0) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
