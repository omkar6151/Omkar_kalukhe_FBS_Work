//program to find the common elements in 3 sorted arrays
#include<stdio.h>
void sortArray(int a[], int b[], int c[], int *size1, int *size2, int *size3);
void commonElement(int a[], int b[], int c[], int *size1, int *size2, int *size3);
void main(){
    int size1, size2, size3;
    printf("enter the size of the first array:");
    scanf("%d", &size1);
    int a[size1];

    printf("enter the size of the second array:");
    scanf("%d", &size2);
    int b[size2];

    printf("enter the size of the third array:");
    scanf("%d", &size3);
    int c[size3];

    printf("enter the elements in first array:\n");
    for(int i=0; i<size1; i++){
        scanf("%d", &a[i]);
    }

    printf("enter the elements in second array:\n");
    for(int i=0; i<size2; i++){
        scanf("%d", &b[i]);
    }

    printf("enter the elements in third array:\n");
    for(int i=0; i<size3; i++){
        scanf("%d", &c[i]);
    }

    printf("array 1:");
    for(int i=0; i<size1; i++){
        printf("%d ", a[i]);
    }
    printf("\n");

    printf("array 2:");
    for(int i=0; i<size2; i++){
        printf("%d ", b[i]);
    }
    printf("\n");

    printf("array 3:");
    for(int i=0; i<size3; i++){
        printf("%d ", c[i]);
    }

    printf("\n");
    printf("sorted arrays: \n");
    sortArray(a,b,c,&size1,&size2,&size3);
    printf("\n");
    commonElement(a,b,c,&size1,&size2,&size3);
}

void sortArray(int a[], int b[], int c[], int *size1, int *size2, int *size3){
    int temp;
    for(int i=0; i<*size1; i++){
        for(int j=i+1; j<*size1; j++){
            if(a[i] > a[j]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    for(int i=0; i<*size1; i++){
        printf("%d ",a[i]);
    }
    printf("\n");

    for(int i=0; i<*size2; i++){
        for(int j=i+1; j<*size2; j++){
            if(b[i] > b[j]){
                temp = b[i];
                b[i] = b[j];
                b[j] = temp;
            }
        }
    }
    for(int i=0; i<*size2; i++){
        printf("%d ",b[i]);
    }
    printf("\n");

    for(int i=0; i<*size3; i++){
        for(int j=i+1; j<*size3; j++){
            if(c[i] > c[j]){
                temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
        }
    }
    for(int i=0; i<*size3; i++){
        printf("%d ",c[i]);
    }
}

void commonElement(int a[], int b[], int c[], int *size1, int *size2, int *size3){
    int i=0, j=0, k=0;
    printf("common elements: ");
    while(i< *size1 && j< *size2 && k<*size3){
        if(a[i] == b[j] && b[j] == c[k]){
            printf("%d ", a[i]);
            i++;
            j++;
            k++;
        }
        else if(a[i] < b[j])
        {
            i++;
        }
        else if(b[j] < c[k])
        {
            j++;
        }
        else 
        {
            k++;
        }
    }
}