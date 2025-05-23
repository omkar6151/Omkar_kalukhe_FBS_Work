#include<stdio.h>
#include<string.h>
void main(){
    char str[10];
    printf("enter a string: ");
    scanf("%s", str);

    for(int i=0; str[i]!='\0'; i++){
        if(str[i]!='a' && str[i]!='e' && str[i]!='i' && str[i]!='o' && str[i]!='u'){
            printf("%c", str[i]);
        }
}
}