package leetcode;
//将引入的东西带来的后果消除
//思路回到来的地方
//对数组索引的操作，一定考虑越界
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for (int i = 0; i < nums.length-count; i++) {
            if (nums[i] == val) {
                count++;
                for (int j = i+1; j < nums.length; j++) {
                    nums[j-1]=nums[j];
                }
                i--;
            }
        }
        return nums.length-count;
    }

    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        int[] arr = {3,2,2,3};
        System.out.println(r.removeElement(arr, 2));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
