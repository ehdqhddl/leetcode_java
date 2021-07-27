import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        boolean[][] visit = new boolean[matrix.length][matrix[0].length];
        List<Integer> pathList = new ArrayList<Integer>();
        int x=0, y=0;
        pathList.add(matrix[0][0]);
        visit[0][0] = true;

        while(true){
            if(pathList.size() == matrix.length * matrix[0].length)
                break;

            while(true){
                if(y+1 >= matrix[0].length || visit[x][y+1] == true)
                    break;

                pathList.add(matrix[x][y+1]);
                visit[x][y+1] = true;
                y+=1;
            }

            while(true){
                if(x+1 >= matrix.length || visit[x+1][y] == true)
                    break;

                pathList.add(matrix[x+1][y]);
                visit[x+1][y] = true;
                x+=1;
            }

            while(true){
                if(y-1 < 0 || visit[x][y-1] == true)
                    break;

                pathList.add(matrix[x][y-1]);
                visit[x][y-1] = true;
                y-=1;
            }

            while(true){
                if(x-1 <0 || visit[x-1][y] == true)
                    break;

                pathList.add(matrix[x-1][y]);
                visit[x-1][y] = true;
                x-=1;
            }
        }
        return pathList;
    }
}
