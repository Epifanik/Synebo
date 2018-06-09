package test;

import static java.lang.Math.sqrt;

public class Task1 {

    public static int solution(int a, int b) {
        int count = 0, firstWS = 0, lastWS = 0, i = 0;
        boolean found = false;
        if (a < 0) i = 0;
        else i = a;
        while ((!found) && (i <= b)) {
            if (sqrt(i) % 1 == 0) {
                firstWS = i;
                found = true;
            }
            else i++;
        }
        i = b;
        found = false;
        while ((!found) && (i >= a)) {
            if (sqrt(i) % 1 == 0) {
                lastWS = i;
                found = true;
            }
            else i--;
        }
        if (((firstWS == 0) && (lastWS == 0) && (a > 0) && (b > 0)) || ((a < 0) && (b < 0))) count = 0;
        else count = (int) ((sqrt(lastWS) - sqrt(firstWS)) + 1);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 17));
        System.out.println(solution(-1, 0));
        System.out.println(solution(17, 18));
        System.out.println(solution(-200, -100));
        System.out.println(solution(-2147483647, 2147483647));
    }
}
