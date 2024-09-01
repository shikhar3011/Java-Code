public class sieve {
    public static void main(String[] args) {
        sieve_(40);
    }
    static void sieve_(int n){
        boolean prime[]=new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            prime[i]=true;
        }
        for (int i = 2; i*i<=n; i++) {
            if (prime[i]==true) {
                for (int j = i*i; j < n; j+=i) {
                    prime[j]=false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (prime[i]==true) {
                System.out.println(i);
            }
        }
    }
}
