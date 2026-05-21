class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;

        HashMap<Integer, Integer> h = new HashMap<>();
        for (int e : arr) {
            h.put(e, h.getOrDefault(e, 0) + 1);
        }
        ArrayList<Integer> r = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        for (int e : arr) {
            if (!seen.contains(e)) {
                r.add(h.get(e));
                seen.add(e);
            }
        }

        return r;
    }
}