import java.util.Scanner;

public class ParameteresMethod {
    public static void main(String[] args) {
//       int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20, 30);


    }
    // pass the value of numbers when you are calling the method in main()
    // return the value
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter Num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }


    /* Access modifies (we will look in oops) return_type name () {
    // body
    return statement;
     */
}
