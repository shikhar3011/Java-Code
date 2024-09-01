import java.util.Arrays;

public class lc66 {
    public static void main(String[] args) {
        int digits[]={9};
        System.out.println(Arrays.toString(lcode66(digits)));
        // System.out.println(lcode66(digits));
    }
    static int[] lcode66(int digits[]){
        String str="";
        for (int i = 0; i < digits.length; i++) {
            str+=digits[i];
        }
        int num1=Integer.parseInt(str);
        num1=num1+1;
        String str2=String.valueOf(num1);
        int ans[]=new int[str2.length()];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=Character.getNumericValue(str2.charAt(i));
        }
        return ans;
    }
}
