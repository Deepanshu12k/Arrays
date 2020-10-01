package arrae;
//easy merge_sort
public class Sorting{
    public static void main(String[] args){
        int[] arr={4,3,6,2,8,4,3};
        int l=0;
        int r = arr.length-1;
        Sorting call = new Sorting(); 
        call.merge_sort(arr, l , r);
        
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    
        
    }
    void merge_sort(int[] arr,int beg,int last){
        
        if(beg<last){
            int mid = (beg+last)/2;
         
         merge_sort(arr,beg,mid);
         merge_sort(arr,mid+1,last);
         
         merge(arr, beg, mid, last);
        
            
        }
        
    }
   void merge(int[] arr,int beg,int mid, int last){
        
    int l = mid-beg+1;
    int r = last-mid;
    
    int[] left=new int[l];
    int[] right = new int[r];
//    putting elements in left and right array
    for(int i = 0;i<l;i++){
        left[i]= arr[i+beg];
    }
    for(int j = 0;j<r;j++){
        right[j]= arr[mid+1+j];
    }
    int i = 0; int j=0;int k=beg;
//    inserting elements to array (arr) by comparing left and right
    while(i<l && j<r){
        if(left[i]<=right[j]){
            arr[k]=left[i];
            i++;
        }else{
            arr[k]=right[j];
            j++;
        }
        k++;
    }
//    only inserting leftover elements because they are already sorted 
    while(i<l){
        arr[k]=left[i];
        i++; k++;
    }
    while(j<r){
        arr[k]=right[j];
        j++;k++;
    }
    
    }
    
    
}