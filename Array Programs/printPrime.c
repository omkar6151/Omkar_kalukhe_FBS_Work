//program to print only prime numbers from the array
#include<stdio.h>
int prime(int num);
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

    printf("prime numbers : ");
    for(int i=0; i<10; i++){
        if(prime(a[i])){
            printf("%d ", a[i]);
        }
    }
}

int prime(int num){
    if(num < 2){
        return 0;
    }
    for(int i=2; i<num; i++){
        if(num%i==0){
            return 0;
        }
    }
}