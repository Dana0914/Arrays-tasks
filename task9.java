package arrayexercises;

public class task9 {
    public static void main(String[] args) {
        int[] array = {2, 3, 8, -5, 1, 10, 7};
        int res = median(array);
        System.out.println(res);
    }
    public static int median(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        if (array.length == 0) {
            return 0;
        }
        int element;
        if (array.length % 2 == 0) {
            element = array.length / 2 - 1;
        } else {
            element = array.length / 2;
        }
        return array[element];
    }
}
