/**
 * Created by davis on 4/15/15.
 */

import java.util.Scanner;
import comp102x.IO;

//...


public class Lab02 {

    public static void multiply() {
        // The scanner bit is std java.  The IO.InputInteger routines are
        // from the class jar file.
        //Scanner in = new Scanner(System.in);
        // Please write your code after this line
        System.out.println("multiply"); // Display the string.
        System.out.println("Enter an integer, x: "); // Display the string.
        int x = IO.inputInteger();
        //int x = in.nextInt();
        System.out.println("Enter an integer, y: "); // Display the string.
        int y = IO.inputInteger();
        //int y = in.nextInt();
        System.out.println("Answer =  " + x*y); // Display the string.


    }

    public static void calculateTriangleArea() {
        // Please write your code after this line

        System.out.println("Enter the width of the triangle: "); // Display the string.
        double w = IO.inputInteger();
        System.out.println("Enter the width of the triangle: "); // Display the string.
        double h = IO.inputInteger();
        System.out.println("The triangle area =  " + 0.5*h*w); // Display the string.




    }

    public static void solveQuadraticEquation() {
        // Please write your code after this line
        double x;

        System.out.println("Enter a: "); // Display the string.
        double a = IO.inputInteger();
        System.out.println("Enter b: "); // Display the string.
        double b = IO.inputInteger();
        System.out.println("Enter c: "); // Display the string.
        double c = IO.inputInteger();
        // x= (-b +- sqrt(b^2 - 4ac))/2a
        x = (-b + Math.sqrt((b*b)-(4.0*a*c)))/(2.0*a);
        System.out.printf("First solution for x =  %.2f\n", x); // Display the string.
        x = (-b - Math.sqrt((b*b)-(4.0*a*c)))/(2.0*a);
        System.out.printf("Second solution for x =  %.2f\n", x); // Display the string.




    }
    public static void main(String [] args) {

        Lab02 lab02 = new Lab02();

        System.out.println("Main"); // Display the string.
        //Lab02.multiply();
        //Lab02.calculateTriangleArea();
        Lab02.solveQuadraticEquation();
    }

}
