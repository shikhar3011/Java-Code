import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;int b=1;
        for (int i = 2; i <= n; i++) {
            int temp = a;
            a=b;
            b+=temp;
        }
        System.out.println(b);
    }
}
