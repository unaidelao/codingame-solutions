#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
int main()
{
    int lightX; // the X position of the light of power
    int lightY; // the Y position of the light of power
    int initialTX; // Thor's starting X position
    int initialTY; // Thor's starting Y position
    scanf("%d%d%d%d", &lightX, &lightY, &initialTX, &initialTY);

    int currentX;
    int currentY;
    currentX = initialTX;
    currentY = initialTY;

    // game loop
    while (1) {
        int remainingTurns; // The remaining amount of turns Thor can move. Do not remove this line.
        scanf("%d", &remainingTurns);

        if (currentX > lightX && currentY > lightY)
        {
            printf("NW\n");
            currentX -= 1;
            currentY -= 1;
        }

        else if (currentX > lightX && currentY < lightY)
        {
            printf("SW\n");
            currentX -= 1;
            currentY += 1;
        }

        else if (currentX < lightX && currentY < lightY)
        {
            printf("SE\n");
            currentX += 1;
            currentY += 1;
        }

        else if (currentX < lightX && currentY > lightY)
        {
            printf("NE\n");
            currentX += 1;
            currentY -= 1;
        }

        else if (currentX > lightX)
        {
            printf("W\n");
            currentX -= 1;
        }

        else if (currentX < lightX)
        {
            printf("E\n");
            currentX += 1;
        }

        else if (currentY > lightY)
        {
            printf("N\n");
            currentY -= 1;
        }

        else if (currentY < lightY)
        {
            printf("S\n");
            currentY += 1;
        }
    }

    return 0;
}
