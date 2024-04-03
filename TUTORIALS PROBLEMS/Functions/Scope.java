public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Argha";
        {
            // int a = 100; //already intialised outside the block in the same method, hence I cannot initialize again.
            a = 100; // Reassing the origin ref variavle to some other value
            System.out.println(a);
            int c = 99;
            name = "Rahul";
            System.out.println(name);
            //values initialised in this block, will remain in this block.

    }
    int c = 900;
        System.out.println(a);
        System.out.println(name);
        // System.out.println(c); // cannot use outside the block
        //scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
            a = 1000;
        }
        System.out.println();
}

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }

}
