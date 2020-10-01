package arrae;

public class problem {

    public static void main(String[] args) {
  
    int[] a=new int[] {1,2,3,4,5,6};
//    int[] b=new int[] {7,8,9,10,11,12};
    int[] c=new int[a.length];
     int  j = a.length;
    for(int i= 0;i<a.length;i++) {
   c[j-1]=a[i];
   j=j-1;
       }
    	
    	
//    	c[i]=a[i];
//    	a[i]=b[i];
//    	b[i] = c[i];
//    	for(int j=1;j<=a.length;j++) {
//    		int len = a.length-j;
//    		a[i]=a[len];
//    	}
     for(int i=0;i<a.length;i++) {
    	a[i]=c[i];
    	System.out.println(a[i]);
    	}
    
    }
  }



