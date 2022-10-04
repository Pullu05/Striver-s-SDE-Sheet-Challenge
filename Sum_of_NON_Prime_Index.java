public class Sum_of_NON_Prime_Index {
    public static boolean isNONPrime(int n) {
        if(n<=1){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int input1[]={-4,-2};
        int input2=2;
        int ans=0;
        for(int i=0;i<input2;i++){
            if(isNONPrime(i)){
                ans+=input1[i];
            }
        }
        System.out.println(ans);
    }
}
