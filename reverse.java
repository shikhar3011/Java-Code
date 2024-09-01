import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int revnum=0;
        int dig=0;
        while (num>0) {
            dig=num%10;
            revnum=revnum*10+dig;
            num=num/10;
        }
        System.out.println(revnum);
    }
}
