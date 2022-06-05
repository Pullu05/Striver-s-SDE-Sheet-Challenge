import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{    
    public static ArrayList<Integer> Reverse(ArrayList<Integer> arr,int k) {
        int i=k;
        int j=arr.size()-1;
        while(j>=i){
            Collections.swap(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) 
	{  
        if(arr.size()>1){
              int input1=0;
              int input2=0;
        
              for(int i=arr.size()-1;i>0;i--){
                    if(arr.get(i)>arr.get(i-1)){
                        input1= i-1;
                        break;
                    }
               }
        
              for(int i=arr.size()-1;i>=0;i--){
                   if(arr.get(i)>arr.get(input1)){
                        input2=i;
                        break;
                   }
              }
        
             Collections.swap(arr,input1,input2);
          
             if(input1==0&&input2==0){
                 return Reverse(arr,0);
             }else{
                  return Reverse(arr,input1+1);
             }
           
        }else{
            return arr;
        }
        
        
     }
    
}
