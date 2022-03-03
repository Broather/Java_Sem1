package SEMINARS_1;

public class Exercise_5 {
    public static void main(String[] args) {
        System.out.printf("Rolled double 6 in %d tries%n", roll2Dices());
    }

    // @formatter:off
    /**
     * Monētas mešanas simulācija:
     * 
     * @param N
     * @return statistikas masīvs formātā [<number of heads>, <number of tails>, <ratio: nheads/ntails>]
     */
    // @formatter:on
    public static double[] coinFlip(int N) {
        if (N <= 0) {
            return new double[0];
        }
        double[] result = new double[3];
        for (int i = 0; i < N; i++) {

            if (Math.random() > 0.5) {
                result[0]++;
            } else {
                result[1]++;
            }
        }
        result[2] = result[0] / result[1];

        return result;
    }

    /**
     * Kauliņu mešanas simulātors
     * 
     * @param N
     * @return histogramma kā masīvs kas uzskaita cik reizes katra metamā kauliņa vērtība tika
     *         uzmesta
     */
    public static int[] rollDice(int N) {
        if (N <= 0) {
            return new int[0];
        }
        int[] result = new int[6];
        for (int i = 0; i < N; i++) {
            result[my_random_int(1, 6) - 1]++;
        }
        return result;
    }

    /**
     * @param lower
     * @param upper
     * @return a random integer in the range [lower; upper]
     */
    private static int my_random_int(int lower, int upper) {
        int random = (int) Math.round((Math.random() * (upper - lower)) + lower);
        return random;
    }

    /**
     * @return the amount of tries it took to get 2 dies to roll 6 (for a total of 12)
     */
    public static int roll2Dices() {
        int tries = 0;
        while (my_random_int(1, 6) + my_random_int(1, 6) != 12) {
            tries++;
        }
        return tries;
    }

}
