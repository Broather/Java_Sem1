package SEMINARS_1;

public class Exercise_2 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    /**
     * @param n
     * @return factorial of n implemented using a for loop
     */
    public static int for_factorial(int n) {
        int result = n;
        for (int i = n - 1; i > 0; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * @param n
     * @return factorial of n implemented using recursion
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
