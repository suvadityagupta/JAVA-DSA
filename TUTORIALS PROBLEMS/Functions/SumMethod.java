import java.util.Scanner;
public class SumMethod {
    public static void main(String[] args) {
        sum();

    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter Num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    /* Access modifies (we will look in oops) return_type name () {
    // body
    return statement;
     */
}

