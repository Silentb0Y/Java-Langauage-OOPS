import java.io.*;
import java.util.*;

class calculator {
    // static int cal(int a , int b,int c){
    // int z;
    // switch(c){
    // case '+' -> z = a +b;
    // case '-' -> z = a - b;
    // case '*' -> z = a*b;
    // case '/' -> z = a/b;
    // }
    // return z; //// using this method getting errow while returning the value
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();
        System.out.println("Enter the operator (+,-,*,/):");
        char op = sc.next().charAt(0);
        // int z = cal(a, b, op); want to create using the method but the issue occuring
        // that retrun z is not initalizes
        int cal;
        if (op == '+') {
            cal = a + b;
        } else if (op == '-') {
            cal = a - b;
        } else if (op == '*') {
            cal = a * b;
        } else {
            cal = 0;
        }

        System.out.println("Result is : " + "opeator" + op + " " + cal);
    }
}
