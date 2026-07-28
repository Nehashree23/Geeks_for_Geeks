class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int[] res=new int[2];
        int lc=0;
        int gc=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                lc++;
            }
            if(arr[i]>=target){
                gc++;
            }
        }
        res[0]=lc;
        res[1]=gc;
        return res;
    }
}