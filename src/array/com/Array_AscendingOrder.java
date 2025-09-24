package array.com;

import java.util.Arrays;

public class Array_AscendingOrder {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5};
        /*
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
         */
        int size=ar.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(ar[i]>ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
            System.out.println(ar[i]);
        }
    }
}
