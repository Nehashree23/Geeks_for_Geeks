class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
       ArrayList<Integer> l = new ArrayList<>();

               boolean[] visited = new boolean[adj.size()];

               Queue<Integer> q = new LinkedList<>();

               q.add(0);
               visited[0] = true;

               while (!q.isEmpty()) {

                   int c = q.poll();

                   l.add(c);

                   for (int i = 0; i < adj.get(c).size(); i++) {

                       int neighbour = adj.get(c).get(i);

                       if (!visited[neighbour]) {

                           visited[neighbour] = true;

                           q.add(neighbour);
                       }
                   }
               }

               return l;
    }
}