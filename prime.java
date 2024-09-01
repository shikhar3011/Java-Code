public class prime {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            boolean a=isprime(i);
            System.out.println(i+" "+a);
        }
    }
    static boolean isprime(int n){
        if (n<=1) {
            return false;
        }
        int i =2;
        while (i*i<=n) {
            if (n%i==0) {
                return false;
            }
            i++;
        }
        return true;    }
}
