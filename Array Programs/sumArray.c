//program to printd the sum of all elements in the array

#include<stdio.h>
void main(){
    int a[10];
    printf("enter the elements in the array:\n");
    for(int i=0; i<10; i++){
        scanf("%d", &a[i]);
    }
    for(int i=0; i<10; i++){
        printf("%d\t",a[i]);
    }
    printf("\n");
    int result = sumArray(a, 10);
    printf("sum of array elementd = %d", result);
}

int sumArray(int a[], int size){
    int sum = 0;
    for(int i=0; i<size; i++){
        sum = sum + a[i];
    }
    return sum;
}