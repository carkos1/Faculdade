#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

#define jour 10

int main(){

    int my_pipe[jour][2];

    for(int i = 0; i < jour; i++){
        if(pipe(my_pipe[i]) == -1){
            perror("pipe");
        }
        pid_t id = fork();
        
        if(id > 0){ 
            close(my_pipe[i][1]);
            printf("Child created with ID: %d!\n",id);
            while (1)
            {
                /* code */
            }
            
        }
        if(id == 0){
            close(my_pipe[i][0]);
            printf("I'm a child!\n");
            break;
        }

        if(id < 0){
            perror("fork error\n");
        }
    }
    

}