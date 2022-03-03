package SEMINARS_1;

public class Exercise_1 {

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        finalPosition = positionCalc(gravity, initialVelocity, initialPosition, fallingTime);
        System.out.printf("Pos in %f sec : %f", fallingTime, finalPosition);

    }

    /**
     * @param gravity
     * @param initialVelocity
     * @param initialPosition
     * @param fallingTime
     * @return position moved based on the given parameters
     */
    public static double positionCalc(double gravity, double initialVelocity, double initialPosition, double fallingTime) {

        double result = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;
        return result;
    }
}
