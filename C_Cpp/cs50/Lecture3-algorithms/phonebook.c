#include <stdio.h>
#include <string.h>

typedef struct
{
    char name[30];
    char number[30];
}
person;

int main(void)
{
    person people[2];
    strcpy(people[0].name, "Ana");
    strcpy(people[0].number, "+_84-124-234");

    strcpy(people[1].name, "Topson");
    strcpy(people[1].number, "+84-234-234");

    for (int i = 0; i < 2; i++)
    {
        if (strcmp(people[i].name, "Anaa") == 0)
        {
            printf("Found %s\n", people[i].name);
            return 0;
        }
    }
    printf("Not found\n");
    return 1;

}