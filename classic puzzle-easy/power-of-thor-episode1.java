import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        
        int currentX;
        int currentY;
        currentX = initialTX;
        currentY = initialTY;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            if (currentX > lightX && currentY > lightY) {
                System.out.println("NW");
                currentX -= 1;
                currentY -= 1;
            }
            else if (currentX > lightX && currentY < lightY) {
                System.out.println("SW");
                currentX -= 1;
                currentY += 1;
            }
            else if (currentX < lightX && currentY < lightY) {
                System.out.println("SE");
                currentX += 1;
                currentY += 1;
            }
            else if (currentX < lightX && currentY > lightY) {
                System.out.println("NE");
                currentX += 1;
                currentY -= 1;
            }
            else if (currentX > lightX) {
                System.out.println("W");
                currentX -= 1;
            }
            else if (currentX < lightX) {
                System.out.println("E");
                currentX += 1;
            }
            else if (currentY > lightY) {
                System.out.println("N");
                currentY -= 1;
            }
            else if (currentY < lightY) {
                System.out.println("S");
                currentY += 1;
            }
        }
    }
}