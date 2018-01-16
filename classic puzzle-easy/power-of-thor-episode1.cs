using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player
{
    static void Main(string[] args)
    {
        string[] inputs = Console.ReadLine().Split(' ');
        int lightX = int.Parse(inputs[0]); // the X position of the light of power
        int lightY = int.Parse(inputs[1]); // the Y position of the light of power
        int initialTX = int.Parse(inputs[2]); // Thor's starting X position
        int initialTY = int.Parse(inputs[3]); // Thor's starting Y position

        int currentX;
        int currentY;
        currentX = initialTX;
        currentY = initialTY;

        // game loop
        while (true)
        {
            int remainingTurns = int.Parse(Console.ReadLine()); // The remaining amount of turns Thor can move. Do not remove this line.

            if (currentX > lightX && currentY > lightY)
            {
                Console.WriteLine("NW");
                currentX -= 1;
                currentY -= 1;
            }
            else if (currentX > lightX && currentY < lightY)
            {
                Console.WriteLine("SW");
                currentX -= 1;
                currentY += 1;
            }
            else if (currentX < lightX && currentY < lightY)
            {
                Console.WriteLine("SE");
                currentX += 1;
                currentY += 1;
            }
            else if (currentX < lightX && currentY > lightY)
            {
                Console.WriteLine("NE");
                currentX += 1;
                currentY -= 1;
            }
            else if (currentX > lightX)
            {
                Console.WriteLine("W");
                currentX -= 1;
            }
            else if (currentX < lightX)
            {
                Console.WriteLine("E");
                currentX += 1;
            }
            else if (currentY > lightY)
            {
                Console.WriteLine("N");
                currentY -= 1;
            }
            else if (currentY < lightY)
            {
                Console.WriteLine("S");
                currentY += 1;
            }
        }
        return;
    }
}
