//break_the_bond
//jatt_james_bond
#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<errno.h>
int main()
{

    int fd, n;
    fd  = open("file1",O_CREAT|O_RDWR, 0777);

    char buff[50];
    lseek(fd, -6, SEEK_END);
    n = read(fd, buff, 5);
    
    write(0, buff, n);
    
    return 0;
}
