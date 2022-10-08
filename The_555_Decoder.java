public class The_555_Decoder {
    public static void main(String[] args) {
        int input1[]={179,8,379,218,610};
        int ans=0;
        for(int i=0;i<input1.length;i++){
            String s ="" +input1[i];
            String s1="";
            for(int j=0;j<s.length();j++){
                s1+=(int)Math.abs((s.charAt(j)-'0')-5);
            }

            int n = Integer.parseInt(s1);
            ans+=sum(n);
            System.out.println(n+"----->"+sum(n));
        }
        System.out.println(ans);

    }
    public static int sum(int n){
        
        while(n>9){
            int last=n%10;
            n=n/10;
            n=n+last;
        }
        return n;
    }
}
