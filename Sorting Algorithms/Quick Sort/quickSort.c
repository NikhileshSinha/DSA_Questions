#include <stdio.h>
#include <stdlib.h>

//This function helps to swap the elements
void swap(int *a, int *b)
{
    int t = *a;
    *a = *b;
    *b = t;
}
//This int 
int n;
int partition(int array[], int low, int high)
{

   /*
      FOR FIRST ITERATION
      .....................................
      |     |     |     |     |     |     |
      |   6 |  8  |  3  |  9  |  1  |  5  |
      |     |     |     |     |     |     |
      '''''''''''''''''''''''''''''''''''''
        0     1      2     3      4     5
      
      pivot = array[low] = array[0] = 6
      i=0
      j=6
      i++     ->      i=1     ->      array[1] <= 6 i.e 8 <= 6      ->      false
      j--     ->      j=5     ->      array[5] > 6 i.e 5 > 6        ->      false
      if(i<j)     i.e.      if(1<5)    true
      swap the value of 1st index with 5th index
      After swap
      .....................................
      |     |     |     |     |     |     |
      |   6 |  5  |  3  |  9  |  1  |  8  |
      |     |     |     |     |     |     |
      '''''''''''''''''''''''''''''''''''''
        0     1      2     3      4     5
     
     >> NEXT ITERATION
     
     After swap
      .....................................
      |     |     |     |     |     |     |
      |   6 |  5  |  3  |  1  |  9  |  8  |
      |     |     |     |     |     |     |
      '''''''''''''''''''''''''''''''''''''
        0     1      2     3      4     5
     
     >> NEXT ITERATION
     
     After swap
      .....................................
      |     |     |     |     |     |     |
      |   1 |  5  |  3  |  6  |  9  |  8  |
      |     |     |     |     |     |     |
      '''''''''''''''''''''''''''''''''''''
        0     1      2     3      4     5
        
     ....................and so on
      */
    int pivot = array[low];
    int i=low, j=high;
    do{
        do{i++;} while (array[i] <= pivot);
        do{j--;} while (array[j] > pivot);

        if(i<j) {
            swap(&array[i], &array[j]);
            printf("      After swap: \n");
            printArray(array);
            printf("\n\n");
        }
    }
    while(i<j);

    swap(&array[low], &array[j]);
    printf("      After swap: \n");
    printArray(array);
    printf("\n\n");
    return j;
}

//This function will help to find partition
void quickSort(int array[], int low, int high)
{
    int j=0;
    if(low<high){
        j = partition(array, low, high);
        quickSort(array, low, j);
        quickSort(array, j+1, high);
    }
}

//This function will help to print array
void printArray(int array[])
{
    for (int i = 0; i < n; ++i)
    {
        printf("%d  ", array[i]);
    }
    printf("\n");
}

int main()
{
    int data[] = {6, 8, 3, 9, 1, 5};

    n = sizeof(data) / sizeof(data[0]);

    printf("Unsorted Array\n");
    printArray(data);

    quickSort(data, 0, n);

    printf("Sorted (Quick sort) array in ascending order: \n");
    printArray(data);
}
