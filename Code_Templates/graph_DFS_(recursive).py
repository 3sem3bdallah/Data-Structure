# For the graph templates, assume the nodes are numbered from 0 to n - 1 and the graph is given as an adjacency list.
# Depending on the problem, you may need to convert the input into an equivalent adjacency list before using the templates.

def fn(graph):
    def dfs(node):
        ans = 0
        # do some logic
        for neighbor in graph[node]:
            if neighbor not in seen:
                seen.add(neighbor)
                ans += dfs(neighbor)
        
        return ans
    
    START_NODE = 0 # Change this when implement
    seen = {START_NODE}
    return dfs(START_NODE)