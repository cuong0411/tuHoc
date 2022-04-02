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

//    // Allocate new array of size 4
//    int *temp = malloc(4 * sizeof(int));
//    if (temp == NULL)
//    {
//        free(list);
//        return 1;
//    }
//     // Copy numbers from old array into new array
//    for (int i = 0; i < 3; i++)
//    {
//        temp[i] = list[i];
//    }

   // Using realloc instead of malloc
    int *temp = realloc(list, 4 * sizeof(int));
    if (temp == NULL)
    {
        free(list);
        return 1;
    }

   // Add fourth number to new array
   temp[3] = 4;

    // Don't need this because of using realloc
//    // free old array
//    free(list);

   // Remember new array
   list = temp;

   // Print new array
   for (int i = 0; i < 4; i++)
   {
       printf("%i\n", list[i]);
   }

   // Free new array
   free(list);
   return 0;

}