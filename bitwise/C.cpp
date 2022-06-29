#include <iostream>
using namespace std;

int main (){
	int nums = 255;  // 11111111 , 100000000
	int n = 7;  
	bool ans = nums & (1<<n-1);

	cout <<ans<<endl;
	return 0;
}