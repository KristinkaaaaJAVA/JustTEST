package forms;

public class CheckCross {

    boolean Cross = true;

    //данные для трех ходов

    int[] check1 = {1, 2, 3};
    int[] check2 = {4, 5, 6};
    int[] check3 = {7, 8, 9};
    int[] check4 = {1, 4, 7};
    int[] check5 = {2, 5, 8};
    int[] check6 = {3, 6, 9};
    int[] check7 = {1, 5, 9};
    int[] check8 = {3, 5, 7};

    MassivCheck ch = new MassivCheck();

    //Данные для пяти ходов

    int[] check9 = {0, 0, 1, 2, 3};
    int[] check10 = {1, 0, 2, 0, 3};
    int[] check11 = {1, 2, 3, 0, 0};
    int[] check12 = {0, 1, 0, 2, 3};
    int[] check13 = {0, 1, 2, 0, 3};
    int[] check14 = {0, 1, 2, 3, 0};
    int[] check15 = {1, 0, 0, 2, 3};
    int[] check16 = {1, 0, 2, 3, 0};
    int[] check17 = {1, 2, 0, 0, 3};
    int[] check18 = {1, 2, 0, 3, 0};

    int[] check19 = {0, 0, 4, 5, 6};
    int[] check20 = {4, 0, 5, 0, 6};
    int[] check21 = {4, 5, 6, 0, 0};
    int[] check22 = {0, 4, 0, 5, 6};
    int[] check23 = {0, 4, 5, 0, 6};
    int[] check24 = {0, 4, 5, 6, 0};
    int[] check25 = {4, 0, 0, 5, 6};
    int[] check26 = {4, 0, 5, 6, 0};
    int[] check27 = {4, 5, 0, 0, 6};
    int[] check28 = {4, 5, 0, 6, 0};

    int[] check29 = {0, 0, 7, 8, 9};
    int[] check30 = {0, 7, 0, 8, 9};
    int[] check31 = {0, 7, 8, 0, 9};
    int[] check32 = {0, 7, 8, 9, 0};
    int[] check33 = {7, 0, 0, 8, 9};
    int[] check34 = {7, 0, 8, 0, 9};
    int[] check35 = {7, 0, 8, 9, 0};
    int[] check36 = {7, 8, 0, 0, 9};
    int[] check37 = {7, 8, 0, 9, 0};
    int[] check38 = {7, 8, 9, 0, 0};

    int[] check39 = {0, 0, 1, 4, 7};
    int[] check40 = {0, 1, 0, 4, 7};
    int[] check41 = {0, 1, 4, 0, 7};
    int[] check42 = {0, 1, 4, 7, 0};
    int[] check43 = {1, 0, 0, 4, 7};
    int[] check44 = {1, 0, 4, 0, 7};
    int[] check45 = {1, 0, 4, 7, 0};
    int[] check46 = {1, 4, 0, 0, 7};
    int[] check47 = {1, 4, 0, 7, 0};
    int[] check48 = {1, 4, 7, 0, 0};

    int[] check49 = {0, 0, 2, 5, 8};
    int[] check50 = {0, 2, 0, 5, 8};
    int[] check51 = {0, 2, 5, 0, 8};
    int[] check52 = {0, 2, 5, 8, 0};
    int[] check53 = {2, 0, 0, 5, 8};
    int[] check54 = {2, 0, 5, 0, 8};
    int[] check55 = {2, 0, 5, 8, 0};
    int[] check56 = {2, 5, 0, 0, 8};
    int[] check57 = {2, 5, 0, 8, 0};
    int[] check58 = {2, 5, 8, 0, 0};

    int[] check59 = {0, 0, 3, 6, 9};
    int[] check60 = {0, 3, 0, 6, 9};
    int[] check61 = {0, 3, 6, 0, 9};
    int[] check62 = {0, 3, 6, 9, 0};
    int[] check63 = {3, 0, 0, 6, 9};
    int[] check64 = {3, 0, 6, 0, 9};
    int[] check65 = {3, 0, 6, 9, 0};
    int[] check66 = {3, 6, 0, 0, 9};
    int[] check67 = {3, 6, 0, 9, 0};
    int[] check68 = {3, 6, 9, 0, 0};

    int[] check69 = {0, 0, 1, 5, 9};
    int[] check70 = {0, 1, 0, 5, 9};
    int[] check71 = {0, 1, 5, 0, 9};
    int[] check72 = {0, 1, 5, 9, 0};
    int[] check73 = {1, 0, 0, 5, 9};
    int[] check74 = {1, 0, 5, 0, 9};
    int[] check75 = {1, 0, 5, 9, 0};
    int[] check76 = {1, 5, 0, 0, 9};
    int[] check77 = {1, 5, 0, 9, 0};
    int[] check78 = {1, 5, 9, 0, 0};

    int[] check79 = {0, 0, 3, 5, 7};
    int[] check80 = {0, 3, 0, 5, 7};
    int[] check81 = {0, 3, 5, 0, 7};
    int[] check82 = {0, 3, 5, 7, 0};
    int[] check83 = {3, 0, 0, 5, 7};
    int[] check84 = {3, 0, 5, 0, 7};
    int[] check85 = {3, 0, 5, 7, 0};
    int[] check86 = {3, 5, 0, 0, 7};
    int[] check87 = {3, 5, 0, 7, 0};
    int[] check88 = {3, 5, 7, 0, 0};

    //Для четырех значений

    int[] check89 = {0, 1, 2, 3};
    int[] check90 = {1, 0, 2, 3};
    int[] check91 = {1, 2, 0, 3};
    int[] check92 = {1, 2, 3, 0};

    int[] check93 = {0, 4, 5, 6};
    int[] check94 = {4, 0, 5, 6};
    int[] check95 = {4, 5, 0, 6};
    int[] check96 = {4, 5, 6, 0};

    int[] check97 = {0, 7, 8, 9};
    int[] check98 = {7, 0, 8, 9};
    int[] check99 = {7, 8, 0, 9};
    int[] check100 = {7, 8, 9, 0};

    int[] check101 = {0, 1, 4, 7};
    int[] check102 = {1, 0, 4, 7};
    int[] check103 = {1, 4, 0, 7};
    int[] check104 = {1, 4, 7, 0};

    int[] check105 = {0, 2, 5, 8};
    int[] check106 = {2, 0, 5, 8};
    int[] check107 = {2, 5, 0, 8};
    int[] check108 = {2, 5, 8, 0};

    int[] check109 = {0, 3, 6, 9};
    int[] check110 = {3, 0, 6, 9};
    int[] check111 = {3, 6, 0, 9};
    int[] check112 = {3, 6, 9, 0};

    int[] check113 = {0, 1, 5, 9};
    int[] check114 = {1, 0, 5, 9};
    int[] check115 = {1, 5, 0, 9};
    int[] check116 = {1, 5, 9, 0};

    int[] check117 = {0, 3, 5, 7};
    int[] check118 = {3, 0, 5, 7};
    int[] check119 = {3, 5, 0, 7};
    int[] check120 = {3, 5, 7, 0};

    int[] ReadyCheck;

    boolean ch1 = false;
    boolean ch2 = false;
    boolean ch3 = false;
    boolean ch4 = false;
    boolean ch5 = false;
    boolean ch6 = false;
    boolean ch7 = false;
    boolean ch8 = false;

    boolean result;

    public boolean checkCross2(int[] Cross1) {
        //проверка первого массива
        for (int i = 0; i < Cross1.length; i++) {

            if (check1[i] == Cross1[i]) {
                ch1 = true;
            } else {
                ch1 = false;
                break;
            }
        }
        //Второй массив
        for (int j = 0; j < Cross1.length; j++) {

            if (check2[j] == Cross1[j]) {
                ch2 = true;
            } else {
                ch2 = false;
                break;
            }
        }
        //третий массив
        for (int h = 0; h < Cross1.length; h++) {

            if (check3[h] == Cross1[h]) {
                ch3 = true;
            } else {
                ch3 = false;
                break;
            }
        }
        //четвертый массив
        for (int b = 0; b < Cross1.length; b++) {

            if (check4[b] == Cross1[b]) {
                ch4 = true;
            } else {
                ch4 = false;
                break;
            }
        }
        //пятый массив
        for (int k = 0; k < Cross1.length; k++) {

            if (check5[k] == Cross1[k]) {
                ch5 = true;
            } else {
                ch5 = false;
                break;
            }
        }
        //шестой массив
        for (int l = 0; l < Cross1.length; l++) {

            if (check6[l] == Cross1[l]) {
                ch6 = true;
            } else {
                ch6 = false;
                break;
            }
        }
        //Седьмой массив
        for (int m = 0; m < Cross1.length; m++) {

            if (check7[m] == Cross1[m]) {
                ch7 = true;
            } else {
                ch7 = false;
                break;
            }
        }
        //Восьмой массив
        for (int n = 0; n < Cross1.length; n++) {

            if (check8[n] == Cross1[n]) {
                ch8 = true;
            } else {
                ch8 = false;
                break;
            }
        }

        if (ch1 || ch2 || ch3 || ch4 || ch5 || ch6 || ch7 || ch8) {

            return true;
        }

        return false;
    }


    public boolean MainCheckCross(int[] Cross2, int RNG) {

        if (RNG == 1) {

            int[][] checks = {check9, check10, check11, check12, check13, check14, check15, check16, check17, check18, check19, check20, check21, check22, check23,
                    check24, check25, check26, check27, check28, check29, check30, check31, check32, check33, check34, check35, check36, check37, check38, check39,
                    check40, check41, check42, check43, check44, check45, check46, check47, check48, check49, check50, check51, check52, check53, check54, check55,
                    check56, check57, check58, check59, check60, check61, check62, check63, check64, check65, check66, check67, check68, check69, check70, check71,
                    check72, check73, check74, check75, check76, check77, check78, check79, check80, check81, check82, check83, check84, check85, check86, check87, check88};

            for (int i = 0; i < checks.length; i++) {
                ReadyCheck = checks[i];
                result = ch.arrayCheck(ReadyCheck, Cross2);
                if (result) {
                    return true;
                }
            }
            return false;
        } else {

            int[][] checks = {check89, check90, check91, check92, check93, check94, check95, check96, check97, check98, check99, check100, check101, check102, check103,
                    check104, check105, check106, check107, check108, check109, check110, check111, check112, check113, check114, check115, check116, check117, check118,
                    check119, check120};

            for (int i = 0; i < checks.length; i++) {
                ReadyCheck = checks[i];
                result = ch.arrayCheck(ReadyCheck, Cross2);
                if (result) {
                    return true;
                }
            }
            return false;
        }
    }
}