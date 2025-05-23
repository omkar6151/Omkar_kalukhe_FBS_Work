//program to print the alternate number sin the array
#include<stdio.h>
void main(){
    int a[10];
    printf("enter the elements in the array:\n");
    for(int i=0; i<10; i++){
        scanf("%d", &a[i]);
    }

    printf("Array:\n");
    for(int i=0; i<10; i++){
        printf("%d\t", a[i]);
    }
    printf("\n");

    printf("alternate array elements:");
    for(int i=0; i<10; i=i+2){
        printf("%d\t",a[i]);
    }
}