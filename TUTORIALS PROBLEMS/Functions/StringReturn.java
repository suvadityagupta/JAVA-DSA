import java.util.Scanner;

public class StringReturn {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = in.next();
        String message = myGreet(name);
        System.out.println(message);


    }
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "How are you" ;
        return greeting;
    }
}
