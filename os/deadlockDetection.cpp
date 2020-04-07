//break_the_bond
//jatt_james_bond

#include<bits/stdc++.h>
using namespace std;

int main(){

	int processes;
	int resources;
	int totalResources{0};
	cout << "Enter the number of resources __";
	cin >> resources;

	cout << "Enter the number of processes __";
	cin >> processes;

	int alloc[processes][resources];
	cout << endl << "Enter the Allocated matrix :- "<<endl;
	for (int i = 0; i < processes; ++i){
		for (int j = 0; j < resources; ++j){
			cin >> alloc[i][j];
			totalResources += alloc[i][j];
		}
	}

	int req[processes][resources];
	cout << endl << "Enter the request matrix :-" << endl;
	for (int i = 0; i < processes; ++i){
		for (int j = 0; j < resources;++j){
			cin >> req[i][j];
		}
	}

	int avail[resources];
	cout << "Enter the Available number of resourses left for all " << resources << " resources __";
	for (int i = 0; i < resources;++i){
		cin >> avail[i];
		totalResources += avail[i];
	}

	vector<bool> executed(processes, false);
	for (int a = 0; a < processes; ++a){
		for (int i = 0; i < processes; ++i)
		{
			if (executed[i] == false)
			{
				bool boo = true;
				for (int j = 0; j < resources; ++j)
				{
					if (avail[j] < req[i][j])
					{
						boo = false;
						break;
					}
				}
				if (boo)
				{
					executed[i] = true;
					for (int k = 0; k < resources; ++k)
					{
						avail[k] += alloc[i][k];
					}
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
		cout << endl << "There is no dead lock " << endl;
	}else{
		cout << endl << "Deadlock detected" << endl;
	}

	return 0;
}
