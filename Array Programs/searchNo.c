//program to search a number in the given array
#include<stdio.h>
void search();
int main(){
    printf("program to search the element in array\n");
    search();
    return 0;
}
void search(){
    int a[10];
    printf("enter the elements in the array:\n");
    for(int i=0; i<10; i++){
        scanf("%d", &a[i]);
    }
    for(int i=0; i<10; i++){
        printf("%d\t",a[i]);
    }
    printf("\n");

    int no, found=0;
    printf("enter the number that you want to search in the array:");
    scanf ("%d", &no);


    for(int i=0; i<10; i++){
        if(a[i] == no){
            printf("%d found at index %d", no, i);
            found=1;
            break;
        }
    }
    if(!found){
        printf("%d is not found", no); 
    }
}