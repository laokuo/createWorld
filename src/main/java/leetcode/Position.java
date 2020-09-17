package leetcode;

import org.apache.poi.hssf.record.formula.GreaterThanPtg;

import java.util.Stack;
//递归与while
//二分法的终止条件
//调用递归函数前的判断条件能不能移入递归函数里面
public class Position {
    public static int searchInsert(int[] nums, int target) {
        return binaryDevide(0,nums.length-1,nums,target);
    }
    public static int binaryDevide(int start,int end,int[] nums,int target) {
        if (start>end) {
            return start;
        }
        int mid = (start+end)/2;
            if (target > nums[mid]) return binaryDevide(mid + 1, end, nums, target);
            else if (target < nums[mid]) {
                return binaryDevide(start, mid - 1, nums, target);
            }
            else
                return start;
    }
    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        System.out.println(searchInsert(a,7));
    }
}
