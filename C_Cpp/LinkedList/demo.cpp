#include <stdio.h>
#include <stdlib.h>

// tao node
typedef struct node
{
    int data;
    struct node *next;
}
node;

// tao danh sach lien ket
typedef struct list
{
    node *head;
    node *tail;
}
list;


// function prototype
node *taoNode(int x);
void taoList(list &l);
void themDau(list &l, node *new_element);
void themCuoi(list &l, node *new_element);
void nhapDS(list &l);
void xuatDS(list l);
int timGiaTriTheoK(list l, int key);

// main
int main()
{
    list ds;
    nhapDS(ds);
    xuatDS(ds);

    int k;
    printf("\nNhap gia tri k: ");
    scanf("%d", &k);
    int value = timGiaTriTheoK(ds, k);
    if (value != 0)
    {
        printf("\nGia tri tai vi tri thu %d la: %d", k, value);
    }
    else
    {
        printf("\nKhong ton tai vi tri thu %d trong danh sach", k);
    }

    return 0;
}

node *taoNode(int x)
{
    // node *n = new node;
    node *n = (node*)malloc(sizeof(node));

    // if malloc return NULL pointer
    if (n == NULL)
    {
        printf("khong cap phat duoc vung nho.");
        exit(0);
    }

    // tao node
    n->data = x;
    n->next = NULL;

    return n;
}
void taoList(list &l)
{
    l.head = NULL;
    l.tail = NULL;
}
void themDau(list &l, node *new_element)
{
    // danh sach rong
    if (l.head == NULL)
    {
        l.head = new_element;
        l.tail = l.head;
    }
    // danh sach da co node
    else
    {
        new_element->next = l.head;
        l.head = new_element;
    }
}
void themCuoi(list &l, node *new_element)
{
    if (l.head == NULL)
    {
        l.head = new_element;
        l.tail = l.head;
    }
    else
    {
        l.tail->next = new_element;
        l.tail = new_element;
    }
}
void nhapDS(list &l)
{
    taoList(l);
    node *n;
    int x;

    do
    {
        printf("Nhap gia tri cho node. Phan 0 de dung: ");
        scanf("%d", &x);
        if (x == 0)
        {
            break;
        }
        n = taoNode(x);
        themCuoi(l, n);
    } while(1);   
}
void xuatDS(list l)
{
    for (node *n = l.head; n != NULL; n = n->next)
    {
        printf("%5d", n->data);
    }
}
int timGiaTriTheoK(list l, int key)
{
    int k;
    node *n;
    for (k = 0, n = l.head; n != NULL; k++, n = n->next)
    {
        if (k == key)
        {
            return n->data;
        }
    }
    return 0;
}