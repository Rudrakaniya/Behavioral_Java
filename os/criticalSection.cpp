#include <pthread.h>
#include<unistd.h>
#include <bits/stdc++.h>
#include <semaphore.h>

using namespace std;
int resources = 6;
bool flag;

void * first(void *) {


    while(flag);

    /* critical section */
    cout << endl
         << ">>> Lock acquired, by First function" << endl
         << endl;
    int a;
    flag = true;
    a = resources;
    a = a + 1;
    sleep(1);
    resources = a;
    flag = false;
    cout << endl
         << ">>> Lock released, by First function" << endl
         << endl;
    printf("The value of resources is %d\n", resources);
    /* remainder section */
}
void * second(void *) {

    while(flag)
        ;
    
    /* critical section */
    cout << endl
         << ">>> Lock acquired, by Second function" << endl
         << endl;
    int a;
    flag = true;
    a = resources;
    a = a - 1;
    resources = a;
    sleep(2);
    flag = false;
    cout << endl
         << ">>> Lock released, by Second function" << endl
         << endl;
    printf("The value of resources is %d \n", resources);
    /* remainder section */
}
int main() {
    pthread_t thread1, thread2;
    flag = false;

    int i = 3;

    while(i--){
        pthread_create(&thread1, NULL, first, NULL);
        sleep(1);
        pthread_create(&thread2, NULL, second, NULL);
        sleep(5);
        cout << "__________________________________________" << endl;
    }

    pthread_join(thread1, NULL);
    pthread_join(thread2, NULL);
    printf("Resources is %d\n", resources);
}
