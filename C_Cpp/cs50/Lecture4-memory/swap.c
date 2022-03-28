#include <stdio.h>


void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}
int main(void)
{
    int a = 1;
    int b = 2;
    printf("a = %i, b = %i\n", a, b);
    swap(&a, &b);
    printf("a = %i, b = %i\n", a, b);
}