import java.util.Scanner;
class Solution70{
    public int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f *= i;
        }
        return f;
    }
    public int climbStairs(int n) {
        int n1=n,n2=0,ways=0;
        int num=1,den=1;
        for(int i=1;i<=(n/2)+1;i++){
            num = fact(n1+n2);
            den = fact(n1)*fact(n2);
            ways += (num)/(den);
            n1 -= 2;
            n2 += 1;
        }
        return ways;
    }
}
public class ClimbingStairs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Stairs: ");
        int n = sc.nextInt();
        Solution70 s70 = new Solution70();
        int ways = s70.climbStairs(n);
        System.out.println("Total Ways = "+ways);
        sc.close();
    }
}
