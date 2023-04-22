class A {
	public static void main (String [] args){
		int [] arr = {9,5,4,6,7,3,2,0};
		int len =  arr.length;
		System.out.print("Before Sort: ");
		for(int i=0; i<len; i++){
			System.out.print(arr[i]+" ");
		}
		
		mergeSort(arr, 0, len-1);
		
		System.out.print("\nAfter Sort: ");
		for(int i=0; i<len; i++){
			System.out.print(arr[i]+" ");
		}
	}
	static void mergeSort(int [] arr, int start, int end){
		if(start<end){
			int mid = (start+end)/2;
			
			mergeSort(arr,start, mid);
			mergeSort(arr, mid+1, end);
			
			merge(arr, start, mid, end);
		}
	}
	static void merge(int [] arr, int start, int mid, int end){
		int m1 = mid - start + 1;	//4
		int m2 = end - mid;	//4
		
		int [] arr1 =  new int[m1];
		int [] arr2 = new int[m2];
		
		for(int i=0; i<m1; i++){
			arr1[i] = arr[start+i];
		}
		for(int i=0; i<m2; i++){
			arr2[i] = arr[mid+1+i];
		}
		
		int i =0, j=0, k=start;
		
		while(i<m1 && j<m2){
			if(arr1[i] <= arr2[j]){
				arr[k] = arr1[i];
				i++;
			}else{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<m1){
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<m2){
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}
}