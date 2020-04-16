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
    //Maeks out of 100
    int english;
    int maths;
    int dataStructure;
    int database;
    int python;
}m;


void * averageMarks(void *arg)
{
    thread_data *tdata=(thread_data *)arg;
    int average{0};
    average += m.english + m.maths + m.dataStructure + m.database + m.python;
    average = (average / 5);
    
    tdata->result=average;
    pthread_exit(NULL);
}

int32_t main() {
    pthread_t thread1, thread2;
    thread_data tdata;
    cout << "Enter your marks in English = ";
    cin >> m.english;
    cout << "Enter your marks in Maths = ";
    cin >> m.maths;
    cout << "Enter your marks in Data Structure = ";
    cin >> m.dataStructure;
    cout << "Enter your marks in DataBase = ";
    cin >> m.database;
    cout << "Enter your marks in Python = ";
    cin >> m.python;
    pthread_create( & thread1, NULL, averageMarks, (void *)&tdata);
    sleep(1);

    cout << "The Average of all the numbers is = " << tdata.result << endl;

    return 0;
}
