class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for (int num : b) {
            set.add(num);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (!set.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}