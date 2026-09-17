class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        boolean[]visited=new boolean[adj.size()];
        dfsHelp(0,adj,visited,res);
        return res;
    }
    private void dfsHelp(int node,
                               ArrayList<ArrayList<Integer>> adj,
                               boolean[] visited,
                               ArrayList<Integer> res) {
        
        visited[node]=true;
        res.add(node);
        for(int i=0;i<adj.get(node).size();i++){
            int p=adj.get(node).get(i);
            if(!visited[p]){
                dfsHelp(p,adj,visited,res);
            }
        }
}
}