// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class CalculateOp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("Enter two numbers: ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();

                if (op == '+') {
                    ans = n1 + n2;
                }
                if (op == '-') {
                    ans = n1 - n2;
                }
                if (op == '*') {
                    ans = n1 * n2;
                }
                if (op == '/') {
                    if (n2 != 0) {
                        ans = n1 / n2;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}


