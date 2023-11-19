package arrayexercises;

import java.util.Arrays;

public class task8 {
    public static void main(String[] args) {
        int[] array1 = {7, 5, 6, 1, 8, -3};
        int[] array2 = {4, 9, -5, 10, 2, 0};
        int[] newArr = new int[array1.length + array2.length];
        newArray(array1, array2, newArr, 0);
    }
    public static void newArray(int[] array1, int[] array2, int[] newArray, int pos) {
        for (int j : array1) {
            newArray[pos] = j;
            pos++;
        }
        for (int j : array2) {
            newArray[pos] = j;
            pos++;
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i; j < newArray.length; j++) {
                if (newArray[i] > newArray[j]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
