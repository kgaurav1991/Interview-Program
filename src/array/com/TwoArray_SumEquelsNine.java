package array.com;

public class TwoArray_SumEquelsNine {
    public static void main(String[] args) {
        int ar[] = new int[]{1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
            if(ar[i]+ar[j] == 9) {
                sum = ar[i]+ar[j];
                System.out.println(ar[i]+" + "+ar[j]+" = "+sum);
                }
            }
        }
    }
}
