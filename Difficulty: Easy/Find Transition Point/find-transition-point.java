class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int s=0;
        for(int i=0;i<arr.length;i++){
                s+=arr[i];
                if(s==1){
                    return i;
                }
            
        }
        return -1;
    }
}