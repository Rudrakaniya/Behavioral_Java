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

using namespace std;

int main(){
	std::ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	int t;
	cin >> t;

	while(t--){
		ll size;
		cin >> size;
		vector<unsigned ll> arr(size);

		for (int i = 0; i < size; ++i){
			cin >> arr[i];
		}
		
		unsigned ll t{0}, sum{0};
		sort(arr.begin(), arr.end(), comp);
		for (int i = 0; i < size;++i){
			if(arr[i] == 0){
				continue;
				break;
			}
			else
			{
				ll a = (arr[i] - t);
				(a < 0) ? a = 0 : a;
				sum = sum + a;
				sum = sum % M;
				t++;
			}
		}
		cout << sum << endl;
	}

	return 0;
}

