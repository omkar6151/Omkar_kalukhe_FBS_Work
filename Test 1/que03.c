//program to print the last two digit of a number

#include<stdio.h>

void main() {
    int num, lastDigit;
    printf("Enter a number: ");
    scanf("%d", &num);

    lastDigit = num % 100; 

    printf("The last two digits of the number are: %d\n", lastDigit);

}