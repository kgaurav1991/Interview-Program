package basicprogram.com;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 7;
        /*
        if(num%2==0)
            System.out.println(num+" is a Prime Number");
        else
            System.out.println(num+" is not a Prime Number");
         */
        for(int i=2;i<=num;i++){
            boolean flag = false;
            for (int j = 2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(i+" is a prime number");
            }

        }
    }
}
