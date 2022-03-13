package misc;

import java.util.Scanner;

public class TestMisc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, i;
        int[] z = new int[10];
        i = 0;
        while(true) {
            x = in.nextInt();
            System.out.println("x is: " + x);

            y = in.nextInt();
            System.out.println("y is: " + y);

            z[i] = x/y + x * y;
            System.out.println("array is: " + z[i]);

            if(y == 0)
                break;
            i++;
            System.out.println("i is: " +  i);
        }
        in.close();
    }
}
