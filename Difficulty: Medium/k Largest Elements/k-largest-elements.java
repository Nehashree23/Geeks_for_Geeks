class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // code here
        ArrayList<Integer> r=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=arr.length-k;i--){
            r.add(arr[i]);
        }
        return r;
    }
}
