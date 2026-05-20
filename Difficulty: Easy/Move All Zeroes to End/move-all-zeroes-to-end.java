class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int t=arr[i];
                arr[i]=arr[c];
                arr[c]=t;
                c++;
            }
        }
    }
}