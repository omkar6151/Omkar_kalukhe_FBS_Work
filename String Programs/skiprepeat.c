#include<stdio.h>
#include<string.h>
void main(){
    char str[] = "swissroll";
    for(int i=0; i<strlen(str); i++){
        printf("%c ", str[i]);
        printf("\n");

        for(int i=0; i<strlen(str); i++){
            int flag = 1;
            for(int j=0; j<strlen(str); j++){
                if(i!=j && str[i]==str[j]){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                printf("%c ", str[i]);
            }
        }
        
    }
}