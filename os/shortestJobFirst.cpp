//break_the_bond
//jatt_james_bond
#include<bits/stdc++.h>

using namespace std;

int largest(int n, vector < int > burstTime) {
    int l = 0, index = 0;
    for (int i = 0; i < n; ++i) {
        if (burstTime[i] > l) {
            l = burstTime[i];
            index = i;
        }
    }
    return index;
}

int largest1(int n, vector < int > burstTime) {
    int l = 4748364, index = 0;
    for (int i = 0; i < n; ++i) {
        if (burstTime[i] < l) {
            l = burstTime[i];
            index = i;
        }
    }
    return index;
}

int main() {
    int processes;
    cout << "Enter the number of processes __";
    cin >> processes;
    vector < int > arrivalTime(processes);
    vector < int > burstTime(processes);

    cout << endl <<
        "Enter the Arrival time of each process: -" << endl;

    for (int i = 0; i < processes; ++i) {
        cout << "Enter the arival time of P" << i << " process __";
        cin >> arrivalTime[i];
        burstTime[i] = arrivalTime[i] << 1;
    }
    for (int vv = 0; vv < 2; ++vv) {

        if (!vv) {

            vector < int > completionTime(processes);
            vector < int > turnAroundTime(processes);
            vector < int > waitingTime(processes);
            vector < int > temp = burstTime;
            int exeTime {
                0
            };

            cout << endl;

            for (int i = 0; i < processes; ++i) {
                int quant = largest(processes, temp);
                completionTime[quant] = exeTime + burstTime[quant];
                exeTime = completionTime[quant];
                temp[quant] = -1;
                turnAroundTime[quant] = completionTime[quant] - arrivalTime[quant];
                int sg = turnAroundTime[quant] - burstTime[quant];
                (sg < 0) ? sg = 0: sg;
                waitingTime[quant] = sg;
            }

            int averageWaitingTime {
                0
            };
            int averageTurnaroundTime {
                0
            };
            for (int i = 0; i < processes; ++i) {
                cout << "Completion time of P" << i << " process is = " << completionTime[i] << ",  Turn Around Time = " << turnAroundTime[i] << "  And Waiting Time = " << waitingTime[i] << endl;
                averageWaitingTime += waitingTime[i];
                averageTurnaroundTime += turnAroundTime[i];
            }

            cout << endl <<
                "Average waiting time = " << ((float) averageWaitingTime / processes) << endl;

            cout << endl <<
                "Average turnaround time = " << ((float) averageTurnaroundTime / processes) << endl;
        }

        //Now with Shortest Job First algo

        if (vv) {
            cout << endl <<
                "Now implementing the with Shortest Job First" << endl;

            vector < int > completionTime(processes);
            vector < int > turnAroundTime(processes);
            vector < int > waitingTime(processes);
            vector < int > temp = burstTime;
            int exeTime {
                0
            };

            cout << endl;

            for (int i = 0; i < processes; ++i) {
                int quant = largest1(processes, temp);
                completionTime[quant] = exeTime + burstTime[quant];
                exeTime = completionTime[quant];
                temp[quant] = 4748365;
                turnAroundTime[quant] = completionTime[quant] - arrivalTime[quant];
                int sg = turnAroundTime[quant] - burstTime[quant];
                (sg < 0) ? sg = 0: sg;
                waitingTime[quant] = sg;
            }

            int averageWaitingTime {
                0
            };
            int averageTurnaroundTime {
                0
            };

            for (int i = 0; i < processes; ++i) {
                cout << "Completion time of P" << i << " process is = " << completionTime[i] << ",  Turn Around Time = " << turnAroundTime[i] << "  And Waiting Time = " << waitingTime[i] << endl;
                averageWaitingTime += waitingTime[i];
                averageTurnaroundTime += turnAroundTime[i];
            }

            cout << endl <<
                "Average waiting time = " << ((float) averageWaitingTime / processes) << endl;

            cout << endl <<
                "Average turnaround time = " << ((float) averageTurnaroundTime / processes) << endl;
        }

    }

    return 0;
}
