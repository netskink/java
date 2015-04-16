/**
 * Created by davis on 4/15/15.
 */
public class Testy {
    public static void main(String [] args)
    {
        double x,y,z;

        System.out.println("Hello World!"); // Display the string.

        x = 3 % 4 - 10 * 5;
        y = 5 + 11/2 * 2.0;
        z = 100/1;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        int i = 1234567890;
        float f = i;
        int result = i - (int)f;
        System.out.println(result);

    }
}
