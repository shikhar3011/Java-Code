public class euclidgcd {
    public static void main(String[] args) {
        System.out.println(gcd(3,7));
    }
    static int gcd(int a,int b){
        if (a==0) {
            return b;       
        }   
        else{
            return gcd(b%a,a);
        }
    }
}
