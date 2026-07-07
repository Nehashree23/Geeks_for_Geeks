
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int c=0;
        for(int e:arr){
            if(e<=x){
                c++;
            }
        }
        return c;
    }
}