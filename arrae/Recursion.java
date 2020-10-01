package arrae;

public class Recursion {
	
	public static void main(String []args){
	      
	      System.out.print(factorial(4));
	      	
	}
    
	public static int factorial(int n){
	     
		System.out.println(n);
	       if(n<=1){
	    	   System.out.println(n);
	           return 1;
	       }else{
	    	   int result = factorial(n-1);
	    	   System.out.println(result);
	           return n*result;
	       }
	}


}
	