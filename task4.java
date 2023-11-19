package arrayexercises;

public class task4 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        printNums(nums, 0, 0);
    }
    public static void printNums(int[] nums, int positiveNums, int negativeNums) {
        for (int num : nums) {
            if (num < 0) {
                System.out.print(num + " ");
                positiveNums++;
            }
        }
        System.out.println();
        for (int num : nums) {
            if (num >= 0) {
                System.out.print(num + " ");
                negativeNums++;
            }
        }
        System.out.println("\n" + "Positive nums: " + positiveNums);
        System.out.println("Negative nums: " + negativeNums);
    }
}
