package arrayexercises;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        int[] array = {7, 5, 6, 1, 8, -3};
        int pos = 0;
        int len = array.length-1;
        while (pos < len) {
            int temp = array[len];
            array[len] = array[pos];
            array[pos] = temp;
            pos++; len--;
        }
        System.out.println(Arrays.toString(array));
    }
}
