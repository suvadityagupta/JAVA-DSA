import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
//        int n = 234567;
//        int ans = 0;
//        while( n > 0){
//            int rem = n % 10;
//            n = n /10;
//            ans = ans * 10 + rem;
//        }
    Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
    int n = in.nextInt();
    int ans = 0;
    while (n > 0){
        int rem = n % 10;
        n = n / 10;
        ans = ans * 10 + rem;
    }
        System.out.println("The reverse number will be: " + ans);
    }
}
