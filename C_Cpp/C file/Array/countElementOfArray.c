#include <stdio.h>

int main()
{
    int arr[] = {1, 2, 3};
    int n;
    n = sizeof(arr) / sizeof(int);

    printf("%d", n);

    return 0;
}