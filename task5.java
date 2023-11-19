package arrayexercises;

public class task5 {
    public static void main(String[] args) {
        int[] arr = {7, -3, 9, -11, 18, 99, 2, 11};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min number : " + min);
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max number: " + max);
    }
}
