// this code valid upto n = 12

import java.util.Scanner;
class Solution172{
    int fact(int n){
        if(n>=1) return n*fact(n-1);
        else return 1;
    }
    public int trailingZeroes(int n) {
        if(n==0){
            return 0;
        }
        int f = fact(n);
        int c0 = 0,a;
        while(true){
            a = f%10;
            if(a!=0){
                break;
            }
            c0++;
            f /= 10;
        }
        return c0;
    }
}
public class FactorialTrailingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        Solution172 s = new Solution172();
        int result = s.trailingZeroes(n);
        System.out.println("Result = "+result);
        sc.close();
    }
}