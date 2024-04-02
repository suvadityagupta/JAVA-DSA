import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
//        System.out.println("Enter a fruit name: ");
//       String fruit = in.next();
//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("Laal fruit");
//            case "banana" -> System.out.println("Yellow fruit");
//            default -> System.out.println("Kichu to de re bhai");
 //       }
        //USE OF NOT USING BREAK
        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Week days");
            case 6, 7 -> System.out.println("Week days");
        }
    }
}
