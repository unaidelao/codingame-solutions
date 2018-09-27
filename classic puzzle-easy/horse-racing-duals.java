import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        int[] strengths = new int[N];
        
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            strengths[i] = pi;
        }
        
        Arrays.sort(strengths);
        
        // Print solution
        System.out.println(minDifference(strengths));
    }
    
    public static int minDifference(int[] arr) {
        int minValue = 10000000;
        for(int i = 1; i < arr.length; i++) {
            if(Math.abs(arr[i] - arr[i-1]) < minValue) {
                minValue = Math.abs(arr[i] - arr[i-1]);
            }
        }
        return minValue;
    }
}