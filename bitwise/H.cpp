#include <iostream>
using namespace std;

bool compMAX(&a, &b){
	return a<b;
}
bool compMIN(&a, &b){
	return a>b;
}

int main (){
	int len =10;
	int arr[10];
	for (int k=0; k<len; k++){
		cin>>arr[k];
	}
	int min;
	int indes;
	for(int i=0; i<len; i++){
		min =INT_MAX;
		for (int j=i; j<len; j++){
			if(min>arr[j]){
				indes =j;
				min = arr[j];
			}
		}
		swap(arr[i],arr[indes]);
	}
	for (int m =0; m<len; m++){
		cout<< arr[m]<<" ";
	}
}