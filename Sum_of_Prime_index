public class Sum_of_Prime_index {
    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int input1[]={-4,-5};
        int input2=2;
        int ans=0;
        for(int i=0;i<input2;i++){
            if(isPrime(i)){
                ans+=input1[i];
            }
        }
        System.out.println(ans);
    }
}
