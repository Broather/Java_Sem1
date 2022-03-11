package normalJava.SEMINARS_1;

public class Exercise_3 {
    public static void main(String[] args) throws Exception {
        final int N = 10;
        double[] numbers = generateArray(N, 4.20, 6.9);
        printArray(numbers);
        System.out.printf("Mazaka vertiba: %.2f%n", getMin(numbers));
        System.out.printf("Lielaka vertiba: %.2f%n", getMax(numbers));
        System.out.printf("Videja vertiba: %.2f%n", getMean(numbers));
        numbers = arraySort(numbers);
        printArray(numbers);

    }

    public static void printArray(double arr[]) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n - 1; ++i)
            System.out.printf("%.2f, ", arr[i]);

        System.out.printf("%.2f]%n", arr[n - 1]);
    }

    /**
     * @param lower
     * @param upper
     * @return random double tipa vērtību intervālā [lower, upper)
     */
    private static double my_random(double lower, double upper) {
        return Math.random() * (upper - lower) + lower;
    }

    /**
     * Generates a double type array with N elements where each element is in the interval [lower;
     * upper)
     * 
     * @param array
     * @return N length array with random in interval [lower; upper)]
     */
    public static double[] generateArray(int N, double lower, double upper) throws Exception {
        if (upper < lower) {
            Exception exc = new Exception("Intervals nav logisks");
            throw exc;
        }
        if (N < 0) {
            return new double[0];
        }

        double[] matrix = new double[N];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = my_random(lower, upper);
        }
        System.out.println("Array generated!");
        return matrix;
    }

    /**
     * @param array
     * @return min element of array
     */
    public static double getMin(double[] array) {
        double min = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (min > Math.min(array[i], array[i + 1])) {
                min = Math.min(array[i], array[i + 1]);
            }
        }

        return min;
    }

    /**
     * @param array
     * @return max element of array
     */
    public static double getMax(double[] array) {
        double max = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (max > Math.max(array[i], array[i + 1])) {
                max = Math.max(array[i], array[i + 1]);
            }
        }

        return max;
    }

    /**
     * @param array
     * @return average (mean) of array elements
     */
    public static double getMean(double[] array) {
        double sum = 0;

        for (double d : array) {
            sum += d;
        }
        return sum / array.length;
    }

    /**
     * @param array
     * @return bubble sorted array (from smallest to largest)
     */
    public static double[] arraySort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap array[j+1] and array[j]
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        System.out.println("Array sorted!");
        return array;
    }

}
