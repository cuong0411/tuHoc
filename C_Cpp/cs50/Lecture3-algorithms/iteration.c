#include <stdio.h>
#include <string.h>

void draw(int height);

int main(void)
{
    int height;
    printf("Enter a height: ");
    scanf("%d", &height);

    // // #1
    // for (int i = 0; i < height; i++)
    // {
    //     for (int j = 0; j <= i; j++)
    //     {
    //         printf("#");
    //     }
    //     printf("\n");
    // }

    // #2
    for (int i = 1; i <= height; i++)
    {
        draw(i);
    }
}
void draw(int height)
{
    for (int i = 1; i <= height; i++)
    {
        printf("#");
    }
    printf("\n");
}