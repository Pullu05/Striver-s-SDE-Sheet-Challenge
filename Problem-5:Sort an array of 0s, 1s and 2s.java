class Solution {
    public void sortColors(int[] nums) {
        int num0=0,num1=0,num2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) num0++;
            else if(nums[i]==1) num1++;
            else if(nums[i]==2) num2++;
        }
        
        for(int i=0;i<num0;i++) nums[i]=0;
        for(int j=0;j<num1;j++) nums[num0+j]=1;
        for(int k=0;k<num2;k++) nums[num0+num1+k]=2;
    }
}
