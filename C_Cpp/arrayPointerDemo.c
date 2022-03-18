#include<stdio.h>


void testArray(int arr[])
{
    printf("%lld\n", sizeof(arr));
}

int main()
{
    int drinks[] = {10, 99, 3, -1, 4};
    int *p_drinks = drinks;

    //value of the 1st element
    printf("1st order: %i drinks\n", drinks[0]);
    printf("1st order: %i drinks\n", *drinks);
    

    //value of the 2nd element
    printf("2nd order: %i drinks\n", *(drinks+1));
    printf("2nd order: %i drinks\n", *drinks+1); //*drinks = 10

    // print out the address
    printf("Address of array: %p\n", p_drinks);
    p_drinks += 1;
    printf("Address of array after plus operator: %p\n", p_drinks);
    printf("Value at that address is: %d\n", *p_drinks);
    printf("1st order: %p drinks\n", &drinks);
    printf("1st address: %p\n", drinks);
    printf("1st address: %p\n", &drinks[0]);
    printf("2nd address: %p\n", &drinks[1]);
    printf("3rd address: %p\n", &drinks[2]);
    printf("4th address: %p\n", &drinks[3]);
    printf("5th address: %p\n", &drinks[4]);
    int a = 1;
    printf("%lld\n", sizeof(a)); //size of an integer
    printf("%lld\n", sizeof(drinks)); //size of an array
    testArray(drinks); //size of pointer

    return 0;
}
