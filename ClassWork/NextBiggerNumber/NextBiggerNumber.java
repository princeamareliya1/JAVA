import java.util.Scanner;
class NextBigger{
    public int Number(int n){
        int a,l,c=0,n1=0;
        a=n%10;
        l=n%10;
        while(l<=a){
            a=n%10;
            n1=n1*10+a;
            n /= 10;
            c++;
        }
        n = n*10 +l;
        n = n*10 + a;
        c -= 2;
        n1 /= 10;
        int fact=1;
        for(int i=1;i<=c;i++){
            fact *= 10;
        }
        n = n*fact + (n1%fact);
        return n;
    }
}
public class NextBiggerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        NextBigger s = new NextBigger();
        int result = s.Number(n);
        System.out.println("Result = "+result);
        sc.close();
    }
}