#include <iostream>
using namespace std;

int main (){
	int num;
	cin>> num;
	int ans= num | (1<<31);
	cout<<ans;
	return 0;
}