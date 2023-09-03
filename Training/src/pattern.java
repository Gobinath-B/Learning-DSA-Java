public class pattern {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n ; i++) {
          if(i <n) {
              System.out.print(i+",");
          }
          else if(i==n){
              System.out.println(i);
          }
        }
    }
}
