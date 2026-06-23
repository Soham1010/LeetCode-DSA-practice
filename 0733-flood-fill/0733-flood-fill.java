class Solution {
    private final int[] xd = {-1,1,0,0};
    private final int[] yd = {0,0,-1,1};

    private boolean is_valid(int r, int c, int mr, int mc){
        return (r>=0 && r<mr && c>=0 && c<mc);
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rows = image.length;
        int columns = image[0].length;

        boolean[][] visited = new boolean[rows][columns];
        int[][] imageClone = new int[rows][columns];

        for(int i=0;i<rows;i++){
            imageClone[i] = image[i].clone();
        }
    
        imageClone[sr][sc] = color;
        visited[sr][sc] = true;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr,sc});

        while(!queue.isEmpty()){
            int[] coordinate = queue.remove();
            int x = coordinate[0];
            int y = coordinate[1];

            for(int i=0;i<xd.length;i++){
                int nx = x + xd[i];
                int ny = y + yd[i];

                if(is_valid(nx,ny,rows,columns) && !visited[nx][ny] && image[x][y] == image[nx][ny]){
                    imageClone[nx][ny] = color;
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx,ny});
                }
            }

        }

        return imageClone;
    
    }
}