#include<stdio.h>
void swap(int *x, int *y);
void main(){
    int a, b;
    printf("enter first no:");
    scanf("%d", &a);
    printf("enter second num:");
    scanf("%d", &b);
    printf("numbers before swapping are %d and %d\n", a, b);
    swap(&a, &b);
}

void swap(int *x, int *y){
    int a, b;
    a = *y;
    b = *x;

    printf("numbers after swapping are %d and %d", a,b);
}


