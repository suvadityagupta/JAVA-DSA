import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
//      int n = 45535;
//
//      int count = 0;
//      while(n>0){
//          int rem = n % 10;
//          if (rem == 5) {
//              count ++;
//          }
//          n = n/10;
//      }

     /* ■Counting occurrence :-
        “ Input two numbers, find that hoe many times second number digit is present in first number”
        Ex :- first number = 14458 Second number = 4
        Output = 2, because 4 is present 2 times in first number. */


        Scanner in = new Scanner(System.in);
        int count = 0;
        int n = in.nextInt(); // n is the 1st number
        int r = in.nextInt(); // r is the 2nd number
        while( n > 0 ){
            int rem = n % 10; // rem is the remainder
            if (rem == r){
                count ++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
