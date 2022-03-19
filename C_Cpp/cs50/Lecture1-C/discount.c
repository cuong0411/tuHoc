#include <stdio.h>

float discount(float price, int percent_off);

int main(void)
{
    float regular;
    printf("Regular price: ");
    scanf("%f", &regular);
    int percent_off;
    printf("Percent off: ");
    scanf("%f", &percent_off);
    float sale = discount(regular, percent_off);
    printf("Sale price: %.2f\n", sale);
}

float discount(float price, int percent_off)
{
    return price * (100 - percent_off) / 100;
}