// User function Template for Java

class Solution {
    // Complete the function
    // str: input string
    public static int countWords(String str) {
        // find and return the number of words
        // present in the string
        int count=1;
        for(char c:str.toCharArray()){
            if(c==' '){
                count+=1;
            }
        }
        return count;
    }
}