#include <stdio.h>
#include <stdlib.h>

typedef struct node
{
    int data;
    struct node *link;
}
node;

int main()
{
    node *list = NULL;
    node *n;

    // malloc return a pointer
    n = (node*)malloc(sizeof(node));

    if (n == NULL)
    {
        return 1;
    }

    n->data = 1;
    n->link = NULL;

    list = n;

    // add a number to list
    n = (node*)malloc(sizeof(node));
    if (n == NULL)
    {
        return 1;
    }
    n->data = 2;
    n->link = NULL;
    list->link = n;

    // print numbers
    for (node *tmp = list; tmp != NULL; tmp = tmp->link)
    {
        printf("%d\n", tmp->data);
    }

    // free list
    while (list != NULL)
    {
        node *tmp = list->link;
        free(list);
        list = tmp;
    }



    return 0;
}