#include <stdio.h>

int main(void)
{
    const int NUM = 10;
    int height;
    do
    {
        printf("Height: ");
        scanf("%i", &height);
    }
    while (height <= 0);
    for (int i = 1; i <= height; i++)
    {
        for (int j = 1; j <= height; j++)
        {
            if (j <= i)
            {
                printf("#");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }

    return 0;
}