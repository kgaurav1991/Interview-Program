package array.com;

import java.util.Arrays;
import java.util.Collections;

public class Array_DescendingOrder {
    public static void main(String[] args) {
        /*
        Integer ar[] = {4,1,3,2,9};
        Arrays.sort(ar, Collections.reverseOrder());
        System.out.println(Arrays.toString(ar));
         */
        int ar[] = {4,1,3,2,9};
        int size =ar.length;
        System.out.println("Descending Order :");
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(ar[i]<ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
            System.out.print(ar[i]);
        }
    }
}
