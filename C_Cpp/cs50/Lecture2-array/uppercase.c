#include <stdio.h>
#include <string.h>
#include <ctype.h> // for islower, toupper

int main()
{
    const int MAX = 30;
    printf("Before: ");
    char s[MAX];
    fgets(s, MAX, stdin);
    for (int i = 0, n = strlen(s); i < n; i++)
    {
        /*
        // if (s[i] >= 'a' && s[i] <= 'z')
        if (islower(s[i]) != 0)
        {
            // printf("%c", s[i] -32);
            printf("%c", toupper(s[i]));
        }
        else
        {
            printf("%c", s[i]);
        }
        */

       // Better
       printf("%c", toupper(s[i]));
    }
    printf("\n");
}