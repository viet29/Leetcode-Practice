/*
 * @lc app=leetcode id=2192 lang=java
 *
 * [2192] All Ancestors of a Node in a Directed Acyclic Graph
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        // Initialize the result list
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<Integer>());
        }

        // Build the graph
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
        }

        // DFS to find all ancestors
        for (int i = 0; i < n; i++) {
            dfs(graph, i, i, res, new boolean[n]);
        }

        // for (int i = 0; i < n; i++) {
        // res.get(i).sort(Integer::compareTo);
        // }
        return res;
    }

    // DFS to find all ancestors
    private void dfs(ArrayList<Integer>[] graph, int parent, int curr, List<List<Integer>> res, boolean[] visit) {
        // Mark the current node as visited, and add the parent to the ancestor list
        visit[curr] = true;
        for (int dest : graph[curr]) {
            if (!visit[dest]) {
                res.get(dest).add(parent);
                dfs(graph, parent, dest, res, visit);
            }
        }
    }
}
// @lc code=end
