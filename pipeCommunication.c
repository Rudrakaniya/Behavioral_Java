//break_the_bond
//jatt_james_bond
#include <stdio.h>
#include <unistd.h>


int main()
{
    int fd[2];
	char *str;

	pipe(fd);

    pid_t p;
    p = fork();
    switch(p){
        
        case 0:
            //process1
		    close(fd[1]);

		    read(fd[0], &str, 19);
		    printf("Process ID = %d,\n Message Recived =  %s\n", getpid(), str);
            
		    close(fd[0]);
            break;

        default:
             // 2process
		    close(fd[0]);

		    str = "Message: We are using pipe for providing shared memory."; 
		    write(fd[1], &str, 19);
		    printf("Process ID = %d,\n", getpid());
            printf("Message sent successfully!\n\n");
            close(fd[1]);
    }
    
    return 0;
}
