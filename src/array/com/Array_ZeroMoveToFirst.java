package array.com;

public class Array_ZeroMoveToFirst {
    public static void main(String[] args) {
        int ar[] = {6,1,2,0,0,3,0,7,0,9};
        int result[] = new int[ar.length];
        int index = 0;

        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                result[index++]=ar[i];
            }
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=0){
                result[index++]=ar[i];
            }
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}
