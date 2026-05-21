class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int minp=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int p:prices){
            minp=Math.min(minp,p);
            maxprofit=Math.max(maxprofit,p-minp);
        }
        return maxprofit;
    }
}