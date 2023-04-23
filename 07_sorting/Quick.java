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
		for(int i: arr){
			System.out.print(i+" ");
		}
		System.out.println();
		quickSort(arr, low, high);
		
		System.out.print("\nAfter Sort: ");
		for(int i: arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	static void quickSort(int[] arr, int low, int high){
		if(low< high){
			int t = partition(arr, low, high);
		
			quickSort(arr, low, t-1);
			quickSort(arr, t+1, high);
		}
	}
	
	static int partition(int [] arr, int low, int high){
		int pivot = arr[high], tmp=0;
		int j = low;
		for(int i=low; i<high; i++){
		
			System.out.println("arr_i["+i+"] = "+arr[i]+" and  arr_j["+j+"] = "+arr[j]+" , Pivot: "+pivot);
			if(arr[i] <= pivot){
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				j++;
			}
			System.out.print("Array: ");
			for(int k: arr){
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println("#################################\n");
		
		tmp = arr[high];
		arr[high] = arr[j];
		arr[j] = tmp;
		
		System.out.print("End Array: ");
		for(int k: arr){
			System.out.print(k+" ");
		}
		System.out.println("----------------------------------\n");
		return j;
	}
}