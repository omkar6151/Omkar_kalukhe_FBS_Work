//program to merge the two arrays
#include<stdio.h>
void mergeArray(int a[], int b[], int size1, int size2);


void main(){
int size1, size2;
printf("enter the size of the first array:");
scanf("%d", &size1);
printf("enter the size second array:");
scanf("%d", &size2);
int a[size1], b[size2];

printf("enter the elements in the first array:\n");
for(int i=0; i<size1; i++){
    scanf("%d", &a[i]);
}

printf("enter the elements in the second array:\n");
for(int i=0; i<size2; i++){
    scanf("%d", &b[i]);
}

printf("first array:");
    for(int i=0; i<size1; i++){
        printf("%d ", a[i]);
    }
    
printf("\n");

printf("second array:");
    for(int i=0; i<size2; i++){
        printf("%d ", b[i]);
    } 
    
 printf("\n");
  mergeArray(a,b,size1,size2);  
}

void mergeArray(int a[], int b[], int size1, int size2){
    int merge[size1+size2];
    for(int i=0; i<(size1+size2); i++){
        merge[i] = a[i];
    }
    for(int i=0; i<size2; i++){
        merge[i+ size1] = b[i];
    }

printf("merged array: ");
    for(int i=0; i<(size1 + size2); i++){
        printf("%d ", merge[i]);
    }
}