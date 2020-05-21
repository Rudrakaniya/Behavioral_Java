//break_the_bond
//jatt_james_bond
#include <bits/stdc++.h>
using namespace std;
void dfs(vector<int> adjList[], int s, int v)
{
    stack<int> stk;
    bool visited[v + 1] = {false};

    stk.push(s);
    visited[s] = true;
    while (!stk.empty())
    {
        int temp = stk.top();
        cout << temp << " ";
        stk.pop();

        for (int i = 0; i < adjList[temp].size(); ++i)
        {
            if (!visited[adjList[temp][i]])
            {
                stk.push(adjList[temp][i]);
                visited[adjList[temp][i]] = true;
            }
        }
    }
}

void addEdges(vector<int> adjList[], int a, int b)
{
    adjList[a].push_back(b);
    adjList[b].push_back(a);
}

void graphRep(vector<int> adjList[], int e)
{
    for (int i = 0; i < e; ++i)
    {
        int a, b;
        cin >> a >> b;
        addEdges(adjList, a, b);
    }
}

int32_t main()
{
    int v, e;
    /*  
    Representation of graph using adjacency list
    for a undirected graph.
*/
    cin >> v >> e;

    vector<int> adjList[v];
    graphRep(adjList, e);
    // printGraph(adjList, v);
    dfs(adjList, 0, v);

    return 0;
}
