import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.math.*;

public  class Solution {
    
    public static BigInteger fact(int n){
      BigInteger fac=new BigInteger("1");
        for(int i=2;i<=n;++i){
            fac=fac.multiply(BigInteger.valueOf(i));
        }
        return fac;
      }


    public static long comb(int n,int r){
         BigInteger A=new BigInteger(fact(n).toString());
         BigInteger B=new BigInteger(fact(r).toString());
         BigInteger C=new BigInteger(fact(n-r).toString());
         BigInteger D = A.divide(B.multiply(C));
        
         long ans = D.longValue();
         return ans;
    }
    
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                
	ArrayList<ArrayList<Long>> a = new ArrayList<ArrayList<Long>>();
        
        for(int i=0;i<n;i++){
            a.add(new ArrayList<>());
              for(int j =0;j<i+1;j++){
                  a.get(i).add(comb(i,j));    
              }
        } 
       
        return a;
    }
}
