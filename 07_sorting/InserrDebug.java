class A {
	public static void main(String [] args){
		int [] arr =  {5,8,6,1,43,9,4,77};
		int n = arr.length;
		int curentEle, j;
		for(int i=1; i<n; i++){
			curentEle = arr[i];
			j= i-1;
			System.out.print("Befor Modified: ");
			for(int k=0; k<n; k++){
				System.out.print(arr[k]+" ");
			}
			while(j>=0 && arr[j] > curentEle){
				arr[j+1] = arr[j];
				j= j-1; // 2-1
			}
			arr[j+1] = curentEle;
			System.out.print("\nAfter Modified: ");
			for(int k=0; k<n; k++){
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
	}
}