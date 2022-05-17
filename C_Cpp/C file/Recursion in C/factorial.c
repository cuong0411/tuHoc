// Calculate the factorial of a number

#include <stdio.h>

int factorialFunc(int a)
{
    // if (a == 1)
    // {
    //     return 1;
    // }
    // else
    // {
    //     return a * factorialFunc(a - 1);
    // }
    return a == 1 ? 1 : a * factorialFunc(a - 1);
}

int main()
{
    int a = 5;
    printf("%d", factorialFunc(a));
}