public class matrix {
    public static void main(String[] args) {
        
        int [] [] mat1 = {{1,2,3},
                          {1,2,3}};
    
         int [] [] mat2 = {{1,2,3},
                          {1,2,3}};    
                          
         int [] [] matsum = {{0,0,0},
                          {0,0,0}};   

           for(int i = 0; i < mat1.length; i++){
            for(int j =0; j<mat1[i].length; j++) {
               System.out.format("Setting values for i=%d and j =%d\n",i,j);
                matsum [i] [j] = mat1 [i][j] + mat2[i] [j];
            }   
        }               

        for(int i = 0; i < mat1.length; i++){    
            for(int j =0; j<mat1[i].length; j++) {
                System.out.print(matsum[i][i] + " ");  
               matsum [i] [j] = mat1 [i][j] + mat2[i] [j];
            }
         

System.out.println("");
    }
    }
}
 