#include <iostream>
#include <vector>
using namespace std;

vector<int> nonDecreRmv(vector<int> &nums, int n){
	bool flag = true;
	int inds;
	vector<int> ans;
	int i=0;
	while(i<n-1){
		if(nums[i]>nums[i+1]){
			ans.push_back(nums[i])
		}else if (nums[i]==nums[i+1]){
			ans.push_back(nums[i]);
		}
		i++;
	}
	if(flag ==false){
		ans.push_back(-1);
		return ans;
	}
	return ans;
}

int main (){
	int n=6;
	vector<int>arr(n);
	for(int i=0; i<n; i++){
		cin>>arr[i];
	}

	vector<int> v = nonDecreRmv(arr, n);

	for(int t : v){
		cout<<t<<" ";
	}


	return 0;
}