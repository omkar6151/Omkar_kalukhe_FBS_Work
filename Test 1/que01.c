//program to convert the time entered in hh, min and sec into total seconds

#include<stdio.h>

void main() {
   
int hours, min, seconds, total_seconds;
printf("enter the hours:");
scanf("%d", &hours);
printf("enter the minutes:");
scanf("%d", &min);
printf("enter the seconds:");
scanf("%d", &seconds);

total_seconds = (hours * 3600) + (min * 60) + seconds;
printf("total seconds = %d", total_seconds);
    
}















 