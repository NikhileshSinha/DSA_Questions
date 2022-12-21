#include <stdio.h>

//This function will help to conqure / merging the array after sorting it
void merge(int arr[], int l, int m, int r)
{
    int i, j, k;
    int n1 = m - l + 1;
    int n2 = r - m;
    
  //Left and right will be 2 diffrent array for diffrent sets of divided parts
    int L[n1], R[n2];

  //Here we are copying the values from main array for sorting
    for (i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (j = 0; j < n2; j++)
        R[j] = arr[m + 1 + j];

    i = 0; 
    j = 0; 
    k = l; 
  
  //Now this while loop will sort each single element
    while (i < n1 && j < n2)
    {
        if (L[i] <= R[j])
        {
            arr[k] = L[i];
            i++;
        }
        else
        {
            arr[k] = R[j];
            j++;
        }
        k++;
    }
    
    while (i < n1)
    {
        arr[k] = L[i];
        i++;
        k++;
    }
    
    while (j < n2)
    {
        arr[k] = R[j];
        j++;
        k++;
    }
}

//This function is used to divide the array into smaller part
void mergeSort(int arr[], int l, int r)
{
    if (l < r)
    {
      /*
      FOR FIRST ITERATION
      .....................................
      |     |     |     |     |     |     |
      |   6 |  8  |  3  |  9  |  1  |  5  |
      |     |     |     |     |     |     |
      '''''''''''''''''''''''''''''''''''''
        0     1      2     3      4     5
      l=0
      r=5
      m = 0 + ( 5 - 0 ) / 2
      m = 2
      
      mergeSort(arr, l, m)      ->      mergeSort(arr, 0, 2);
                                                |     m = 0 + (2-0)/2 = 1
                                                |
                                                ----->  mergeSort(arr, l, m)      ->      mergeSort(arr, 0, 1)
                                                        mergeSort(arr, m+1, r)    ->      mergeSort(arr, 2, 2)        ..........so on
      mergeSort(arr, m+1, r)    ->      mergeSort(arr, 3, 5);
                                                |     m = 3 + (5-3)/2 = 3 + 1 = 4
                                                |
                                                -----> mergeSort(arr, l, m)      ->      mergeSort(arr, 3, 4)
                                                       mergeSort(arr, m+1, r)    ->      mergeSort(arr, 5, 5)        ..........so on
     
      */      
        int m = l + (r - l) / 2;

      //This recursive function will divide the left part of array
        mergeSort(arr, l, m);
      //This recursive function will divide the right part of array
        mergeSort(arr, m + 1, r);

      //It will sort the smallest part (i.e. single element) of array
        merge(arr, l, m, r);
    }
}


//This function will help to print array 
void printArray(int A[], int size)
{
    int i;
    for (i = 0; i < size; i++)
        printf("%d ", A[i]);
    printf("\n");
}


int main()
{
    int arr[] = {20, 17, 33, 42, 85, 10, 22, 15};
    int arr_size = sizeof(arr) / sizeof(arr[0]);

    printf("Given array is \n");
    printArray(arr, arr_size);

    mergeSort(arr, 0, arr_size - 1);

    printf("\nSorted array is \n");
    printArray(arr, arr_size);
    return 0;
}
