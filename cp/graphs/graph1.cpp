//break_the_bond
//jatt_james_bond
#include <bits/stdc++.h>
using namespace std;
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
void printGraph(vector<int> adjList[], int v)
{
    for (int i = 0; i < v; ++i)
    {
        cout << "\n Adjacency list of vertex " << i << " is = ";
        for (auto x : adjList[i])
        {
            cout << " -> " << x;
        }
    }
    cout << endl;
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
    printGraph(adjList, v);

    return 0;
}
