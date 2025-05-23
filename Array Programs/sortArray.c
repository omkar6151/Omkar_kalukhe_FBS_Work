//program to sort the array
#include<stdio.h>
int sortArray(int a[], int size);
void main(){
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

    sortArray(a, size);
}

int sortArray(int a[], int size){
    int temp;
    
    for(int i=0; i<size; i++){
        for(int j=i+1; j<size; j++){
            if(a[i] > a[j]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    printf("sorted array:");
    for(int i=0; i<size; i++){
        printf("%d ", a[i]);
    }
    
}