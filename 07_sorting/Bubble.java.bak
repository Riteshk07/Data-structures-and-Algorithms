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
		boolean  flag = false;
		for(int i=0; i<n-1; i++){
			System.out.print("Befor Swap: ");
			for(int j = 0; j<n; j++){
				System.out.print(arr[j]+" ");
			}
			flag = false;
			for(int j=0; j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					flag = true;
				}
			}
			System.out.print("\nAfter Swap: ");
			for(int j = 0; j<n; j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			if(!flag){
				break;
			}
		}
	}
}