//break_the_bond
//jatt_james_bond
#include<bits/stdc++.h>
#define endl "\n"
#define ll long long 
#define ull unsigned long long
const unsigned int M = 1000000007; 

bool comp(int a, int b){
	return a > b;
}
bool is_prime(int n) {
    if (n == 1) 
        return false;

    int i = 2;
    while (i*i <= n) {
        if (n % i == 0) {
            return false;
        }
        i += 1;
    }
    return true;
}

using namespace std;

int main(){
	std::ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	int t;
	cin >> t;

	while(t--){
		
		/* CODE GOES HERE */
	
	}
	return 0;
}

