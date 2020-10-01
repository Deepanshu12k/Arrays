package arrae;

public class Selection_sort {

	public static void main(String[] args) {
		
	  	
	    int a[] = new int[] {3,4,2,1};
	    	
	    
	    for(int i=0;i<a.length-1;i++) {
	    	
	    	int number = i;
	    	
	    	for(int j=i+1;j<a.length;j++) {
	    		if(a[j] > a[number]){    //descending order      // if (a[j] < a[number]) then it will be ascending order
	    			number = j ;
	    		}
	    		}
	    	int temp = a[i];
	    	a[i] = a[number];
	    	a[number] = temp;
	    	}
	         System.out.println(a[0]);

	}

}
