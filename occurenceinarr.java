import java.util.Scanner;
public class occurenceinarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        System.out.println(occurence(arr,5));
    }
    static int occurence(int[] arr,int n){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
                count++;
            }
        }
        return count;
    }
}
