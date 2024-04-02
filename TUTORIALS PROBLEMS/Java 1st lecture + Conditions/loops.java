public class loops {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        /*
        For Loop Syntax
        for (initialisation; condition; increment/decrement){
        // body
        }
         */
        // Q : Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 1) {
//            System.out.println(num);
//        }
        // While loops
       /* Syntax - while(condition) {
        // body
    }
    */
    // for (int num = 1; num <= 5; num += 1) {
        //            System.out.println(num);
        //}

        int num = 1;
        while( num <=5){
            System.out.println(num);
            num +=1;
        }

        // do while loop
        /*
            do {
            //body
            } while(condition);
         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while(n<=5);
    }
}


