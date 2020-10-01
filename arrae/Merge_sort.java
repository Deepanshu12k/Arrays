package arrae;

public class Merge_sort {
	  
	public  void merge_sort(int[] input,int beg,int end) {
	    	
	    	if(beg<end) {
	    		
	    		int mid= (beg+end)/2;
	    		merge_sort(input,beg,mid);
	    		merge_sort(input,mid+1,end);
	    			merge(input,beg,mid,end);
	    	  }
	    	} 
	    
	    public  void merge(int[] input,int beg,int mid,int end) {
	    	
	    	int lengthleft = mid-beg+1;
	    	int lengthright = end-mid;
	    	
	    	 int left[] = new int[lengthleft+1];
	    	 int right[] = new int[lengthright+1];
	    	 
	    	 for(int i = 0 ; i<lengthleft;i++) {
	    		 left[i]=input[beg+i];
	    	 }
	    	
	    	for(int i=0;i<lengthright;i++) {
	    		right[i] = input[mid+i+1];
	    	}
	    	
	    	left[lengthleft] = Integer.MAX_VALUE;
	    	right[lengthright] = Integer.MAX_VALUE;
	    	
	    	int leftpointer = 0;
	    	int rightpointer= 0;
	    	 
	    	for(int i=beg;i<=end;i++) {
	    		if(left[leftpointer] > right[rightpointer]) {
	    			input[i] = right[rightpointer];
	    			rightpointer++;
	    	}else {
	    			input[i] = left[leftpointer];
	    			leftpointer++;
	    		}
	    	}
	
	   }
	    
	    public static void main(String[] args) {
	    	
	    	int input[] = {90,23,101,45,65,23,67,89,34,23};  
	    	
	    	Merge_sort ob = new Merge_sort();
	    	ob.merge_sort(input,0,input.length-1);
	    	
	     	for(int i =0;i<input.length;i++) {
	        	System.out.println( input[i]);
	        
	     	}
	    	
	    	
	    	
	    }
	
	
	
}
