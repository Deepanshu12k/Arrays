package arrae;
//import java.util.*;
public class Shell_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Scanner scan = new Scanner(System.in);
     int n = 4;
     
     String[] array = {"r","m","r","m"};
//    scan.close();
//     for(int i = 0 ;i< array.length;i++) {
//    	 array[i]= scan.nextLine();
////    	 System.out.print(array[i]);
//     }
     Shell_Sort.leftrot(array);
   
     for(int i = 0 ;i< array.length;i++) {

    	 System.out.println(array[i]);
    	 
     }
//     System.out.println(array[array.length-1]);
//	scan.close(); 
	
	}
	
	public static void leftrot(String[] array) {
		  String temp = array[0];
//		  System.out.println(temp);
		     for(int i = 0 ;i<= array.length-2;i++) {
		    	 array[i]= array[i+1];
		    	 }
		     
		   array[array.length-1] = temp;
	}

}
