#include <iostream>
using namespace std;

template <class T>
class Array{
	public:
		T *begin;

		Array(){
			begin = new T[1];
		}
		Array(int size){
			begin = new T[size];
		}
		Array(int size, T init_data){
			begin = new T[size];
			for(int i=0; i<size; i++){
				*(begin + i) = init_data;
			}
		}
};

int main (){
	Array<int> arr(5);

	for (int i =0; i<5; i++){
		cin>>arr.begin[i];
	}
	for (int i=0; i<5; i++){
		cout<<arr.begin[i]<<endl;
	}
	return 0;
}