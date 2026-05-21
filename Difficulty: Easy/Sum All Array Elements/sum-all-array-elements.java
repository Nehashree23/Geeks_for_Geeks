class Solution {
    public int arraySum(List<Integer> arr) {
        // code here
        int s=0;
        for(int e:arr){
            s+=e;
        }
        return s;
    }
};