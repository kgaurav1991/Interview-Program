package basicprogram.com;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int n1=0,n2=1,n,count=7;

        System.out.print(n1+"\n"+n2+"\n");
        for(int i=1;i<=count;i++){
            n = n1+n2;
            System.out.println(n);
            n1=n2;
            n2=n;
        }
    }
}
