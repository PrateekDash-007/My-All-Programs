import java.util.Arrays;
import java.util.Scanner;

public class Random {

    public static int[] threeSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[j] + nums[k] == target - nums[i]) {
                        return new int[]{i, j, k};
                    }
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of the array ");
        int size = sc.nextInt();

        int num[] = new int[size];

        System.out.println("Enter your array");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the target");
        int tar = sc.nextInt();

        System.out.println(Arrays.toString(threeSum(num, tar)));
    }
}
