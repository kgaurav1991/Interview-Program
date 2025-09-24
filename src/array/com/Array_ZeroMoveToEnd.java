package array.com;

public class Array_ZeroMoveToEnd {
    public static void main(String[] args) {
        int ar[] = {0,1,0,2,0,0,1,7};
        int result[] = new int[ar.length];
        int index = 0;

        for(int i=0;i<ar.length;i++){
            if(ar[i]!=0){
                result[index++]=ar[i];
            }
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                result[index++]=ar[i];
            }
        }
        for(int num : result){
            System.out.print(num);
        }
    }
}
