class Solution {
    int missingNum(int arr[]) {
        // code here
       long s=0;
        long l=arr.length+1;
        for(long e:arr){
            s+=e;
        }
        return (int)(((l*(l+1))/2)-s);
    }
}