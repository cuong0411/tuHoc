#include <stdio.h>
#include <stdlib.h>

// tao node
typedef struct node
{
    int data;
    struct node *next;
} node;

// tao danh sach lien ket
typedef struct list
{
    node *head;
    node *tail;
} list;

// function prototype
node *taoNode(int x);
void taoList(list &l);
void themDau(list &l, node *new_element);
void themCuoi(list &l, node *new_element);
void nhapDS(list &l);
void xuatDS(list l);
void insertAfter(list &l, int x, int y);
void insertBefore(list &l, int x, int y);
int timGiaTriTheoK(list l, int key);
void deleteNode(list &l, int x);

// main
int main()
{
    list ds;
    nhapDS(ds);
    xuatDS(ds);

    // int x, y;
    // printf("\nNhap gia tri x: ");
    // scanf("%d", &x);
    // printf("\nNhap gia tri y: ");
    // scanf("%d", &y);

    // insertAfter(ds, x, y);
    // printf("\nDanh sach sau khi duoc chen\n");
    // xuatDS(ds);

    // insertBefore(ds, x, y);
    // printf("\nDanh sach sau khi duoc chen\n");
    // xuatDS(ds);

    // // 8. cho biet gia tri cua node thu k (k bat dau tu 0)
    // int k;
    // do
    // {
    //     printf("\nNhap gia tri k: ");
    //     scanf("%d", &k);
    // } while(k < 0);

    // int value = timGiaTriTheoK(ds, k);
    // if (value != 0)
    // {
    //     printf("\nGia tri tai vi tri thu %d la: %d", k, value);
    // }
    // else
    // {
    //     printf("\nKhong ton tai vi tri thu %d trong danh sach", k);
    // }

    // 9. xoa 1 phan tu co khoa la x
    int x;
    do
    {
        printf("\nNhap x: ");
        scanf("%d", &x);
    } while (x < 0);
    deleteNode(ds, x);
    xuatDS(ds);

    return 0;
}

node *taoNode(int x)
{
    // node *n = new node;
    node *n = (node *)malloc(sizeof(node));

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
    } while (1);
}
void xuatDS(list l)
{
    for (node *n = l.head; n != NULL; n = n->next)
    {
        printf("%5d", n->data);
    }
}
void insertAfter(list &l, int x, int y)
{
    int flag = 0;
    // chen phan tu co gia tri y sau cac phan tu co gia tri x
    for (node *n = l.head; n != NULL; n = n->next)
    {
        if (n->data == x)
        {
            flag = 1;
            // node co gia tri x la node cuoi cung cua linked list
            if (n->next == NULL)
            {
                node *lastNode = taoNode(y);
                n->next = lastNode;
                l.tail = lastNode;
            }
            // node co gia tri x khong phai la node cuoi cung
            else
            {
                node *node_y = taoNode(y);
                node_y->next = n->next;
                n->next = node_y;
            }
        }
    }

    if (flag == 0)
    {
        printf("khong ton tao node co gia tri %d", x);
    }
}
void insertBefore(list &l, int x, int y)
{
    int flag = 0;
    // chen phan tu co gia tri y truoc cac phan tu co gia tri x
    for (node *p, *n = l.head; n != NULL; p = n, n = n->next)
    {
        if (n->data == x)
        {
            flag = 1;

            // node co gia tri x la node dau tien cua linked list
            if (l.head == n)
            {
                node *firstNode = taoNode(y);
                firstNode->next = l.head;
                l.head = firstNode;
            }
            else
            {
                node *node_y = taoNode(y);
                node *previousNode;
                node_y->next = n;
                p->next = node_y;
            }
        }
    }

    if (flag == 0)
    {
        printf("khong ton tao node co gia tri %d", x);
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
void deleteNode(list &l, int x)
{
    int flag = 0;

    node *previousNode;
    node *n;
    int k;

    for (k = 0, previousNode, n = l.head; n != NULL; k++, previousNode = n, n = n->next)
    {
        if (k == x)
        {
            flag = 1;
            previousNode->next = n->next;
            n = NULL;
            break;
        }
    }

    if (flag == 0)
    {
        printf("khong ton tai khoa %d trong danh sach", x);
    }
}