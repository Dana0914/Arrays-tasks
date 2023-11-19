package arrayexercises;

public class task1 {
    public static void main(String[] args) {
        // Вывести сумму элементов массива
        int[] array = {7, 5, 6, 1, 8, -3};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }
}
