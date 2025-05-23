//program to remove the duplicate elements in an array
#include<stdio.h>
void removeDuplicate(int a[], int *size);
void main(){
    int size;
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
    removeDuplicate(a, &size);
}

void removeDuplicate(int a[], int *size){
    for(int i=0; i<*size; i++){
        for(int j=i+1; j<*size;){
            if(a[i] == a[j]){
                for(int k=j; k<*size-1;k++){
                    a[k] = a[k+1];
                }
                (*size)--;
            }
            else {
                j++;
            }
        }
    }
    printf("after removing duplicate elements:");
    for(int i=0; i<*size; i++){
        printf("%d ", a[i]);
    }
}
