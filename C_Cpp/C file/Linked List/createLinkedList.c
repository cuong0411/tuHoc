#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *link;
};

struct node* nodeCreate(int data);
void add_at_end_ver2(struct node *head, int data);
struct node* linkedListCreate();
void printLinkedList(struct node *head);

int main()
{
    struct node *head = linkedListCreate();
    printLinkedList(head);

    // insert a node at the beginning
    struct node *a = nodeCreate(100);
    a->link = head;
    head = a;
    printLinkedList(head);

    return 0;
}
struct node* nodeCreate(int data)
{
    struct node* n = (struct node*)malloc(sizeof(struct node));
    n->data = data;
    n->link = NULL;

    return n;
}
void add_at_end_ver2(struct node *head, int data)
{
    struct node *temp = nodeCreate(data);

    struct node *n;
    for (n = head; n->link != NULL; n = n->link) {}
    n->link = temp;
}
struct node* linkedListCreate()
{
    int a;
    do
    {
        printf("Nhap so luong node: ");
        scanf("%d", &a);
    } while (a <= 0);

    struct node *head = (struct node*)malloc(sizeof(struct node));
    head = NULL;

    for (int i = 0; i < a; i++)
    {
        int data;
        printf("Nhap data cho node: ");
        scanf("%d", &data);

        if (head == NULL)
        {
            head = nodeCreate(data);
        }
        else
        {
            add_at_end_ver2(head, data);
        }
    }
    return head;
}
void printLinkedList(struct node *head)
{
    for (struct node *n = head; n != NULL; n = n->link)
    {
        printf("%d ", n->data);
    }
}