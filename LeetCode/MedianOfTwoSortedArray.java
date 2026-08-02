import java.util.Scanner;
class Solution4 {
    public int[] add(int[] a,int[] b){
        int[] result = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            result[i] = a[i];
        }
        for(int i=a.length;i<a.length+b.length;i++){
            result[i] = b[i-a.length];
        }
        return result;
    }
    public int[] sort(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i = -1;
            }
        }
        return arr;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];
        if(nums1.length>=nums2.length){
            result = add(nums1,nums2);
            
        }else{
            result = add(nums2,nums1);
        }
        result = sort(result);
        double median;
        int n=result.length;
        if(n%2==0){
            median = (result[(n/2)-1]+result[(n/2)])/(double)2; 
        }else{
            median = result[(n/2)];
        }
        return median;
    }
}
public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of Array1: ");
        int a1 = sc.nextInt();
        int[] a = new int[a1];
        for(int i=0;i<a1;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter a Size of Array2: ");
        int b1 = sc.nextInt();
        int[] b = new int[b1];
        for(int i=0;i<b1;i++){
            b[i] = sc.nextInt();
        }
        Solution4 s = new Solution4();
        double median = s.findMedianSortedArrays(a, b);
        System.out.println("Median = "+median);
        sc.close();
    }
}
