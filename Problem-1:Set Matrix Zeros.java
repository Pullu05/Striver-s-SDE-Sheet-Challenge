import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]==0){
                    a.add(j);
                   a1.add(i);
                }
            }
         }
        //System.out.println("col:"+a);
        //System.out.println("row:"+a1);
        
         if(a1.size()>0){
                for(int i=0;i<a1.size();i++){
                      Arrays.fill(matrix[a1.get(i)],0);
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
