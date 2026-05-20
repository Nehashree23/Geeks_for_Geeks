import java.util.*;
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
       char p[]=s1.toCharArray();
       char q[]=s2.toCharArray();
       Arrays.sort(p);
       Arrays.sort(q);
       return Arrays.equals(p,q);
    }
}