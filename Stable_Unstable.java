import java.util.ArrayList;

public class Stable_Unstable {
    public static boolean isStable(int n) {
        int num[]=new int[10];
        while(n!=0){
            num[n%10]++;
            n/=10;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++){
            if(num[i]>0){
                arr.add(num[i]);
            }
        }
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)!=arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int input1=12, input2=1313, input3=122, input4=678, input5= 898;
        int a[]={input1,input2,input3,input4,input5};

        int max_stable=Integer.MIN_VALUE;
        int min_stable= Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            if(isStable(a[i])){
                max_stable= a[i]>max_stable?a[i]:max_stable;
                min_stable= a[i]<min_stable?a[i]:min_stable;
            }
        }

        System.out.println(max_stable-min_stable);
    }
}
