import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     char  ch = in.next().trim().charAt(0); // here .trim is used to extra spaces from the words
//     here the char is transferred to integer type. for reference check type casting tutorial
        if(ch  >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }

}



