
public class Armstrong {
    public static void main(String[] args) {
        int num = 372;
        int Originalnum = num;
        int count=0;
        while(num!=0){
            num = num/10;
            count +=1;
        }
        int len = count;
        Arms(Originalnum,len);


    }

    static void Arms(int n,int len){
        int sum =0;
        int temp,dig =0;
        temp = n;
        while(temp >0){
            dig = temp%10;

            sum += (int)Math.pow(dig,len);

            temp= temp/10;
        }
        System.out.println(sum);
        if(n == sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not Armstrong");
        }
    }
}
