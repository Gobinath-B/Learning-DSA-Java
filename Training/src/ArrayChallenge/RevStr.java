package ArrayChallenge;

public class RevStr {

    public static void main(String[] args) {
        String s = "Prince";
        int k =2;
        System.out.println(reverseStr(s,k));
    }
        public static String reverseStr(String s, int k) {
            char[] str = s.toCharArray();
            int n = str.length;
            for(int i = 0 ; i <= n-1; i += 2*k){
                if(i+k-1 <= n-1){
                    reverseK(i,i+k-1,str);
                }else{
                    //for fewer than k characters left (edge case)
                    reverseK(i,n-1,str);
                }
            }
            String ans = new String(str);
            return ans;
        }
        public static void reverseK(int i, int j, char[] str){
            while(i < j){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }

}
