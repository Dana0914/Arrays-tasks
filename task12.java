package arrayexercises;

public class task12 {
    public static void main(String[] args) {
        int middle;
        int[] nums = {7, -3, 9, -11, 4};
        if (nums.length % 2 == 0) {
            middle = nums.length / 2;
        } else {
            middle = nums.length / 2 + 1;
        }

        for (int i = middle; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < middle; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
