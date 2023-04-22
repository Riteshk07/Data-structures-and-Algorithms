/*
B
Time complexity: O(n^2)
Space Complexity: O(n)
*/

class A {
	public static void main(String [] args){
		int [] arr =  {5,8,6,1,43,9,4,77};
		int n = arr.length;
		int curentEle, j;
		for(int i=1; i<n; i++){
			currentEle = arr[i];
			j= i-1;
			
			while(j>=0 && arr[j] > curentEle){
				arr[j+1] = arr[j];
				j= j-1; // 2-1
			}
			arr[j+1] = curentEle;
		}
	}
}