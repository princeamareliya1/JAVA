import java.util.Scanner;
class NextBiggerPro{
    public int Number(int n) {
        char[] arr = String.valueOf(n).toCharArray();

        // Step 1: Find pivot
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // No bigger number possible
        if (i < 0) {
            return -1;
        }

        // Step 2: Find next greater element
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Step 3: Swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Step 4: Reverse remaining part
        int left = i + 1;
        int right = arr.length - 1;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return Integer.parseInt(new String(arr));
    }
}

public class NextBiggerNumberPro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        NextBiggerPro s = new NextBiggerPro();
        int ans = s.Number(n);

        if (ans == -1)
            System.out.println("No Bigger Number Possible");
        else
            System.out.println("Result = " + ans);

        sc.close();
    }
}