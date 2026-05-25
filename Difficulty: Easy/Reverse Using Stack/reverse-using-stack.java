class Solution {
    public String reverse(String S) {
        // code here
        String res="";
        Stack<Character> st=new Stack<>();
        for(char c:S.toCharArray()){
            st.push(c);
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
}