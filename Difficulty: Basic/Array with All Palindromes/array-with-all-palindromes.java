class Solution {
    
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int i=0;i<arr.length;i++){
            int res=reverse(arr[i]);
            if(res!=arr[i]){
                return false;
            }
            
        }
        return true;
        
    }
    public static int reverse(int n) {
        int t=n;
        int r=0;
        while(t!=0){
            int d=t%10;
         r=r*10+d;
            t/=10;
        }
        return r;
    }
}