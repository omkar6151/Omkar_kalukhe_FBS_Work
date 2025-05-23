//program to print the even and odd numbers in array

#include<stdio.h>
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

    printf("even numbers:");
    evenNum(a, 10);
    printf("\n");
    printf("odd numbers:");
    oddNum(a, 10);
}

void evenNum(int a[], int size){
    int even;
    for(int i=0; i<10; i++){
        if(a[i]%2==0){
            printf("%d ", a[i]);
        }
    }
    
}

void oddNum(int a[], int size){
    int odd;
    for(int i=0; i<10; i++){
        if(a[i]%2!=0){
            printf("%d ", a[i]);
        }
    }

    
}