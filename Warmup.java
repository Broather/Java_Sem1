package normalJava.SEMINARS_1;

public class Warmup {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane",
                "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        for (int i = 0; i < names.length; i++) {
            System.out.printf("[%s, %d]%n", names[i], times[i]);
        }
    }

}