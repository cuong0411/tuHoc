#include <stdio.h>
#define MAX 50

void xuatMang(int mang[], int n);
void nhapMang(int mang[], int *n);
void insertNum(int mang[], int n, int num);

int main()
{
    int mang[MAX];
    int n;
    nhapMang(mang, &n);
    xuatMang(mang, n);
    printf("\ninsert\n");
    insertNum(mang, n, 1);
    
    for (int i = 0; i < n + 1; i++)
    {
        printf("%d ", mang[i]);
    }

    return 0;
}
void xuatMang(int mang[], int n)
{
	for (int i = 0; i < n; i++)
	{
		printf("%d ", mang[i]);
	}
}
void nhapMang(int mang[], int *n)
{
	do
	{
		printf("Nhap n = ");
		scanf("%d", n);
	} while (*n <= 0);
	for (int i = 0; i < *n; i++)
	{
		printf("phan tu thu a[%d] = ", i);
		scanf("%d", &mang[i]);
	}
}
void insertNum(int mang[], int n, int num)
{
    int insertIndex;
    for (int i = 0; i < n; i ++)
    {
        if (num < mang[i])
        {
            insertIndex = i;
            break;
        }
    }
    
    for (int i = insertIndex; i < n + 1; i++)
    {
        int temp = mang[i];
        mang[i] = num;
        num = temp;

    }
}