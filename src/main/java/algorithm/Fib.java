package algorithm;

public class Fib {
    public int Fibra(int n) {
        if (n<1) return -1;
        int[] fib = new int[n+1];
        fib[1] = 1;
        fib[2]=1;
        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        Fib fib = new Fib();
        System.out.println(fib.Fibra(4));
    }
}
