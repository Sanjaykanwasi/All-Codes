import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindMissingandRepeatedValues {
    
    public static int[] FindMissingandRepeatedValues(int grid[][]){
        int n = grid.length;
        int a=0, b;
        int expSum = (n*n) * (n*n + 1) / 2;
        int actualSum = 0;


        HashSet<Integer> set = new HashSet<>();
        

        for(int i=-0; i<n; i++){
            for(int j=0; j<n; j++){
                actualSum += grid[i][j];
                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        b = expSum + a - actualSum;

        return new int[]{a, b};
    }
    
    public static void main(String[] args) {
        int grid[][] = {{9,1,7} , {8,9,2} , {3,4,6}};

        System.out.println(Arrays.toString(FindMissingandRepeatedValues(grid)));
    }
}
