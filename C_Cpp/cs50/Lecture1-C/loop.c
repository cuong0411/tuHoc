#include <stdio.h>

void meow(int n);

int main(void)
{
    meow(4);
}

void meow(int n)
{
    for (int i = 0; i <= n; i++)
    {
        printf("mewo\n");
    }
    
}