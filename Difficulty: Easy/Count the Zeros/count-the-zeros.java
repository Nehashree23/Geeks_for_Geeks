class Solution {
    int countZeroes(int[] arr) {
        // code here
        int c=0;
        for(int e:arr){
            if(e==0){
                c+=1;
            }
        }
        return c;
    }
}
