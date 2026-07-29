import java.util.Scanner;
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        StringBuilder str = new StringBuilder();
        long sum1 = Long.parseLong(a,2);
        long sum2 = Long.parseLong(b,2);
        long sum = sum1 + sum2;
        if(sum==0){
            return "0";
        }
        while(sum!=0){
            if(sum%2==0){
                s.append('0');
            }
            else{
                s.append('1');
            }
            sum/=2;
        }
        for(int i=s.length()-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}
public class AddBinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String a: ");
        String a = sc.next();
        System.out.print("Enter a String b: ");
        String b = sc.next();
        Solution s = new Solution();
        String answer = s.addBinary(a, b);
        for(int i=0;i<answer.length();i++){
            System.out.print(answer.charAt(i));
        }
        sc.close();
    }
}