import java.util.Scanner;
public class NestedCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();
//        switch(empId){
//            case 1:
//                System.out.println("Argha");
//                break;
//            case 2:
//                System.out.println("Ayan");
//                break;
//            case 3:
//                System.out.println("Employee number 3");
//                switch(department) {
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    default:
//                        System.out.println("No department");
//                }
//                break;
//            default:
//                System.out.println("R keo nei");
//        }
        // Enhanced Switch
        switch (empId) {
            case 1 -> System.out.println("Argha");
            case 2 -> System.out.println("Ayan");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("R keo nei");
        }

    }
}
