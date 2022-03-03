package SEMINARS_1;

public class Exercise_6 {
    public static void main(String[] args) {
        byte[] string = {72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 115, 107, 105, 108, 108, 115, 32, 97, 114, 101, 32, 103,
                114, 101, 97, 116, 32, 97, 108, 114, 101, 97, 100, 121, 33};
        System.out.println(getTextFromBytes(string));
    }

    /**
     * Converts an array of bytes to a String by using a String constructor
     * 
     * @param array
     * @return a String
     */
    public static String getTextFromBytes(byte[] array) {
        String string = new String(array);
        return string;
    }
}
