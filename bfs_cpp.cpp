//break_the_bond
//jatt_james_bond
#include<bits/stdc++.h>
#define endl "\n"
using namespace std;

int32_t main()
{
    int vertex, edges;
    cin >> vertex >> edges;

    vector<int> arr[vertex+1];

    for (int i = 0; i < edges;++i){
        int x, y;
        cin >> x >> y;
        arr[x].push_back(y);
    }

    queue<int> q;
    bool visited[vertex+1] = {false};


    //Print the visited func.
    cout << "Before Visiting :- ";
    for (int i = 0; i < vertex + 1;++i){
        cout << " i = " << i << "  value =    " << visited[i]<<endl;
    }
    cout << endl;

    q.push(0);
    visited[0] = true;

    while (!q.empty())
    {
        int t = q.front();
        q.pop();

        for (int i = 0; i < arr[t].size();++i){
            if(visited[arr[t][i]] == false){
                q.push(arr[t][i]);
                visited[arr[t][i]] = true;
            }
        }
    }


    //Print the visited func.
    cout << "After Visiting :- ";
    for (int i = 0; i < vertex + 1;++i){
        cout << " i = " << i << "  value =    " << visited[i]<<endl;
    }

    return 0;
}
