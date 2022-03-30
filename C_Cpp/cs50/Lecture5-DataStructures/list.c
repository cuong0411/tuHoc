#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    // memory on the stack
    //int list[3];

    // memory on the heap, can ask for more memory
    int *list = malloc(3 * sizeof(int));

    if (list == NULL)
    {
        return 1;
    }

    list[0] = 1;
    list[1] = 2;
    list[2] = 3;

    /*
    *list = 1;
    *(list + 1) = 2;
    *(list + 2) = 3;
    */

   int *temp = malloc(4 * sizeof(int));
   if (temp == NULL)
   {
       free(list);
       return 1;
   }
   
   for (int i = 0; i < 3; i++)
   {
       temp[i] = list[i];
   }
   temp[3] = 4;
   list = temp;
   for (int i = 0; i < 4; i++)
   {
       printf("%i\n", list[i]);
   }
   return 0;

}