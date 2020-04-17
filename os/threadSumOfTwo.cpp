//jatt_james_bond
//break_the_bond
#include <bits/stdc++.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
#include <semaphore.h>
using namespace std;

typedef struct thread_data {
   int result;

} thread_data;

struct marks{
    int number1;
    int number2;
} m;

void * sumOfNumber(void *arg)
{
    thread_data *tdata=(thread_data *)arg;
    int sum{0};
    sum = m.number1 + m.number2;

    tdata->result=sum;
    pthread_exit(NULL);
}

int32_t main() {
    pthread_t thread1, thread2;
    thread_data tdata;
    cout << "Enter the first number = ";
    cin >> m.number1;
    cout << "Enter the second number = ";
    cin >> m.number2;

    pthread_create(&thread1, NULL, sumOfNumber, (void *)&tdata);
    sleep(1);

    cout << "The Sum of given numbers is = " << tdata.result << endl;

    return 0;
}
