#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *link;
};

int main()
{
    // no need for typecasting, althought it is a good practice
    struct node *head = malloc(sizeof(struct node));
    if (head == NULL)
    {
        exit(0);
    }
    head->data = 45;
    head->link = NULL;

    // second node
    struct node *second = malloc(sizeof(struct node));
    if (second == NULL)
    {
        exit(0);
    }
    second->data = 50;
    second->link = NULL;

    head->link = second;

    

    return 0;
}