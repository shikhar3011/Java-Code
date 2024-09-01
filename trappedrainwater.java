import java.util.Arrays;

public class trappedrainwater {
    public static void main(String[] args) {
        int[] height={4,2,0,6,3,2,5};
        // int[] height={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapper rainwater = "+trapwater2(height));
    }
    static int trapwater(int[] height){
        int n=height.length;
        int[] left=new int[n];
        left[0]=height[0];
        for (int i = 1; i < n; i++) {
            left[i]=Math.max(height[i], left[i-1]);
        }
        int[] right=new int[n];
        right[n-1]=height[n-1];
        for (int i = n-2; i >= 0; i--) {
            right[i]=Math.max(height[i], right[i+1]);
        }
        int trappedwater=0;
        for (int i = 0; i < height.length; i++) {
            int level=Math.min(left[i], right[i]);
            trappedwater+=level-height[i];
        }
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        return trappedwater;
    }
    static int trapwater2(int[] height){
        int n=height.length;
        int[] left=new int[n];
        left[0]=height[0];
        for (int i = 1; i < n; i++) {
            left[i]=Math.max(height[i], left[i-1]);
        }
        int[] right=new int[n];
        right[n-1]=height[n-1];
        for (int i = n-2; i >= 0; i--) {
            right[i]=Math.max(height[i], right[i+1]);
        }
        int ans=0;
        for (int i = 0; i < height.length; i++) {
            ans+=Math.min(left[i],right[i])-height[i];
        }
        return ans;
    }
}
