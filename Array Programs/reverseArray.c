// program to print the array in the reverse order

#include <stdio.h>
void reverseArray(int a[], int size);
void main()
{
    int size;
    printf("enter the size of the first array:");
    scanf("%d", &size);
    int a[size];

    printf("enter the elements in the array:\n");
    for(int i=0; i<size; i++){
        scanf("%d", &a[i]);
    }

    printf("array:");
    for(int i=0; i<size; i++){
        printf("%d ", a[i]);
    }

    printf("\n");
    reverseArray(a, size);

}

void reverseArray(int a[], int size){

    printf("reversed array:");
    for(int i=size-1; i>=0; i--){
        printf("%d ", a[i]);
    }
}