// indirect recursion type

#include <stdio.h>

int i = 1;


void odd()
{
    if (i <= 10)
    {
        printf("%d ", i + 1);
        i++;
        even();
    }
    return;
}
void even()
{
    if (i <= 10)
    {
        printf("%d ", i - 1);
        i++;
        odd();
    }
    return;
}
int main()
{
    odd();
    return 0;
}