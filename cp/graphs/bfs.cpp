//break_the_bond
//jatt_james_bond
#include <bits/stdc++.h>
using namespace std;
void bfs(vector<int> adjList[], int v, int s)
{
    queue<int> qq;
    bool visited[v + 1] = {false};
    int level[v] = {0};

    qq.push(s);
    level[s] = 0;
    visited[s] = true;

    while (!qq.empty())
    {
        int temp = qq.front();
        cout << temp << " ";
        qq.pop();
        for (int i = 0; i < adjList[temp].size(); ++i)
        {
            if (visited[adjList[temp][i]] == false)
            {
                level[adjList[temp][i]] = level[temp] + 1;
                qq.push(adjList[temp][i]);
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
        cout << "Enter the edge = ";
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
    cout << "Enter the number of vertex - ";
    cin >> v;
    cout << "Enter the number of edges - ";
    cin >> e;

    vector<int> adjList[v];
    graphRep(adjList, e);
    // printGraph(adjList, v);
    bfs(adjList, v, 0);

    return 0;
}
