package arrae;

public class Heap_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {1,5,3,4,2};
     int n = arr.length;
     heapSort(arr,n);
//     for(int r : arr) {
//    	 System.out.println(r);
//     }
	}
public static void heapSort(int[] arr, int  n) {
	 // Build heap (rearrange array) 
	for(int i = n/2-1;i>=0;i--) {
		heapify(arr,n,i);
	}
	// One by one extract an element from heap 
	for(int i = n-1;i>0;i--) {
		 // Move current root to end 
		 
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]= temp;
		// call max heapify on the reduced heap 
        heapify(arr, i, 0); 
       
	  }
  }
static void heapify(int[] arr,int n,int i) {
	int largest = i;
	int L = 2*i+1;
//	 System.out.println("L: "+L);
	int R = 2*i+2;
//	 System.out.println("R: "+ R);
	if(L<n && arr[L]>arr[largest]) {
		largest = L;
	}
	if(R<n && arr[R]>arr[largest]) {
		largest = R;
	}
	if(largest != i) {
		int temp = arr[largest];
		arr[largest] = arr[i];
		arr[i] = temp;
		
		heapify(arr,n,largest);
	}
	for(int r : arr) {
      	 System.out.print(r);
       }
	 System.out.print("\n");
	 
}
}
