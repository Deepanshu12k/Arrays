package arrae;

public class SecondmethodMergeSort {
	
    public static void main(String[] args) {
    	  
    	int input[] = {90,23,101,45,65,23,67,89,34,23};  
    	
    	SecondmethodMergeSort ob = new SecondmethodMergeSort();
    	ob.merge_sort(input,0,input.length-1);
    	
     	for(int i =0;i<input.length;i++) {
        	System.out.println( input[i]);
        	}
    	
    	 }
    
    public  void merge_sort(int[] input,int beg,int end) {
    	
    	if(beg<end) {
    		
    		int mid= (beg+end)/2;
    		merge_sort(input,beg,mid);
    		merge_sort(input,mid+1,end);
    		merge(input,beg,mid,end);
    	  
    	  }
    	} 
    
    public  void merge(int[] input,int beg,int mid,int end) {
    	
    	int L = mid-beg+1;
    	int R = end-mid;
    	
    	 int left[] = new int[L];
    	 int right[] = new int[R];
    	 
    	 for(int i = 0 ; i<L;i++) {
    		 left[i]=input[beg+i];
    	 }
    	
    	for(int i=0;i<R;i++) {
    		right[i] = input[mid+i+1];
    	}
    	
    	
    	int i = 0 ,j=0;
    	int k = beg;
    	
    	while(i<L && j<R) {
    		if( left[i] <= right[j] ) {
                	input[k] = left[i];
    	              i++;
             }else {
            	 input[k] = right[j];
            	 j++;
             }
    		k++;
    }
        while(i<L) {
    	input[k] = left[i];
    	i++;
    	k++;
    }	
    while(j<R) {
    	input[k] = right[j];
    	j++;
    	k++;
     }	
    
  }
    
 }


	
	
	

