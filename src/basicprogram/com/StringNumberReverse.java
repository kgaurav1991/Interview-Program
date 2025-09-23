package basicprogram.com;

public class StringNumberReverse {
    public static void main(String[] args) {
        String str1 = "1234";
        int num = Integer.parseInt(str1);
        int sum =0;

        while(num!=0){
            int rem = num%10;
            sum = sum*10+rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}
