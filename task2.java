package arrayexercises;

public class task2 {
    public static void main(String[] args) {
        // Вывести последние три элемента
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        int len = nums.length-1;;
        for (int i = len; i > 4; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
