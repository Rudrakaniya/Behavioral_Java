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
    n = read(0, buff, 15);
    //hello students = 14
    write(fd, buff, n);

    int fd2;

    fd2 = open("file2", O_CREAT | O_RDWR, 0777);
    lseek(fd, 6, SEEK_SET);
    read(fd, buff, 8);
    write(fd2, buff, 8);
    
    return 0;
}
