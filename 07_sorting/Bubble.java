/*
Bubble sort:
time complexity: O(n^2)
space complecity: O(1)
*/
class A {
	public static void main (String [] args){
		int [] arr =  {5,8,6,1,43,9,4,77};
		int n = arr.length;
		int tmp = 0;
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
}