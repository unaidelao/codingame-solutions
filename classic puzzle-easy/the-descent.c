#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
int main()
{

    // game loop
    while (1)
    {
        int highest_mountain = 0;
        int highest_mountain_index = 0;

        for (int i = 0; i < 8; i++)
        {
            int mountain_height;
            scanf("%d", &mountain_height);
            fflush(stdin);

            if (mountain_height > highest_mountain)
            {
                highest_mountain_index = i;
                highest_mountain = mountain_height;
            }
        }

        // Write an action using printf(). DON'T FORGET THE TRAILING \n
        // To debug: fprintf(stderr, "Debug messages...\n");

        printf("%d\n", highest_mountain_index); // The index of the mountain to fire on.
    }

    return 0;
}
