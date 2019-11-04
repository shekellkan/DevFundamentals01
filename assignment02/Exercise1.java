package assignment02;

import java.util.Arrays;

public class Exercise1 {

    public static int getNumber(int[] nums, String value) {
        int result = 0;
        Arrays.sort(nums);   
        switch (value) {
            case "min":
                result = nums[0]; 
                break;
            case "max":
                result = nums[nums.length - 1];
                break;
            default:
                return (int) ((nums[0] + nums[nums.length - 1]) / 2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("----------- start -----------");
        System.out.println(getNumber(nums, "min"));
        System.out.println(getNumber(nums, "max"));
        System.out.println(getNumber(nums, "average"));
        System.out.println("----------- end -----------");
    }
}