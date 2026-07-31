import java.util.Scanner;
class OnBulbs{
    public int bulbSwitch(int n) {
        int[] arr = new int[n+1];
        int on = 0;
        // for ith round, toggle all bulbs which divisible by i
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                    arr[j] = (arr[j] == 0) ? 1 : 0;
                    on = (arr[j]==0) ? on-1 : on+1;
            }
        }
        return on;
    }
}
public class BulbSwitcher{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of Bulbs: ");
        int n = sc.nextInt();
        OnBulbs b = new OnBulbs();
        n = b.bulbSwitch(n);
        System.out.println("On Bulbs = "+n);
        sc.close();
    }
}