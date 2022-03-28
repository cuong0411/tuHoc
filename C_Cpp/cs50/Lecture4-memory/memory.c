#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int *x = malloc(3 * sizeof(int));
    x[0] = 62;
    x[1] = 65;
    x[2] = 234;
    free(x);
}