#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *link;
};

void add_at_end(struct node *head, int data);
void add_at_end_ver2(struct node *head, int data);

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

    // insert a node at the end
    // add_at_end(head, 1);
    add_at_end_ver2(head, 1);

    // print linked list
    for (struct node *n = head; n != NULL; n = n->link)
    {
        printf("%d ", n->data);
    }


    return 0;
}
void add_at_end(struct node *head, int data)
{
    struct node *ptr, *tmp;
    ptr = head;
    tmp = (struct node *)malloc(sizeof(struct node));

    tmp->data = data;
    tmp->link = NULL;

    while (ptr->link != NULL)
    {
        ptr = ptr->link;
    }
    ptr->link = tmp;
}
void add_at_end_ver2(struct node *head, int data)
{
    struct node *temp;
    temp = (struct node*)malloc(sizeof(struct node));
    temp->data = data;
    temp->link = NULL;

    struct node *n;
    for (n = head; n != NULL; n = n->link)
    {
    }
    n = temp;
}