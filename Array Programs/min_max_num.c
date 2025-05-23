//progrsm to find the minimum and maximum number from the array
#include<stdio.h>
int minimum(int a[], int size);
int maximum(int a[], int size);
void main(){
    int a[10];
    printf("enter the elements in array:\n");
    for(int i=0; i<10; i++){
        scanf("%d", &a[i]);
    }
    for(int i=0; i<10; i++){
        printf("%d\t",a[i]);
    }

    printf("\n");

    int res1 = minimum(a, 10);
    printf("the minimum number is array = %d\n", res1);

    int res2 = maximum(a, 10);
    printf("the maximum number is array = %d\n", res2);

    // int minimum = a[0];
    // int maximum = a[0];

}

int minimum(int a[], int size){
    int minimum = a[0];
    for(int i=0; i<10; i++){
        if(a[i] < minimum){
            minimum = a[i];
        }
    }
    return minimum;
}

int maximum(int a[], int size){
    int maximum = a[0];
    for(int i=0; i<10; i++){
        if(a[i] > maximum){
            maximum = a[i];
        }
    }
    return maximum;
}