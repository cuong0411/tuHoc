#include <stdio.h>
#include <string.h>

int main(void)
{
    char name[] = "Cuong";
    int length = strlen(name);
    printf("%i\n", length);
    size_t size = sizeof(name);
    printf("%zu bytes (1 char == 1 byte)", size);
}