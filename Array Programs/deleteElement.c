//program to delete an element at specific postion
#include<stdio.h>
void deleteElement(int a[], int *size, int num);
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
    printf("enter the number that you want to delete:");
    scanf("%d", &num);


    // printf("array after deleting the number:");
    deleteElement(a, &size, num);

    
}

void deleteElement(int a[], int *size, int num){
    int found = 0;
    for(int i = 0; i < *size; i++) {
        if(a[i] == num) {
            found = 1;
            
            for(int j = i; j < *size - 1; j++) {
                a[j] = a[j + 1];
            }
            (*size)--; 
            i--;       
        }
    }
    if (!found) {
        printf("Number not found in array.\n");
    }

    printf("array after deleting:");
    for(int i=0; i<*size; i++){
        printf("%d ",a[i]);
    }
    }
