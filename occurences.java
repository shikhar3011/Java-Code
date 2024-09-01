import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the number whose count you need to calculate");
        int key=sc.nextInt();
        int count=0;
        while (n>0) {
            if (n%10==key) {
                count++;
                n=n/10;
            }
            else{
                n=n/10;
            }
        }
        System.out.println("Count = "+count);
    }
}
