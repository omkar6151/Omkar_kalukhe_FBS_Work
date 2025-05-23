//program to find the dupliacte numbers in an array
#include<stdio.h>
void duplicate(int a[], int *size);
void main(){
    int size;
    printf("enter the size of the array:");
    scanf("%d", &size);
    int a[size];
    printf("enter the elements in the array:\n");
    for(int i=0; i<size; i++){
        scanf("%d", &a[i]);
    }
    printf("Array:");
    for(int i=0; i<size; i++){
        printf("%d ",a[i]);
    }
    printf("\n");
    duplicate(a, &size);
}

void duplicate(int a[], int *size){
    for(int i=0; i<*size; i++){
     for (int j=i+1; j<*size; j++){
        if(a[i]==a[j])
        printf("%d ",a[i]);
        }
    }
}