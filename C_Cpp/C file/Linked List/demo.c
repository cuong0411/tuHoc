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
    struct node *current = malloc(sizeof(struct node));
    if (current == NULL)
    {
        exit(0);
    }
    current->data = 50;
    current->link = NULL;

    head->link = current;

    // third node
    current = malloc(sizeof(struct node));
    current->data = 99;
    current->link = NULL;

    head->link->link = current;

    return 0;
}