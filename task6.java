package arrayexercises;

public class task6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 9, 8, 5, 7};
        boolean res = getBalanced(array);
        System.out.println(res);
    }
    public static boolean getBalanced(int[] array) {
        int right = 0;
        int left = 0;
        int currentIndex = array.length / 2;
        for (int i = 0; i < array.length / 2; i++) {
            right += array[i];
        }
        for (int j = array.length / 2; j < array.length; j++) {
            left += array[j];
        }
        int leftSum = left - array[currentIndex];
        return leftSum == right;
    }
}
