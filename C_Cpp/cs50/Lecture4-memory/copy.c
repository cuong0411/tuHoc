#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

int main(void)
{
    char *s = "topson";
    char *t = malloc(strlen(s) + 1); //null character at the end
    strcpy(t, s);
    t[0] = toupper(t[0]);
    printf("s = %s\n", s);
    printf("t = %s\n", t);
    free(t);
}