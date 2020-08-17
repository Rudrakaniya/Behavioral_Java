//break_the_bond
//jatt_james_bond
#include <bits/stdc++.h>
#define int long long
#define endl "\n"
using namespace std;
#define IOS std::ios_base::sync_with_stdio(false), cin.tie(NULL), cout.tie(NULL);
bool comp(pair<int, int>& a, pair<int, int>& b)
{
    return a.first < b.first;
}

void magic()
{
    int check = 0;
    string mainString, logicStr;
    cin >> mainString >> logicStr;


    vector<int> boo(26, 0);

    for (int i = 0; i < mainString.length(); ++i)
    {
        ++boo[mainString[i] - 'a'];
    }
    for (int i = 0; i < logicStr.length(); ++i)
    {
        --boo[logicStr[i] - 'a'];
    }

    for (int i = 0; i < logicStr.length(); ++i)
    {

        if (logicStr[i]!=logicStr[0]) {
            if (logicStr[i]<logicStr[0])
                check=1;
            break;
        }

    }
    string ONLY;

    if (check == 1) {

        for (int i = 0; i < logicStr[0] - 'a'; ++i)
        {
            int len = boo[i];
            for (int j = 0; j < len; ++j)
            {
                ONLY.push_back((char)(i + 'a'));
            }
        }
        ONLY=ONLY+logicStr;

        for (int i = (logicStr[0] - 'a'); i < 26; ++i)
        {
            int len = boo[i];
            for (int j = 0; j < len; ++j)
            {
                ONLY.push_back((char)(i + 'a'));
            }
        }
    }
    else
    {
        for (int i = 0; i <= logicStr[0] - 'a'; ++i)
        {
            int len = boo[i];
            for (int j = 0; j < len; ++j)
            {
                ONLY.push_back((char)(i + 'a'));
            }
        }

        ONLY = ONLY + logicStr;

        for (int i = (logicStr[0] - 'a')+1; i < 26; ++i)
        {
            int len = boo[i];
            for (int j = 0; j < len; ++j)
            {
                ONLY.push_back((char)(i + 'a'));
            }
        }
    }



    cout << ONLY << endl;
    return;
}
int32_t main()
{
    // cout << ('c' > 'b');
    IOS int testcases = 1;
    cin >> testcases;
    while (testcases--)
    {
        magic();
    }
    return 0;
}

// 7
// a
// a
// a
// aaba
// ba
// aaba
// cccb
// cb
// cbcc
// ccdc
// dc
// ccdc
// ccdc
// cd
// cccd
// aabbccddffee
// fecbd
// aabcdefecbdf

