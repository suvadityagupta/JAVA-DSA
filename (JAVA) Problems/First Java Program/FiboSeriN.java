//To calculate Fibonacci Series up to n numbers.


//import java.util.Scanner;
//public class FiboSeriN {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int p = 0;
//        int i = 1;
//        int count = 0;
//        while(count <=n) {
//            int temp = i;
//            i = i + p;
//            p = temp;
//            count++;
//        }
//        System.out.println(p);
//    }
//}
import java.util.Scanner;

public class FiboSeriN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Printing Fibonacci series up to n terms
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

