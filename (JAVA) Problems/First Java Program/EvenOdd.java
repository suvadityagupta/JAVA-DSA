// Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check its odd or even: ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else{
            System.out.println("The number is odd");
        }

    }
}
