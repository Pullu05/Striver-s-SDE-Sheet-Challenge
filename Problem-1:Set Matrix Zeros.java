import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int pos=-1;
            for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]==0){
                   pos= i;
                   a.add(j);
                }
             }
            if(pos>=0){
                Arrays.fill(matrix[pos],0);
            }
        }
        
         if(a.size()>0){
                for(int i=0;i<matrix.length;i++){
                    for(int j=0;j<a.size();j++)
                    matrix[i][a.get(j)]=0;
                } 
            }
         }
}    
