package normalJava.SEMINARS_1;

import java.util.Arrays;

public class Exercise_7 {
    public static void main(String[] args) {
        System.out.println(pascalsTriangle(6));
    }

// @formatter:off
/**
 *     1 <- level 0
 *    1 1 <- level 1
 *   1 2 1 <- level 2
 *  1 3 3 1 <- level 3
 * 1 4 6 4 1 <- level 4
 * @param level
 * @return a string representation of an array of elements in pascals triangle
 */
// @formatter:on
    public static String pascalsTriangle(int level) {
        // level == amount of elements on level
        int[] result = new int[level];
        for (int i = 0; i < level; i++) {

            result[i] = Exercise_2.factorial(level) / (Exercise_2.factorial(i) * (Exercise_2.factorial(level - i)));
        }
        return Arrays.toString(result);
    }

}
