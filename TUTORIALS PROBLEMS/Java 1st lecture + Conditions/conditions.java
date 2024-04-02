//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Input a salary. If the salary is greater than 10000 then add bonus of 2000  otherwise give a bonus of 1000
*/
public class conditions {
    public static void main(String[] args) {
        /*
        Syntax of if statement:
        if (boolean expression T or F) {
        // body
        } else {
        // do this
        }
         */
        int salary = 25000;
        if (salary > 10000){
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}