import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three numbers ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        // Q. Find the largest number
        int max = a;
        if(b > max){
            max = b;
        }
        if( c > max){
            max = c;
        }
        System.out.println(max + " is the largest");
        }
}
