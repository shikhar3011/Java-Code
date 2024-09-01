public class sumofdig {
    public static void main(String[] args) {
        int num=675;
        System.out.println(sum(num));
    }
    static int sum(int n){
        int sum=0;int dig=0;
        while (n>0) {
            dig=n%10;
            sum+=dig;
            n/=10;
        }
        return sum;
    }
}
