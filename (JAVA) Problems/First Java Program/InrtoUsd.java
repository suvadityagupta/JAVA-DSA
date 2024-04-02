//Input currency in rupees and output in USD.
import java.util.Scanner;
public class InrtoUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount in INR: ");
        double amountInr = in.nextDouble();
        double exchangeRate = 0.013;
        double amountUsd = amountInr * exchangeRate;
        System.out.println("Equivalent amount in USD: " + amountUsd);
    }
}
