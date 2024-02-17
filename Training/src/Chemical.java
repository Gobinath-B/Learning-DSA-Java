import java.util.Arrays;
public class Chemical {
    public static void main(String[] args) {
    int count = 0;
    //        List <String> chemicals = Arrays.asList("init","maxii","innitt");
            String[] chemicals = {"init", "maxii", "ininitit"};
            for (int i = 0; i < chemicals.length; i++) {
                String z = chemicals[i] + chemicals[i];
                char[] zArray = z.toCharArray();
                Arrays.sort(zArray);
                z = new String(zArray);
                for (int j = 0; j < chemicals.length; j++) {
                    String x = chemicals[j];
                    char[] xArray = x.toCharArray();
                    Arrays.sort(xArray);
                    x = new String(xArray);
                    if (x.equals(z)){
                        count ++;
                    }
                }
            }
            System.out.println("count "+count);
 }
}
