import java.util.Scanner;
class Solution{
    public int Occurance(int D,int L,int R){
        int count=0,temp,a;
        for(int i=L;i<=R;i++){
            temp = i;
            while(temp!=0){
                a = temp%10;
                if(D==a){
                    count++;
                }
                temp /= 10;
            }
        }
        return count;
    }
}
public class CountOccuraceOfDigitInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Digit: ");
        int D = sc.nextInt();
        System.out.print("Enter a starting point of Range: ");
        int L = sc.nextInt();
        System.out.print("Enter a ending point of Range: ");
        int R = sc.nextInt();
        Solution s = new Solution();
        int count = s.Occurance(D, L, R);
        System.out.println("Count = "+count);
        sc.close();
    }
}