//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class LargestTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(num1>num2){
            System.out.println("Number " + num1 + " is the largest");
        }else{
            System.out.println("Number " + num2 + " is the largest");
        }
    }
}
