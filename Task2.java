package test;

public class Task2 {
    public static int solution(int[] T) {
        int winterDays = 0, winterMax = 0;
        winterMax = T[0];
        if (T.length == 2) { winterDays = 1; }
        else {
            for (int i = 1; i < T.length; i++) {
                if (T[i] > winterMax) {
                    if (T[i + 1] > winterMax) {
                        winterDays = i;
                        break;
                    } else {
                        winterMax = T[i];
                    }
                }
            }
        }
        return winterDays;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, -2, 3, 8, 6}));
        System.out.println(solution(new int[]{-5, -5, -5, -42, 6, 12}));
        System.out.println(solution(new int[]{-5, 5}));
        System.out.println(solution(new int[]{-1, 3, -8, -6, 2, 12, 16, 25}));
    }
}
