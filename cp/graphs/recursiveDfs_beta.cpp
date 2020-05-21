//break_the_bond
//jatt_james_bond
#include <bits/stdc++.h>
#define M 10000
using namespace std;

//declarations
vector<int> adjList[M];
bool visited[M] = {false};
stack<int> stk;
int v, e;

void dfs(int s)
{
    visited[s] = true;
    cout << s << " ";
    for (int i = 0; i < adjList[s].size(); ++i)
    {
        if (!visited[adjList[s][i]])
        {
            dfs(adjList[s][i]);
        }
    }
}

void addEdges(int a, int b)
{
    adjList[a].push_back(b);
    adjList[b].push_back(a);
}

void graphRep()
{
    for (int i = 0; i < e; ++i)
    {
        int a, b;
        cin >> a >> b;
        addEdges(a, b);
    }
}

int32_t main()
{
    /*  
    Representation of graph using adjacency list
    for a undirected graph.
*/
    cin >> v >> e;

    graphRep();
    dfs(0);

    return 0;
}
