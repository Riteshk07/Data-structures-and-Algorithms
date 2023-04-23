/*
time complexcity - O(n log(n))
space complexity - O(n)

left = 3
right = 2
{1,2,3,5}

*/

class A {
	public static void main (String [] args){
		int [] arr = {5,1,1,2,0,0};
		int n  = arr.length;
		int high = n-1;
		int low = 0;
		System.out.print("Before Sort: ");
		printArray(arr);
		
		quickSort(arr, low, high);
		
		System.out.print("\nAfter Sort: ");
		printArray(arr);
	}
		// method to find the partition position
	static int partition(int arr[], int low, int high) {
		int pivot = arr[low];
		int count = 0;
		
		for(int i=low+1; i<=high; i++){
			if(arr[i]<= pivot){
				count++;
			}
		}
		System.out.print("before pvt swap Array: ");
		printArray(arr);
		
		int pvtIndex = low+count;
		int i=low,j=high,tmp =0;
		
		arr[low] = arr[pvtIndex];
		arr[pvtIndex] = pivot;
		
		System.out.print("pvt swap Array: ");
		printArray(arr);
		
		while(i<pvtIndex && j>pvtIndex){
			System.out.println("arr_i["+i+"] = "+arr[i]+" and  arr_j["+j+"] = "+arr[j]+" , Pivot: "+pivot);
			while(arr[i]<= pivot){
				i++;
			}
			
			while(arr[j] > pivot){
				j--;
			}
			System.out.print("Before swap Array: ");
			printArray(arr);
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;j--;
			
			System.out.print("After swap Array: ");
			printArray(arr);
		}
		System.out.println("###########################\n");
		return pvtIndex;
	}
	 
	 static void quickSort(int arr[], int low, int high) {
	   if (low < high) {
	 
		  // since this function returns the point where the array is
		  //partitioned, it is used to track the subarrays/partitions in 
		  //the array
		   int p = partition(arr, low, high);
	 
		   // recursively calling the function on left subarray
		   quickSort(arr, low, p - 1);
	 
		   // recursively calling the function on right subarray
		   quickSort(arr, p + 1, high);
	   }
	}
	static void printArray(int[] arr){
		for(int k: arr){
			System.out.print(k+" ");
		}
		System.out.println("\n");
	}
	
}

