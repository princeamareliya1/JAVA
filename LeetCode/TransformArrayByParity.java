import java.util.Scanner;
class Solution {
    public int[] transformArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]%2;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                nums[i]=0;
                nums[i+1]=1;
                i=-1;
            }
        }
        return nums;
    }
}
public class TransformArrayByParity{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size:");
        int n = sc.nextInt();
        int[] nums = new int[n]; 
        for(int i=0;i<n;i++){
            System.out.print("Enter a Element: ");
            nums[i] = sc.nextInt();
        }
        Solution s = new Solution();
        nums = s.transformArray(nums);
        for(int i=0;i<n;i++){
            System.err.print(nums[i]+" ");
        }
        sc.close();
    }
}