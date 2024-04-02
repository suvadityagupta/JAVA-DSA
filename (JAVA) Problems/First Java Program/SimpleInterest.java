//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal(P), time(T) and rate(R) : ");
        float P = in.nextInt();
        float R = in.nextInt();
        float T = in.nextInt();
        float SI = (P*R*T) / 100;
        System.out.println("Simple Interest will be " + SI);
    }
}
