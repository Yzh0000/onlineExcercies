class Solution(object):
    def islandPerimeter(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        cells = 0
        neighbors = 0
        
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    cells += 1
                    if i -1 >= 0 and grid[i-1][j] == 1:
                        neighbors +=1
                    if j - 1 >= 0 and grid[i][j-1] == 1:
                        neighbors +=1
                    
        return cells * 4 - neighbors * 2
        # Java vs Python
        # && -- and 
        