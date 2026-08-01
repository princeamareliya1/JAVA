import java.util.Scanner;
class Answer{
    int fsum=0;
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        StringBuilder fs = new StringBuilder();
        String temp;
        if(a.length()<b.length()){
            temp = a;
            a = b;
            b = temp;
        }
        for(int i=1;i<=b.length();i++){
            s.append(funA(a.charAt(a.length()-i),b.charAt(b.length()-i)));
        }
        if(a.length()!=b.length()){
            int i=a.length() - b.length() - 1;
            while(i>=0){
                s.append(funA(a.charAt(i),'0'));
                i--;
            }
        }
        while(fsum!=0){
            s.append(funA('0','0'));
        }
        for(int i=s.length()-1;i>=0;i--){
            fs.append(s.charAt(i));
        }
        return fs.toString();

    }
    public char funA(char a,char b){
        int ia = Character.getNumericValue(a);
        int ib = Character.getNumericValue(b);
        int sum = fsum + ia + ib;
        fsum = sum / 2;
        return (char)((sum%2) + '0');
    }
}
public class AddBinaryNumber {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a StringA:");
        String a = sc.next();
        System.out.print("Enter a StringB:");
        String b = sc.next();
        Answer s = new Answer();
        String c = s.addBinary(a,b);
        System.out.println("String C = "+c);
        sc.close();
    }
}