import java.util.*; 

class Hello{
    public static void main(String[] args){
        int[][] a= {{1,2,3},{1,2,3},{1,2,3}}; 
        System.out.println(Count(a)); 
        
    }
    static List<int> Count(int[][] arr){
        List<Integer> list = new ArrayList<>(); 
        for(int i=0; i<arr.length ; i++){
            int sum = 0 ; 
            for(int j=0 ; j<arr[i].length ; j++){
                sum += arr[i][j]; 
            }
            list.add(sum);
        }
        return list;  
    }    
}

...........................................................................

class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int i=0; i< accounts.length ; i++){
            int sum  = 0 ; 
            for(int j=0 ; j< accounts[i].length ; j++){
                sum += accounts[i][j]; 
            }
            list.add(sum); 
        }
        
        Collections.sort(list);
        int last = list.size()-1;  
        int max = list.get(last);

        return max;
    }
}


--------------------------------------------------------------------------

  class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[2*n];
        int j = 0 ; 
        for(int i = 0 ; i< 2*n ; i= i+2){
            a[i] = nums[j]; 
            a[i+1] = nums[j+n]; 
            j++; 
        } 
        return a; 
    }
}

==============================================================================
  import java.util.*; 

class Hello{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        // different way to copy an array into another array 
        // int[] a1 = new int[arr.length]; 
        // for(int i=0 ; i<arr.length ; i++){
        //     a1[i] = arr[i];
        // }
        
        // System.out.println(Arrays.toString(a1)); 
        
        //2 nd way of copying array 
        
         int[] a2 = new int[arr.length]; 
         System.arraycopy(arr, 0, a2, 0, arr.length);
         System.out.println(Arrays.toString(a2)); 
         
        
    }
    
}
-----------------------------------------------


  
