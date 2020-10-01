package arrae;

public class Bubble_sort {

	public static void main(String[] args) {

    	
      	
        int a[] = new int[] {3,4,2,0};
        	System.out.println(a.length);
        
        for(int i=0;i<a.length-1;i++) {
        	
        	boolean visited = false;
        	
        	for(int j=0;j+1<a.length - i;j++) {
        		if(a[j] > a[j+1]){    //descending order      // if (a[j] < a[number]) then it will be ascending order
        		
        		   visited = true ; 
        			int temp = a[j];
                	a[j] = a[j+1];
                	a[j+1] = temp;
                	 }
        		}
        	if(!visited) {
    			return;
    		}
        }
             System.out.println(a[0]);
    	

	}

}
