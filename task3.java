package arrayexercises;

public class task3 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = 1; i < nums.length; i += 2) {
            System.out.print(nums[i] + " ");
        }
    }
}
