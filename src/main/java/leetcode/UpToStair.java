package leetcode;

public class UpToStair {
    public static int jieCheng(int m) {
        if (m==0) return 0;
        int positive=1;
        while (m >= 1) {
            positive*=m;
            m--;
        }
        return positive;
    }
    public static int find(int n) {
        int sum=0;
        int numOfone=0;
        int numOftwo = 0;
        for (numOftwo = 0; 2 * numOftwo <= n; numOftwo++) {
            numOfone = n - 2*numOftwo;
            if (numOfone == 1) {
                sum+=numOftwo+1;
            }
            else if (numOftwo == 1) {
                sum+=numOfone+1;
            } else if (numOfone >= 2 && numOftwo >= 2) {
                int a = jieCheng(n) / (jieCheng(numOfone) + jieCheng(numOftwo));
                sum += a;
            } else {
                sum+=1;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(find(1));
        System.out.println(find(2));
        System.out.println(find(3));
        System.out.println(find(4));
        System.out.println(find(5));
        System.out.println(find(6));
        System.out.println(find(7));
        System.out.println(find(8));

    }
}
