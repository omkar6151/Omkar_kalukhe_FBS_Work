//program to print the alternate elements in the array
#include<stdio.h>
int alternateNum(int a[], int size);
void main(){
    int a[10];
    printf("enter the array elements:\n");
    for(int i=0; i<10; i++){
        scanf("%d", &a[i]);
    }
    printf("array elements:");
    for(int i=0; i<10; i++){
        printf("%d ", a[i]);
    }
    printf("\n");
    printf("alternate numbers:");
    alternateNum(a, 10);
}

int alternateNum(int a[], int size){
    for(int i=0; i<size; i=i+2){
        printf("%d ",a[i]);
    }
}