class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for (char c : s.toCharArray()) {
            if (m.get(c) == 1) {
                return c;
            }
        }

        return '$';
        
    }
}
