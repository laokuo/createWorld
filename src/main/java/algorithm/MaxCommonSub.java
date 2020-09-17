package algorithm;

public class MaxCommonSub {
    int a;
    public void find(String a, String b) {
        int[][] record = new int[a.length()+1][b.length()+1];

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i)==b.charAt(j)) {

                }
            }
        }
    }

    @Override
    public String toString() {
        return "MaxCommonSub{" +
                "a=" + a +
                '}';
    }

    public static void main(String[] args) {
        MaxCommonSub maxCommonSub = new MaxCommonSub();
        System.out.println(maxCommonSub.toString());
    }
}
