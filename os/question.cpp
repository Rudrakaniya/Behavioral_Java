//break_the_bond
//jatt_james_bond
#include<bits/stdc++.h>
using namespace std;
typedef vector< vector<int> > Matrix;

bool bankerHere(int processes, int resources, Matrix& need, int* avail, Matrix& alloc, int totalResources){
    vector<bool> executed(processes, false); 
    for (int k = 0; k < processes; k++)
    {
        for (int i = 0; i < processes; i++) { 
            if (executed[i] == false) { 
  
                int flag = 0; 
                for (int j = 0; j < resources; j++) { 
                    if (need[i][j] > avail[j]){ 
                        flag = 1; 
                        break; 
                    } 
                } 
  
                if (flag == 0) { 
                    for (int y = 0; y < resources; y++) 
                        avail[y] += alloc[i][y]; 
                    executed[i] = true; 
                } 
            } 
        }
    }

    int t{0};
	for (int i = 0; i < resources; ++i)
	{
		t += avail[i];
	}

    if(t == totalResources){
		cout << endl << "Currently, the system is in safe state." << endl;
        return true;
    }
    else
    {
        cout << endl << "The system has entered the deadlock state which is an unsafe state." << endl;
        return false;
    }
}

int32_t main(){
    int processes, resources, totalResources{0};;
    cout << "Enter the number of processes __";
    cin >> processes;

    cout << "Enter the number of resources __";
    cin >> resources;

    Matrix alloc(processes, vector<int>(resources));
    Matrix max(processes, vector<int>(resources));
    Matrix req(processes, vector<int>(resources));

    cout << endl << "Enter the Allocated matrix :- "<<endl;

	for (int i = 0; i < processes; ++i){
		for (int j = 0; j < resources; ++j){
			cin >> alloc[i][j];
            totalResources += alloc[i][j];
		}
	}
    cout << endl << "Enter the Max need matrix :-" << endl;

	for (int i = 0; i < processes; ++i){
		for (int j = 0; j < resources;++j){
			cin >> max[i][j];
            req[i][j] = max[i][j] - alloc[i][j];
        }
    }

    int avail[resources];
    cout << "Enter the Available number of resourses left for all " << resources << " resources :- " << endl;
    for (int i = 0; i < resources;++i){
		cin >> avail[i];
        totalResources += avail[i];
	}

    bool boo = bankerHere(processes, resources, req , avail, alloc, totalResources);

    int noReq;
    cout << endl
         << "Enter the number of requests you want to perform __";
    cin >> noReq;

    for (int i = 0; i < noReq; ++i){
        Matrix vv = alloc;
        Matrix xvv = req;
        int pp, *anvi = avail, tr = totalResources;
        cout << "The the process for which you want to request = ";
        cin >> pp;
        cout << "Enter the values of your request: - " << endl;
        int sg[3];
        for (int l = 0; l < 3; ++l){
            cin >> sg[l];
            vv[pp][l] += sg[l];
            xvv[pp][l] -= sg[l];
            anvi[l] -= sg[l];
            tr += sg[l];
        }
        boo = bankerHere(processes, resources, xvv , anvi, vv, tr);

        if(boo){
            cout << endl
                 << "Thus, REQ" << i + 1 << " can be permitted." << endl;

        }else{
            cout << endl
                 << "Thus, REQ" << i + 1 << " will not be permitted." << endl;
        }
    }

        return 0;
}
