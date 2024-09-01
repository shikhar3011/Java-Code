public class armstrong {
    public static void main(String[] args) {
        int num=153;
        boolean ans=isarmstrong(num);
        System.out.println(ans);
        // System.out.println(isarmstrong(num));
    }
    static boolean isarmstrong(int num){
        int dig=0; int armnum=0; int original=num;
        while (num>0) {
            dig=num%10;
            armnum=armnum+dig*dig*dig;
            num=num/10;
        }
        return(armnum==original);
    }
}
