package leetcode;

public class MaxSubArr {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum>max) max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSubArr maxSubArr = new MaxSubArr();
        int[] a = {1, -2, 3, 5, -3, 2};
        System.out.println(maxSubArr.maxSubArray(a));
    }
}
