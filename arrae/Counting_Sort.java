package arrae;

public class Counting_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,4,3,2};
		 int n = arr.length;
	int min  = 1;
	int max = n;
	int[] countArr = new int[n];
	
	for(int i = 0; i<n;i++) {
		
		countArr[arr[i] - min]++;
//		System.out.println(arr[i] - min);
	 }
	int j=0;
	for(int i =min;i<=max;i++) {

		while(countArr[i-min] > 0) {
			arr[j++]=i;
			System.out.println(countArr[i-min]);
			countArr[i-min]--;
		}
	}
	
	for(int r:arr) {
   	System.out.println("arr:"+r+" ");
   }
  
	}

}

