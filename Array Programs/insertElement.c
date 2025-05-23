//program to insert an element at a specific position
#include<stdio.h>
void insert(int a[], int *size, int pos, int num);
void main(){
    int size, pos, num;
    printf("enter the size of the array:");
    scanf("%d", &size);
    int a[size];
    printf("enter the elements in the array:");
    for(int i=0; i<size; i++){
        scanf("%d", &a[i]);
    }
    printf("Array:");
    for(int i=0; i<size; i++){
        printf("%d ",a[i]);
    }
    printf("\n");
    printf("enter the position at which you want to insert the element:");
    scanf("%d", &pos);
    printf("enter the number that you want to insert:");
    scanf("%d", &num);

    if(pos<0 || pos>size){
        printf("invalid position");
    }
    else {
        insert(a, &size, pos, num);
    }
    printf("array after inserting:");
    for(int i=0; i<size; i++){
        printf("%d ",a[i]);
    }
}

void insert(int a[], int *size, int pos, int num){
    for(int i=*size; i>pos;i--){
        a[i] = a[i-1];
    }
    a[pos] = num;
    (*size)++;
}
