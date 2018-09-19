import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine(); // clean buffer
        String[] inputs = in.nextLine().split(" ");
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(inputs[i]); // a temperature expressed as an integer ranging from -273 to 5526
            
            // El primer número siempre será asignado a la variable result.
            if (i == 0) {
                result = t;
            }
            else {
                if (Math.abs(t) < Math.abs(result)) {
                    result = t;
                }
                else if (Math.abs(t) == Math.abs(result) && t > result) {
                    result = Math.abs(result);
                }
            }
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(result);
    }
}