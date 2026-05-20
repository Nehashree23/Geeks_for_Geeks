class Sol {
    int getCount(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        int count = 0;
        for(int val : map.values()) {
            if(val == k) {
                count++;
            }
        }

        return count;
    }
}
    