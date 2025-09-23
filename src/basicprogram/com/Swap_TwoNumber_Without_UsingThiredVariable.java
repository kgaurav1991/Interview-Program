package basicprogram.com;

public class Swap_TwoNumber_Without_UsingThiredVariable {
    public static void main(String[] args) {
        int a=2, b=3;
        /*
        a = a+b;
        b = a-b;
        a = a-b;
       */
        //or
      //  a = (a+b) - (b = a);
        //or

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a+" Swap TwoNumber Without Using Thired Variable "+b);
    }
}
