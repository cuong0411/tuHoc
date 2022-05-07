#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void add_beginning(struct node **head, int data);

int main()
{
    struct node *head = (struct node*)malloc(sizeof(struct node));
    head->data = 45;
    head->next = NULL;

    struct node *ptr = (struct node*)malloc(sizeof(struct node));
    ptr->data = 10;
    ptr->next = NULL;

    head->next = ptr;

    add_beginning(&head, 99);

    for (struct node *n = head; n != NULL; n = n->next)
    {
        printf("%d ", n->data);
    }

    return 0;
}
void add_beginning(struct node **head, int data)
{
    struct node *ptr = (struct node*)malloc(sizeof(struct node));
    ptr->data = data;
    ptr->next = NULL;

    ptr->next = *head;
    *head = ptr;
}