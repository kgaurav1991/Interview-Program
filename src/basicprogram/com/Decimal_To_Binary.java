package basicprogram.com;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        int nun = 24;
        String binary = " ";

        while(nun>0){
            int rem = nun%2;
            binary = binary + rem;
            nun = nun/2;
        }
        System.out.println(binary);
    }
}
