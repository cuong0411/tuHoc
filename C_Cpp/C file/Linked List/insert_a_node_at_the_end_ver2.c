#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *link;
};

struct node* add_at_end(struct node *ptr, int data);

int main()
{
    struct node *head = (struct node*)malloc(sizeof(struct node));

    // first node
    head->data = 1;
    head->link = NULL;

    struct node *ptr = head;
    
    ptr = add_at_end(ptr, 2);
    ptr = add_at_end(ptr, 3);
    ptr = add_at_end(ptr, 4);

    ptr = head;
    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->link;
    }

    return 0;
}
struct node* add_at_end(struct node *ptr, int data)
{
    struct node *temp = (struct node*)malloc(sizeof(struct node));
    temp->data = data;
    temp->link = NULL;

    ptr->link = temp;
    return temp;
}