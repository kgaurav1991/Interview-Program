package array.com;

import java.util.Scanner;

public class Array_SecondHightNumber {
    public  static void main(String args[]){
       int ar[] = {4,2,11,8,};
       int size=ar.length;

       for(int i=0;i<size;i++){
           for(int j=i+1;j<size;j++){
               if(ar[i]>ar[j]){
                   int temp=ar[i];
                   ar[i]=ar[j];
                   ar[j]=temp;
               }
           }
       }
        System.out.println(ar[size-2]);
    }
}
