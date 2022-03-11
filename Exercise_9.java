package normalJava.SEMINARS_1;

import java.util.Arrays;

class set {
    int size;
    int[] content;

    set() {
        content = new int[0];
        this.size = 0;
    }

    set(int size) {
        content = new int[size];
        this.size = size;
    }

    set(int[] array) {
        content = array;
        this.size = array.length;
    }

    // TODO: dokumentācija
    public set add(set s) {
        set result = new set(this.size + s.size);
        for (int i = 0; i < this.size; i++) {
            result.content[i] = this.content[i];
        }
        for (int i = this.size, j = 0; i < this.size + s.size; i++, j++) {
            result.content[i] = s.content[j];
        }
        return result;

    }

    // TODO: dokumentācija
    public set multiply(set s) {
        set result = new set();
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < s.size; j++) {
                if (this.content[i] == s.content[j]) {
                    result = result.add(new set(new int[] {s.content[j]}));
                }
            }
        }
        return result;
    }

    // TODO: dokumentācija
    public set subtract(set s) {
        set result = new set();
        boolean unique = true;
        // salīdzinu katru this.content elementu ar s.content elementu vai nav unikāls, ja ir, tad
        // pievienoju result
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < s.size; j++) {
                if (this.content[i] == s.content[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                result = result.add(new set(new int[] {this.content[i]}));
            }
            unique = true;
        }
        // identisks pirmajam nested for loopam tikai salīdzinu s.content elementus ar this.content
        // elementiem
        for (int i = 0; i < s.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (s.content[i] == this.content[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                result = result.add(new set(new int[] {s.content[i]}));
            }
            unique = true;
        }
        return result;
    }

}

public class Exercise_9 {
    public static void main(String[] args) {
        set s1 = new set(new int[] {5, 10, 15, 20});
        set s2 = new set(new int[] {10, 20, 80});
        // System.out.println(Arrays.toString(s1.add(s2).content));
        // System.out.println(Arrays.toString(s1.multiply(s2).content));
        System.out.println(Arrays.toString(s1.subtract(s2).content));
    }
}
